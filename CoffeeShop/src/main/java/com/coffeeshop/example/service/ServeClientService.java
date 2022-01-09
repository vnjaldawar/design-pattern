package com.coffeeshop.example.service;

import java.util.ArrayList;
import java.util.List;

public class ServeClientService {
	
	public void placeOrder(List<String> orderList) {
		PrepareOrderService prep = new PrepareOrderService();
		
		List<String> itemList = new ArrayList<>();
		for (String order : orderList) {
			System.out.println("----------------------------");
			String item = prep.prepareOrder(order);
			itemList.add(item);
		}
		System.out.println("----------------------------");
		DeliverOrderService del = new DeliverOrderService();
		String deliveryItem = del.deliverOrder(itemList);
		System.out.println(deliveryItem);
	}

}
