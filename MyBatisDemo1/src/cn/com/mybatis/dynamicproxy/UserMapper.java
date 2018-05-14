package cn.com.mybatis.dynamicproxy;

import java.util.List;

public interface UserMapper {
	/*
	 * 四个原则
	 * 接口 方法名 == User.xml 中id名
	 * 返回值类型 与Mapper.xml文件中返回值类型要一致
	 * 方法的入参类型 与Mapper.xml中入参的类型要一致
	 * */
	public User findUserById(Integer id);
	public List<User> findUserByQueryVo(Integer u_no);

}
