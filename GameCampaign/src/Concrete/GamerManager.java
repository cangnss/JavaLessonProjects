package Concrete;

import java.util.*;

import Abstract.IGamerCheckService;
import Abstract.IGamerService;
import Entities.Gamer;

public class GamerManager implements IGamerService{
	
	private IGamerCheckService gamerCheckService;
	private List<Gamer> gamers = new ArrayList<Gamer>();
	
	public GamerManager(IGamerCheckService gamerCheckService) {
		this.gamerCheckService = gamerCheckService;
		
		Gamer gamer1 = new Gamer(1,"1231232","Ali Can","G�ne�",1997);
		Gamer gamer2 = new Gamer(2,"1231223","Kadir","S���t",1997);
		Gamer gamer3 = new Gamer(3,"7895235","Murat","Bilge",1997);
		
		gamers.add(gamer1);					
		gamers.add(gamer2);		
		gamers.add(gamer3);
	}
	@Override
	public void add(Gamer gamer) {
		if(gamerCheckService.check(gamer)) {					
			printAllItems();		
			gamers.add(gamer);		
			printAllItems();		
		}
		else {
			System.out.println("Do�rulanamad�!");
		}
	}

	@Override
	public void update(Gamer gamer) {

		printAllItems();
		
        Gamer gamerUpdateItem = gamers.stream()                
        		.filter(g -> g.getId() == gamer.getId())
                .findFirst()
                .orElse(null);
        
        if(gamerUpdateItem != null){
        	System.out.println("Bulundu: " + gamerUpdateItem.getFirstName());
        	
        	gamerUpdateItem.setTcno(gamer.getTcno());
        	gamerUpdateItem.setLastName(gamer.getLastName());
        	gamerUpdateItem.setFirstName(gamer.getFirstName());
        	gamerUpdateItem.setLastName(gamer.getLastName());
        	gamerUpdateItem.setDateOfBirth(gamer.getDateOfBirth());

        	System.out.println("G�ncellendi: "+ gamerUpdateItem.getFirstName());  
        	printAllItems();
        }
        else {
        	System.out.println("Bulunamad�.");
        }	
	}

	@Override
	public void delete(int gamerId) {

		Gamer gamerToDelete = gamers.stream()                
        		.filter(s -> s.getId() == gamerId)
                .findFirst()
                .orElse(null);
		
        if(gamerToDelete != null){
        	System.out.println("Silindi: "+ gamerToDelete.getFirstName());
        	gamers.remove(gamerToDelete);
        	printAllItems();
        
        }
        else {
        	System.out.println("Bulunamad�.");
        }		
	}

	@Override
	public void printAllItems() {
		
		System.out.println("-----------------------------------------");
    	for (Gamer item : gamers) {
			System.out.println(item.getFirstName());
		}
    	System.out.println("-----------------------------------------");	
	}

}
