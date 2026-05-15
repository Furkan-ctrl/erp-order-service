package com.erp.order_service.util;

import com.erp.order_service.exception.OrderException;
import jakarta.servlet.http.HttpServletRequest;
import org.springframework.http.HttpStatus;

public class RequestContext {

    public static String getUserId(HttpServletRequest request) {
        return request.getHeader("X-User-Id");
    }

    public static String getUserEmail(HttpServletRequest request) {
        return request.getHeader("X-User-Email");
    }

    public static String getRoles(HttpServletRequest request) {
        return request.getHeader("X-User-Roles");
    }

    public static void requireAdmin(HttpServletRequest request) {
        String roles = getRoles(request);
        if (roles == null || !roles.contains("ADMIN")) {
            throw new OrderException(
                    "Access denied: ADMIN role required",
                    HttpStatus.FORBIDDEN
            );
        }
    }
}