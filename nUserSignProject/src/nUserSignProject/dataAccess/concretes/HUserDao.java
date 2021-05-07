package nUserSignProject.dataAccess.concretes;

import java.util.*;

import nUserSignProject.dataAccess.abstracts.UserDao;
import nUserSignProject.entities.concretes.User;

public class HUserDao implements UserDao{

	private List<User> users = new ArrayList<User>();
	
	public HUserDao() {
		User user = new User(1,"Ali Can","G�ne�","cgunes52@gmail.com","1234",true);
		User user1 = new User(2,"Alperen","Bozkurt","alperenbozkurt@gmail.com","7896",true);
		User user2 = new User(3,"Kadir","S���t","kadirsogut@gmail.com","85279",true);
		User user3 = new User(4,"Remzi","Karabulut","remzikarabulut@gmail.com","741236",true);
		
		users.add(user);
		users.add(user1);
		users.add(user2);
		users.add(user3);

	}
	
	@Override
	public void add(User user) {
		System.out.println("Kaydedildi"+user.getFirstName());
		users.add(user);
	}

	@Override
	public void update(User user) {
		User userUpdate = users.stream()
						.filter(u->u.getId() == user.getId())
						.findFirst()
						.orElse(null);
		
		if(userUpdate != null) {
			userUpdate.seteMail(user.geteMail());
			userUpdate.setFirstName(user.getFirstName());
			userUpdate.setLastName(user.getLastName());
			userUpdate.setId(user.getId());
			userUpdate.setPassword(user.getPassword());
			userUpdate.setVerify(user.isVerify());
		}
				
	}

	@Override
	public void delete(int userId) {
		User userToDelete = users.stream()
						.filter(u->u.getId() == userId)
						.findFirst()
						.orElse(null);
		
		if(userToDelete !=null) {
			users.remove(userToDelete);
		}
	}

	@Override
	public List<User> getAll() {
		return users;
	}

	@Override
	public User get(String email) {
		User user = users.stream()
					.filter(s->s.geteMail() == email)
					.findFirst()
					.orElse(null);
		
		return user;	
	}

	

}
