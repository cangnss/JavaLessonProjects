package nUserSignProject.business.concretes;

import java.util.List;

import nUserSignProject.business.abstracts.UserService;
import nUserSignProject.core.EmailService;
import nUserSignProject.dataAccess.abstracts.UserDao;
import nUserSignProject.entities.concretes.User;

public class UserManager implements UserService{

	private UserDao userDao;
	private EmailService emailService;
	public UserManager(UserDao userDao, EmailService emailService) {
		super();
		this.userDao = userDao;
		this.emailService = emailService;
	}
	
	@Override
	public void add(User user) {
		//if(userValidate(user)) {
			userDao.add(user);	
			System.out.println("Log: " + user.geteMail());
			emailService.send(user.geteMail(), "Kayýt oldunuz.");
		//}			
	}
	
	
	public void add(String email) {
		//if(!email.isEmpty()) {
			User user =new User();
			user.seteMail(email);
			userDao.add(user);
			System.out.println("Log2: " + user.geteMail());
			emailService.send(email,"Kayýt oldunuz.");
		//}		
	}
	
	@Override
	public void update(User user) {
		if(userValidate(user)) {
			userDao.update(user);
		}		
	}
	
	@Override
	public void delete(int userId) {
		userDao.delete(userId);		
	}
	
	@Override
	public List<User> getAll() {
		for (User user : userDao.getAll()) {
			System.out.println(user.getId() +" "+ user.geteMail() +" "+ user.getFirstName());
		}
		return userDao.getAll();
	}

	@Override
	public User get(String email) {			
		return userDao.get(email);
	}
	
	public boolean userValidate(User user) {
		if(user.getFirstName().length()>=2 && user.getLastName().length()>=2) {
			return true;				
		}
		System.out.println("Adýnýz ve soyadýnýz minimum 2 karakter olmalý.");
		return false;
	}

}
