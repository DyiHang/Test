package cn.com.mybatis.cache;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class TestCacheDemo {
	public static void main(String[] args) throws IOException {
		SqlSessionFactory sf= SqlSessionFactoryUtil.getFactory();
	
		SqlSession session1 = sf.openSession();
		SqlSession session2 = sf.openSession();
		StuMapper1 map = session1.getMapper(StuMapper1.class);
		StudentCache s = map.findOne(1001);
		System.out.println("s========"+s);
		session1.commit();
		StudentCache s1 = map.findOne(1001);
		System.out.println("s1==========="+s1);
		StuMapper1 map2=session2.getMapper(StuMapper1.class);
		StudentCache s2= map2.findOne(1001);
		System.out.println("s2======"+s2);
				
	}

}
