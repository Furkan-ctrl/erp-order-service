package com.erp.order_service.repository;

import com.erp.order_service.model.EventStatus;
import com.erp.order_service.model.OutboxEvent;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface OutboxEventRepository extends JpaRepository<OutboxEvent, Long> {
    List<OutboxEvent> findByStatus(EventStatus status);
}
