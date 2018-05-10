package cn.com.mybatis.one2many;

import java.util.List;

public class TeacherOneToMany {

	private int tid;
	private String tname;
	private List<StudentOneToMany> students;
	
	public TeacherOneToMany() {
		super();
	}
	public TeacherOneToMany(int tid, String tname, List<StudentOneToMany> students) {
		super();
		this.tid = tid;
		this.tname = tname;
		this.students = students;
	}
	public int getTid() {
		return tid;
	}
	public void setTid(int tid) {
		this.tid = tid;
	}
	public String getTname() {
		return tname;
	}
	public void setTname(String tname) {
		this.tname = tname;
	}
	public List<StudentOneToMany> getStudents() {
		return students;
	}
	public void setStudents(List<StudentOneToMany> students) {
		this.students = students;
	}
	@Override
	public String toString() {
		return "TeacherOneToMany [tid=" + tid + ", tname=" + tname + ", students=" + students + "]";
	}
	
}
