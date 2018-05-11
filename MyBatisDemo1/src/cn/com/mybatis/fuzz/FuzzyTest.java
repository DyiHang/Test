package cn.com.mybatis.fuzz;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.junit.Test;

import cn.com.mybatis.util.SqlSessionFactoryDemo;

public class FuzzyTest {

	public static void main(String[] args) throws IOException {
		test7();
	}
	public static void test1() throws IOException{
		SqlSession session  = SqlSessionFactoryDemo.getSession();
		List<Emp1> list=session.selectList("demoLine","%a%");
		System.out.println(list);
	}
	public static void test2() throws IOException{
		SqlSession session = SqlSessionFactoryDemo.getSession();
		Map<String, Integer> map = new HashMap<String, Integer>();
		map.put("jo",1);
		session.selectOne("demoCallAble",map);
		System.out.println(map);
	}
	public static void test3() throws IOException{
		SqlSession session = SqlSessionFactoryDemo.getSession();
		Emp1 e = new Emp1();
		//注释e 为空时，查询表中所有记录
		e.setEname("zhao");
		List<Emp1> list =session.selectList("demoif",e);
		System.out.println(list);
	}
	public static void test4() throws IOException{
		SqlSession session = SqlSessionFactoryDemo.getSession();
		Emp1 e = new Emp1();
	e.setEname("zhang");
		//e.setComm(333);
		e.setJob("clerk");
		//e.setJob("manager");
		List<Emp1>list = session.selectList("demoWhen",e);
		System.out.println(list);
		
	}
	public static  void test6() throws IOException{
		SqlSession session = SqlSessionFactoryDemo.getSession();
		
		Emp1 emp1 = new Emp1();
		emp1.setEname("zhao");
		emp1.setJob("student");
		List<Emp1>list=session.selectList("demoTrim", emp1);
		System.out.println(list);
	}
	public static void test7() throws IOException{
		SqlSession session = SqlSessionFactoryDemo.getSession();
		Emp1 emp1 = new Emp1();
		emp1.setEmpno(10001);
		emp1.setSal(25555.00);
		emp1.setEname("zhu");
		emp1.setJob("boss");
		emp1.setComm(1000);
		List<Emp1> list =session.selectList("demoSet", emp1);
		session.commit(true);
		System.out.println(list);
		session.close();
	}
}
