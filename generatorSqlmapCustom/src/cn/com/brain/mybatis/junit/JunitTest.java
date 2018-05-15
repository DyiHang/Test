package cn.com.brain.mybatis.junit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.brain.mybatis.mapper.UserMapper;
import cn.com.brain.mybatis.pojo.User;
import cn.com.brain.mybatis.pojo.UserExample;


public class JunitTest {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	UserMapper ma=(UserMapper) ac.getBean(UserMapper.class);
	UserExample example = new UserExample();
	String username="光";
	example.createCriteria().andSexEqualTo("1").andUsernameLike("%"+username+"%");
	example.setOrderByClause("id desc");
	int coutByExample=ma.countByExample(example);
	System.out.println(coutByExample);
	}
}
