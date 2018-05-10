package cn.com.mybatils.inconformity;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;


public class StuDemo {

	public static void main(String[] args) throws IOException {
		InputStream is=Resources.getResourceAsStream("sqlConfig.xml");
		SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
		SqlSession S = factory.openSession(true);
		String taratement = "selectStu";
		Stu stu = S.selectOne(taratement, 3);
		System.out.println(stu);
		
		
	}
}
