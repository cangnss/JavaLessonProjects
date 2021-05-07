package nUserSignProject.business.concretes;

import nUserSignProject.business.abstracts.AuthService;
import nUserSignProject.business.abstracts.UserService;
import nUserSignProject.core.utils.Utils;
import nUserSignProject.entities.concretes.LoginDto;
import nUserSignProject.entities.concretes.User;

public class AuthManager implements AuthService{

	private UserService userService;
	
	public AuthManager(UserService userService) {
		super();
		this.userService = userService;
	}

	@Override
	public void register(User user) {
		if(userValidate(user) && passwordValidate(user.getPassword()) && userExists(user.geteMail()) == false && Utils.emailValidate(user.geteMail())) {
			userService.add(user);
		}
		System.out.println("Kay�t ba�ar�s�z");
	}

	@Override
	public void verify(User user,String token) {
		if(user!=null && token.length()>=15) {
			User exitsUser = userService.get(user.geteMail());
			exitsUser.setVerify(true);
			userService.update(exitsUser);
			System.out.println("Dogruland�");
		}
		System.out.println("Dogrulanmad�");
	}

	@Override
	public void login(LoginDto dto) {
		User user = userService.get(dto.getEmail());
		
		if(user != null && user.getPassword().equals(dto.getPassword())) {
			System.out.println("Ba�ar�yla giri� yapt�n�z.");				
		}
		else {
			System.out.println("Kullan�c� ad� veya �ifren yanl��.!");
		}
		
	}

	@Override
	public boolean userExists(String email) {
		User user=userService.get(email);

		if(user == null) {
			return false;
		}
		else {
			System.out.println("Email zaten mevcut.!" + email);		
			return true;
		}	
	}
	
	public boolean userValidate(User user) {
		if(user!=null && !user.getFirstName().isEmpty() && !user.getLastName().isEmpty() && !user.getPassword().isEmpty() && !user.geteMail().isEmpty()) {
			return true;
		}
		return false;
	}
	
	public boolean passwordValidate(String password) {
		if(password.length()>=6) {
			return true;
		}else {
			System.out.println("�ifreniz en az 6 karakter olmal�d�r.");
			return false;
		}
	}

}
