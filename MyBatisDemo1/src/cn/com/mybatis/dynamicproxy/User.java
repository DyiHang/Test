package cn.com.mybatis.dynamicproxy;

import java.io.Serializable;

public class User implements Serializable {
	private static final long serialVersionUID=1l;
	private Integer u_no;
	private String u_name;
	private int u_age;
	private String u_sex;
	public User(){
		
	}
	



	public Integer getU_no() {
		return u_no;
	}
	public void setU_no(Integer u_no) {
		this.u_no = u_no;
	}
	public String getU_name() {
		return u_name;
	}
	public void setU_name(String u_name) {
		this.u_name = u_name;
	}
	public int getU_age() {
		return u_age;
	}
	public void setU_age(int u_age) {
		this.u_age = u_age;
	}
	public String getU_sex() {
		return u_sex;
	}
	public void setU_sex(String u_sex) {
		this.u_sex = u_sex;
	}
	public static long getSerialversionuid() {
		return serialVersionUID;
	}
	public User(Integer u_no, String u_name, int u_age, String u_sex) {
		super();
		this.u_no = u_no;
		this.u_name = u_name;
		this.u_age = u_age;
		this.u_sex = u_sex;
	}




	@Override
	public String toString() {
		return "User [u_no=" + u_no + ", u_name=" + u_name + ", u_age=" + u_age + ", u_sex=" + u_sex + "]";
	}
	
	
	

}
