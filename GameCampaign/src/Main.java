import Concrete.CampaignManager;
import Concrete.GameManager;
import Concrete.GamerManager;
import Concrete.MernisManager;
import Concrete.OrderManager;
import Concrete.SellManager;
import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;
import Entities.Order;

public class Main {

	public static void main(String[] args) {
		CampaignManager campaignManager=new CampaignManager();
		GameManager gameManager =new GameManager();
		GamerManager gamerManager = new  GamerManager(new MernisManager());
		OrderManager orderManager =new OrderManager();
		SellManager sellManager =new SellManager(new OrderManager());
		
		Campaign kampanya1=new Campaign (3,"test kampanya",100);
		Game game1 =new Game(1,"LOL",25);

		//gameManager.delete(1);
		//campaignManager.delete(2);
		//campaignManager.update(kampanya1);
		//campaignManager.delete(2);	
		
		Gamer can=new Gamer(4, "123565487","Ali Can","Güneş",1997);
		
		gamerManager.add(can);
		
		Order order=new Order(1,2,3,4,5,50,25,75);
		orderManager.delete(3);
		//orderManager.update(order);
		//orderManager.delete(2);
		
		//sellManager.buy(can, game1); 
		//sellManager.buy(can, game1, kampanya1);
		
	}

}
