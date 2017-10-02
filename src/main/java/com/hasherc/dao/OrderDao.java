package com.hasherc.dao;

import com.hasherc.entity.Order;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface OrderDao {
    int insertOrder(Order order);

    int deleteOrder(String orderUUID);

    List<Integer> finUndoOrder(String uuid);

    List<Order> getUnPaidOrder(String uuid);
}