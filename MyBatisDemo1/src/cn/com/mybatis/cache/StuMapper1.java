package cn.com.mybatis.cache;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

public interface StuMapper1 {
	//添加
	@Insert("insert into s_stu values(#{s_no,#{s_name},#{s_sesx})")
	void addStu(StudentCache student);
	//修改
	@Update("update s_stu set s_name=#{s_name},s_age=#{s_age},s_sesx=#{s_sesx} where s_no=#{s_no}")
	void updateStu(StudentCache student);
	//查询
	@Select("select * from s_stu where s_no=#{id}")
	StudentCache findOne(int id);
	//查询全部
	@Select("select * from s_stu")
	List<StudentCache> findAll();
	//删除
	@Delete("delete from s_stu where s_no=#{s_no}")
	void deleteStu(int id );

}
