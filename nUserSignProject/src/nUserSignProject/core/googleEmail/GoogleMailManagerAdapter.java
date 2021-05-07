package nUserSignProject.core.googleEmail;

import nUserSignProject.core.EmailService;
import nUserSignProject.googleMail.GoogleMailManager;

public class GoogleMailManagerAdapter implements EmailService{

	private GoogleMailManager googleMailManager;
	
	public GoogleMailManagerAdapter() {
		super();
		this.googleMailManager = new GoogleMailManager();
	}

	@Override
	public void send(String email, String message) {
		googleMailManager.send(email, message);
	}

}
