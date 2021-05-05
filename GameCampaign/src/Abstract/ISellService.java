package Abstract;

import Entities.Campaign;
import Entities.Game;
import Entities.Gamer;

public interface ISellService {
	void allWithCampaignBuy(Gamer gamer,Game game,Campaign campaign);
	void withoutBuy(Gamer gamer, Game game);
}
