package nUserSignProject.business.abstracts;

import nUserSignProject.entities.concretes.LoginDto;
import nUserSignProject.entities.concretes.User;

public interface AuthService {
	void register(User user);
	void verify(User user,String token);
	void login(LoginDto dto);
	boolean userExists(String email);
	
	
}
