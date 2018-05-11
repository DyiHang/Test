package cn.com.mybatis.cache;

import java.io.IOException;
import java.io.Reader;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class SqlSessionFactoryUtil {

	public static SqlSessionFactory getFactory() throws IOException{
	Reader reader = Resources.getResourceAsReader("mybatis-config.xml");
	SqlSessionFactoryBuilder sfb = new SqlSessionFactoryBuilder();
	return sfb.build(reader);
	}
}
