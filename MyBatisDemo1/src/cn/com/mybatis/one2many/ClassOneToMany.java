package cn.com.mybatis.one2many;

public class ClassOneToMany {

	private int cid;
	private String cname;
	//Teacher类对象作为属性
	TeacherOneToMany teacher;
	
	
	public ClassOneToMany() {
		super();
	}


	public ClassOneToMany(int cid, String cname, TeacherOneToMany teacher) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.teacher = teacher;
	}


	public int getCid() {
		return cid;
	}


	public void setCid(int cid) {
		this.cid = cid;
	}


	public String getCname() {
		return cname;
	}


	public void setCname(String cname) {
		this.cname = cname;
	}


	public TeacherOneToMany getTeacher() {
		return teacher;
	}


	public void setTeacher(TeacherOneToMany teacher) {
		this.teacher = teacher;
	}


	@Override
	public String toString() {
		return "ClassOneToMany [cid=" + cid + ", cname=" + cname + ", teacher=" + teacher + "]";
	}
	
	
}
