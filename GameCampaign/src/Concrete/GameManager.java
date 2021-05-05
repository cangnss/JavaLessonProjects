package Concrete;

import java.util.*;

import Abstract.IGameService;
import Entities.Game;

public class GameManager implements IGameService{

	private List<Game> games = new ArrayList<Game>();
	
	
	public GameManager() {
		
		Game game1 = new Game(1, "Valorant", 50);
		Game game2 = new Game(2, "Metin2", 1000);
		Game game3 = new Game(3, "CSGO", 40);
		Game game4 = new Game(4, "PUBG", 50);
		
		games.add(game1);
		games.add(game2);
		games.add(game3);
		games.add(game4);
		
	}
	
	
	@Override
	public void add(Game game) {
		printAllItems();
		games.add(game);
		printAllItems();
	}

	@Override
	public void update(Game game) {
		Game gameUpdateItem = games.stream()
							.filter(g->g.getId() == game.getId())
							.findFirst()
							.orElse(null);
		
		if(gameUpdateItem != null) {
			System.out.println("Bulundu: " + gameUpdateItem.getId() + " " +  gameUpdateItem.getGameName() + gameUpdateItem.getGamePrice());
			
			gameUpdateItem.setGameName(game.getGameName());
			gameUpdateItem.setGamePrice(game.getGamePrice());
			
			System.out.println("Güncellendi: " + gameUpdateItem.getId() + " " +  gameUpdateItem.getGameName() + gameUpdateItem.getGamePrice());

		}
		
	}

	@Override
	public void delete(int gameId) {

		Game gameDeleteItem = games.stream()
							.filter(g->g.getId() == gameId)
							.findFirst()
							.orElse(null);
		
		if(gameDeleteItem != null) {
			printAllItems();
			
			System.out.println("Silindi: " + gameDeleteItem.getId() + " " + gameDeleteItem.getGameName() + " " + gameDeleteItem.getGamePrice());
			games.remove(gameDeleteItem);
		}else {
			System.out.println("Silinemedi.");
		}
	}

	@Override
	public void printAllItems() {
		System.out.println("-----------------------------------------");
    	for (Game game : games) {
			System.out.println(game.getId() + " " + game.getGameName() + " " + game.getGamePrice());
		}
    	System.out.println("-----------------------------------------");		
	}

}
