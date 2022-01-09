package com.coffeeshop.example.service;

import java.util.List;
import java.util.stream.Collectors;

public class DeliverOrderService {
	
	public String deliverOrder(List<String> itemList) {
		String items = itemList.stream().collect(Collectors.joining(", "));
		return items;
	}
}
