package Concrete;

import java.util.*;

import Abstract.ICampaignService;
import Entities.Campaign;

public class CampaignManager implements ICampaignService{

	private List<Campaign> campaigns = new ArrayList<Campaign>();
	
	public CampaignManager() {
		Campaign campaign1 = new Campaign(1, "Y�zde Yirmi", 20);
		Campaign campaign2 = new Campaign(2, "Y�zde Yirmi Be�", 25);
		Campaign campaign3 = new Campaign(3, "Y�zde K�rk", 40);
		
		campaigns.add(campaign1);
		campaigns.add(campaign2);
		campaigns.add(campaign3);
	}
	
	@Override
	public void add(Campaign campaign) {
		printAllItems();
		campaigns.add(campaign);
		printAllItems();
	}

	@Override
	public void update(Campaign campaign) {
		Campaign campaignItemUpdate = campaigns.stream()
									.filter(c->c.getId() == campaign.getId())
									.findFirst()
									.orElse(null);		
		
		if(campaignItemUpdate != null) {
			System.out.println("Bulundu: "+campaignItemUpdate.getId() + " " + campaignItemUpdate.getCampaignName() + " " + campaignItemUpdate.getDiscountRate());
			campaignItemUpdate.setCampaignName(campaign.getCampaignName());
			campaignItemUpdate.setDiscountRate(campaign.getDiscountRate());
			System.out.println("G�ncellendi: "+ campaignItemUpdate.getId() + " " + campaignItemUpdate.getCampaignName() + " " + campaignItemUpdate.getDiscountRate());

		}else {
			System.out.println("Bulunamad�");
		}
		
	}

	@Override
	public void delete(int campaignId) {
		Campaign campaignDeleteItem = campaigns.stream()
									.filter(c->c.getId()==campaignId)
									.findFirst()
									.orElse(null);
		
		if(campaignDeleteItem != null) {
			printAllItems();
			
			System.out.println("Silindi: "+campaignDeleteItem.getId() + " " + campaignDeleteItem.getCampaignName() + " " + campaignDeleteItem.getDiscountRate());
			campaigns.remove(campaignDeleteItem);
			
			printAllItems();
		}else {
			System.out.println("Bulunamad�");
		}
	}

	@Override
	public void printAllItems() {
		
		System.out.println("-----------------------------------------");
    	for (Campaign campaign : campaigns) {
			System.out.println(campaign.getId() + " " + campaign.getCampaignName() + " " + campaign.getDiscountRate());
		}
    	System.out.println("-----------------------------------------");
		
	}

}
