package com.order.service;

import com.order.dto.Orders;
import com.order.exception.OrderException;

public interface OrderInfoService {
	
	Orders getOrderInfoOfUser(Long userId) throws OrderException;

}
