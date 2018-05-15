package cn.com.mybatis.junit;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import cn.com.mybatis.mapper.UserMapper;
import cn.com.mybatis.pojo.User;

public class JunitTest {

	public static void main(String[] args) {
		ApplicationContext ac=new ClassPathXmlApplicationContext("applicationContext.xml");
	UserMapper ma=(UserMapper) ac.getBean("userMapper");
	User user = ma.findUserById(10);
	System.out.println(user);
	}
}
