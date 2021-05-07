package nUserSignProject;

import nUserSignProject.business.abstracts.UserService;
import nUserSignProject.business.concretes.AuthManager;
import nUserSignProject.business.concretes.UserManager;
import nUserSignProject.core.amazonEmail.AmazonMailManagerAdapter;
import nUserSignProject.core.googleEmail.GoogleMailManagerAdapter;
import nUserSignProject.dataAccess.concretes.HUserDao;
import nUserSignProject.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		//UserManager userManager=new UserManager(new InMemoryUserDao(), new AmazonMailManagerAdapter());
				User can=new User(4, "Can", "Güneþ", "cgunes1152@gmail.com", "123654", true);
				//userManager.add(can);
				
				User alperen = new User(2, "Alperen", "Bozkurt", "alperenbozkurt@gmail.com", "147258", false);
				//userManager.update(alperen);
				
				HUserDao inMemoryUserDao = new HUserDao();
				GoogleMailManagerAdapter googleMailManagerAdapter = new GoogleMailManagerAdapter();
				AmazonMailManagerAdapter amazonMailManagerAdapter = new  AmazonMailManagerAdapter();

				
				AuthManager authManager =new AuthManager(new UserManager(inMemoryUserDao, googleMailManagerAdapter));

				authManager.register(can);
				UserManager userManager = new UserManager(inMemoryUserDao, amazonMailManagerAdapter);
				
				userManager.getAll();
	}

}
