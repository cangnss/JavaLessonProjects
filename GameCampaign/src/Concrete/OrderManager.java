package Concrete;

import java.util.*;
import Abstract.IOrderService;
import Entities.Order;

public class OrderManager implements IOrderService{
	
	private List<Order> orders = new ArrayList<Order>();
	
	public OrderManager() {
		Order order1 = new Order(1, 1, 1, 1, 2, 90, 50, 45);
		Order order2 = new Order(2, 2, 2, 2, 2, 100, 25, 75);
		Order order3 = new Order(3, 3, 3, 3, 2, 200, 75, 50);

		orders.add(order1);
		orders.add(order2);
		orders.add(order3);
	}
	
	@Override
	public void add(Order order) {
		orders.add(order);
		printAllItems();
	}

	@Override
	public void update(Order order) {
		Order orderUpdateItem = orders.stream()
								.filter(o->o.getId() == order.getId())
								.findFirst()
								.orElse(null);
		
		if(orderUpdateItem != null) {
			
			orderUpdateItem.setGamerId(order.getGamerId());
			orderUpdateItem.setGameId(order.getGameId());
			orderUpdateItem.setCampaignId(order.getCampaignId());
			orderUpdateItem.setDiscountAmount(order.getDiscountAmount());
			orderUpdateItem.setTotalAmount(order.getTotalAmount());
			orderUpdateItem.setCount(order.getCount());
			orderUpdateItem.setAmountOfPayment(order.getAmountOfPayment());
			orderUpdateItem.setId(order.getId());
			
			printAllItems();
		}else {
			System.out.println("bulunamadý");
		}
	}

	@Override
	public void delete(int orderId) {
		Order orderDeleteItem = orders.stream()
								.filter(o->o.getId() == orderId)
								.findFirst()
								.orElse(null);
		
		if(orderDeleteItem != null) {
			printAllItems();
        	orders.remove(orderDeleteItem);        	
        	printAllItems();
		}else {
			System.out.println("silinmedi");
		}
	}

	@Override
	public void printAllItems() {
		System.out.println("-----------------------------------------");
    	for (Order item : orders) {
			System.out.println("Id: " + item.getId() + " GamerId: " + item.getGamerId() + " GameId: " + item.getGameId() 
			+ " CampaignId: " + item.getCampaignId() + " AmountOfPayment:" + item.getAmountOfPayment() + " DiscountAmount:" + item.getDiscountAmount() +
			" Count:" + item.getCount() + " TotalAmount:" + item.getTotalAmount());
		}
    	System.out.println("-----------------------------------------");		
	}

}
