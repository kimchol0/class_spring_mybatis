package cn.hp.ssm.dao;

import cn.hp.ssm.po.User;

public interface UserDao {
	
	public User findUserById(int id) throws Exception;
	
}
