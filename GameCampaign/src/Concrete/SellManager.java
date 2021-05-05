package Concrete;

import Abstract.IOrderService;
import Abstract.ISellService;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Entities.Order;

public class SellManager implements ISellService{
	
	private IOrderService orderService;
	
	public SellManager(IOrderService orderService) {
		this.orderService = orderService;
	}
	
	@Override
	public void allWithCampaignBuy(Gamer gamer, Game game, Campaign campaign) {
		int discountAmount=game.getGamePrice()*(campaign.getDiscountRate()/100);
		int amountOfPayment = game.getGamePrice() - discountAmount;
		Order order =new Order(1,gamer.getId(),game.getId(), campaign.getId(),1,game.getGamePrice(),
				discountAmount,amountOfPayment);
		
		orderService.add(order);	
	}

	@Override
	public void withoutBuy(Gamer gamer, Game game) {
		
		Order order = new Order();
		order.setId(1);
		order.setAmountOfPayment(game.getGamePrice());
		order.setCount(1);
		order.setGameId(game.getId());
		order.setGamerId(gamer.getId());
		order.setTotalAmount(game.getGamePrice());		
		orderService.add(order);		
	}

}
