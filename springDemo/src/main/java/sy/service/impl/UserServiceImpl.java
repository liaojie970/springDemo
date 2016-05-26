package sy.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import sy.dao.UserMapper;
import sy.model.User;
import sy.service.UserServiceI;

@Service("UserService")
public class UserServiceImpl implements UserServiceI {
	@Autowired
	private UserMapper userMapper;

	public User getUserById(Integer id) {
		return userMapper.selectByPrimaryKey(id);
	}

	public List<User> selectAll() {
		return userMapper.selectAll();
	}

}
