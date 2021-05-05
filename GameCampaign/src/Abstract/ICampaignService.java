package Abstract;

import Entities.Campaign;

public interface ICampaignService {
	void add(Campaign campaign);
	void update(Campaign campaign);
	void delete(int campaignId);
	void printAllItems();
}
