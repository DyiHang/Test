package cn.com.mybatis.cache;

import java.io.Serializable;

public class StudentCache implements Serializable{
	
	private int s_no;
	private String s_name;
	private int s_age;
	private String s_sex;
	
	
	public StudentCache() {
		super();
	}


	public StudentCache(int s_no, String s_name, int s_age, String s_sex) {
		super();
		this.s_no = s_no;
		this.s_name = s_name;
		this.s_age = s_age;
		this.s_sex = s_sex;
	}


	public int getS_no() {
		return s_no;
	}


	public void setS_no(int s_no) {
		this.s_no = s_no;
	}


	public String getS_name() {
		return s_name;
	}


	public void setS_name(String s_name) {
		this.s_name = s_name;
	}


	public int getS_age() {
		return s_age;
	}


	public void setS_age(int s_age) {
		this.s_age = s_age;
	}


	public String getS_sex() {
		return s_sex;
	}


	public void setS_sex(String s_sex) {
		this.s_sex = s_sex;
	}


	@Override
	public String toString() {
		return "StudentCache [s_no=" + s_no + ", s_name=" + s_name + ", s_age=" + s_age + ", s_sex=" + s_sex + "]";
	}
	
	

}
