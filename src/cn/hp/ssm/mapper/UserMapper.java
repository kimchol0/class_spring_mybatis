package cn.hp.ssm.mapper;

import cn.hp.ssm.po.User;

public interface UserMapper {
	
	public User findUserById(int id) throws Exception;
	
}
