package cn.com.mybatis.util;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryDemo {

	public static SqlSession getSession() throws IOException{
		InputStream is= Resources.getResourceAsStream("sqlConfig.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		return factory.openSession();
	}
}
