package cn.com.mybatils.inconformity;

public class Stu {

	private int no;
	private String name;
	private int sex;
	private int grade;
	private String tel;
	public Stu(){}
	public Stu(int no, String name, int sex, int grade, String tel) {
		super();
		this.no = no;
		this.name = name;
		this.sex = sex;
		this.grade = grade;
		this.tel = tel;
	}
	public int getNo() {
		return no;
	}
	public void setNo(int no) {
		this.no = no;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSex() {
		return sex;
	}
	public void setSex(int sex) {
		this.sex = sex;
	}
	public int getGrade() {
		return grade;
	}
	public void setGrade(int grade) {
		this.grade = grade;
	}
	public String getTel() {
		return tel;
	}
	public void setTel(String tel) {
		this.tel = tel;
	}
	@Override
	public String toString() {
		return "Stu [no=" + no + ", name=" + name + ", sex=" + sex + ", grade=" + grade + ", tel=" + tel + "]";
	}
	
}
