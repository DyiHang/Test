package cn.com.mybatis.fuzz;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.SqlSession;
import org.junit.Test;

import cn.com.mybatis.util.SqlSessionFactoryDemo;

public class FuzzyTest {

	public static void main(String[] args) throws IOException {
		test2();
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
}
