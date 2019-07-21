package cn.hp.ssm.dao;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.support.SqlSessionDaoSupport;

import cn.hp.ssm.po.User;

public class UserDaoImpl extends SqlSessionDaoSupport implements UserDao {
	
	@Override
	public User findUserById(int id) throws Exception {
		
		SqlSession sqlSession = this.getSqlSession();
		
		User returnUser = sqlSession.selectOne("test.findUserById",id);
		
		return returnUser;
		
	}
	
}
