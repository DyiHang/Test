package cn.com.mybatis.pojo;

import java.io.Serializable;
import java.sql.Date;

public class Orders implements Serializable{

	private static final long serialVersionUID = 1l;
	private Integer id;
	private Integer userId;
	private String number;
	private Date createDatetime;
	private String note;
	
	//User类的对象作为了Orders 的属性
	private User user;

	public Orders() {
		super();
	}

	public Orders(Integer id, Integer userId, String number, Date createDatetime, String note, User user) {
		super();
		this.id = id;
		this.userId = userId;
		this.number = number;
		this.createDatetime = createDatetime;
		this.note = note;
		this.user = user;
	}
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getNumber() {
		return number;
	}

	public void setNumber(String number) {
		this.number = number;
	}

	public Date getCreateDatetime() {
		return createDatetime;
	}

	public void setCreateDatetime(Date createDatetime) {
		this.createDatetime = createDatetime;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	@Override
	public String toString() {
		return "Orders [id=" + id + ", userId=" + userId + ", number=" + number + ", createDatetime=" + createDatetime
				+ ", note=" + note + ", user=" + user + "]";
	}
	
}
