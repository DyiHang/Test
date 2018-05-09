package cn.com.mybatis.one2one;

public class Class {

	private int id;
	private String cname;
	//teacher类中的对象作为Class类的属性
	private Teacher teacher;
	public Class(){
		
	}
	public Class(int id, String cname , Teacher teacher) {
		super();
		this.id = id;
		this.cname = cname;
		
		this.teacher = teacher;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCname() {
		return cname;
	}
	public void setCname(String cname) {
		this.cname = cname;
	}
	
	public Teacher getTeacher() {
		return teacher;
	}
	public void setTeacher(Teacher teacher) {
		this.teacher = teacher;
	}
	@Override
	public String toString() {
		return "Class [id=" + id + ", cname=" + cname + ", teacher=" + teacher + "]";
	}

	
	
	
	
}
