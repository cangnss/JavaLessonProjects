package nUserSignProject.dataAccess.abstracts;

import java.util.List;

import nUserSignProject.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void update(User user);
	void delete(int userId);
	List<User> getAll();
	User get(String email);
}
