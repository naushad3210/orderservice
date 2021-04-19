package com.order.controller;

import static com.order.contant.Constants.ORDER_SERVICE_API_PATH;
import static com.order.contant.Constants.USER_ID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.order.dto.Orders;
import com.order.exception.OrderException;
import com.order.service.OrderInfoService;

import lombok.extern.slf4j.Slf4j;

@RestController
@Slf4j
@RequestMapping(value = ORDER_SERVICE_API_PATH)
public class OrderController {
	
	@Autowired
	private OrderInfoService userInfoService;

	@GetMapping(path = "/user/{userId}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Orders> getOrders( @PathVariable(value = USER_ID) Long userId)
			throws OrderException {
		log.info("GET | ORDER | user id: {}", userId);
		
		Orders orders = userInfoService.getOrderInfoOfUser(userId);
		
		log.debug("GET | ORDER | SUCCESS");
		return ResponseEntity.ok(orders);
	}

}
