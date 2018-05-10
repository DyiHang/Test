package cn.com.mybatis.one2many;

public class StudentOneToMany {

	private int sid;
	private String sname;
	public StudentOneToMany(){
		
	}
	public StudentOneToMany(int sid, String sname) {
		super();
		this.sid = sid;
		this.sname = sname;
	}
	public int getSid() {
		return sid;
	}
	public void setSid(int sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	@Override
	public String toString() {
		return "StudentOneToMany [sid=" + sid + ", sname=" + sname + "]";
	}
	
}
