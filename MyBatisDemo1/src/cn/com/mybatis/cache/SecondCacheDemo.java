package cn.com.mybatis.cache;

import java.io.IOException;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;

public class SecondCacheDemo {

	public static void main(String[] args) throws IOException {
		SqlSessionFactory sf = SqlSessionFactoryUtil.getFactory();
		SqlSession session1 =sf.openSession();
		SqlSession session3 = sf.openSession();
		
		
		System.out.println("s3===================>"+session3.selectOne("findOne",1003));
		StudentCache stu=new StudentCache();
		stu.setS_no(1003);
		stu.setS_age(30);
		stu.setS_name("zhou");
		stu.setS_sesx("男");
		session1.update("updateStu",stu);
		session1.commit();
		
		

		
		StudentCache s1= session1.selectOne("findOne", 1003);
		session1.commit();
		System.out.println("s1===============>"+s1);
		
		SqlSession session2 =sf.openSession();
		StudentCache s2 = session2.selectOne("findOne", 1003);
		System.out.println("s2=========>"+s2);
		
		StudentCache s4= session3.selectOne("findOne", 1003);
		System.out.println(s4);
	
	}
}
