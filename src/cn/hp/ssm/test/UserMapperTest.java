package cn.hp.ssm.test;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.hp.ssm.dao.UserDao;
import cn.hp.ssm.mapper.UserMapper;
import cn.hp.ssm.po.User;

public class UserMapperTest {

	private ApplicationContext applicationContext;
	
	@BeforeEach
	public void setup() {
		
		applicationContext = new ClassPathXmlApplicationContext("spring/applicationContext.xml");
	}
	
	@Test
	public void testFindUserById() throws Exception{
		
		UserMapper usermapper = (UserMapper) applicationContext.getBean("userMapper");
		
		User user = usermapper.findUserById(1);
		
		System.out.println(user);
		
	}
}
