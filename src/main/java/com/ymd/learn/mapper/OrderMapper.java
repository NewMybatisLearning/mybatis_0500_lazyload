package com.ymd.learn.mapper;

import com.ymd.learn.model.Order;
import com.ymd.learn.model.User;

public interface OrderMapper {

	public Order getOrderById(int orderId);
	
	public User getUserById(int userId);
}
