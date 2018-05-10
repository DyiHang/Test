package cn.com.mybatis.one2one;

import java.io.IOException;
import java.io.InputStream;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

public class One2OneTest {
public static void main(String[] args) throws IOException {
	InputStream is = Resources.getResourceAsStream("sqlConfig.xml");
	SqlSessionFactory factory = new SqlSessionFactoryBuilder().build(is);
	SqlSession session=factory.openSession(true);
	String staement = "Three.selectOne";
	/*Class class1= session.selectOne(staement,1703);
	System.out.println(class1);*/
	//执行两次查询
	/*
	 * 映射文件可以有多个，如果能够保证在多个映射文件中的 id保持唯一
	 * 那么一刻省略namespace的值
	 * */
			staement = "selectTwo";
		Class Class=	session.selectOne(staement,1703);
		System.out.println(Class);
}
}
