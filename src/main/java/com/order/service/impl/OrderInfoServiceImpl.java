package com.order.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.order.dto.OrderInfo;
import com.order.dto.Orders;
import com.order.service.OrderInfoService;

@Service
public class OrderInfoServiceImpl implements OrderInfoService {

	@Override
	public Orders getOrderInfoOfUser(Long userId) {

		List<OrderInfo> orderInfoList1 = new ArrayList<>();

		OrderInfo order1 = new OrderInfo();
		order1.setOrderAmount(100);
		order1.setOrderDate("24-10-2000");
		order1.setOrderId("1");

		OrderInfo order2 = new OrderInfo();
		order2.setOrderAmount(100);
		order2.setOrderDate("23-11-2002");
		order2.setOrderId("2");

		orderInfoList1.add(order2);
		orderInfoList1.add(order1);

		return new Orders(orderInfoList1);
	}

}
