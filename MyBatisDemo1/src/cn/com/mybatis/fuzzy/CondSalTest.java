package cn.com.mybatis.fuzzy;

import java.io.IOException;
import java.util.List;

import org.apache.ibatis.session.SqlSession;

import cn.com.mybatis.util.SqlSessionFactoryDemo;

public class CondSalTest {

	public static void main(String[] args) throws IOException {
		SqlSession session = SqlSessionFactoryDemo.getSession();
		CondSal sal = new CondSal(30000,45000);
		List<Emp> list = session.selectList("Cond.selectM",sal);
		System.out.println(list);
	}
}
