package cn.com.mybatis.one2many;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class Demo {

	public static void main(String[] args) throws IOException {
		InputStream is = Resources.getResourceAsStream("sqlConfig.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession session = factory.openSession(true);
		String starament = "OneToMany01";
		ClassOneToMany list = session.selectOne(starament, 101);
		System.out.println(list);
	}
}
