package nUserSignProject.core.amazonEmail;

import nUserSignProject.amazonEmail.AmazonMailManager;
import nUserSignProject.core.EmailService;

public class AmazonMailManagerAdapter implements EmailService{
	
		private AmazonMailManager amazonMailManager;
		
		public AmazonMailManagerAdapter() {
			super();
			this.amazonMailManager = new AmazonMailManager();
		}

		@Override
		public void send(String email, String message) {
			amazonMailManager.send(email, message);
		}

	
}
