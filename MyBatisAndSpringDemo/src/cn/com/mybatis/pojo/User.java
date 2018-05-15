package cn.com.mybatis.pojo;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

public class User implements Serializable{
	private static final long serialVersionUID =1l;
	private Integer id;
	private String  username;
	private String sex;
	private Date birthday;
	private String address;
	
	//Orders类的独享作为了User的属性
	private List<Orders>ordersList;

	public User() {
		super();
	}

	public User(Integer id, String username, String sex, Date birthday, String address, List<Orders> ordersList) {
		super();
		this.id = id;
		this.username = username;
		this.sex = sex;
		this.birthday = birthday;
		this.address = address;
		this.ordersList = ordersList;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public List<Orders> getOrdersList() {
		return ordersList;
	}

	public void setOrdersList(List<Orders> ordersList) {
		this.ordersList = ordersList;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", username=" + username + ", sex=" + sex + ", birthday=" + birthday + ", address="
				+ address + ", ordersList=" + ordersList + "]";
	}
	
	

}
