package com.erp.order_service.dto;

import lombok.Data;
import java.math.BigDecimal;

@Data
public class ProductStockResponse {
    private Long id;
    private String name;
    private String sku;
    private BigDecimal price;
    private Integer stockQty;
    private boolean active;
}