package sy.service;

import java.util.List;

import sy.model.User;

public interface UserServiceI {
	public User getUserById(Integer id);

	public List<User> selectAll();
}
