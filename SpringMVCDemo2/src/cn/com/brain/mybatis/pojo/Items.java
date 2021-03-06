package cn.com.brain.mybatis.pojo;

import java.util.Date;

public class Items {
    private Integer id;

    private String name;

    private String detail;
    private Float price;

    private Date createtime;

    private String pic;

  

    
    


	public Items() {
		super();
	}

	public Items(Integer id, String name, String detail, Float price, Date createtime, String pic) {
		super();
		this.id = id;
		this.name = name;
		this.detail = detail;
		this.price = price;
		this.createtime = createtime;
		this.pic = pic;
	}

	public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public Float getPrice() {
        return price;
    }

    public void setPrice(Float price) {
        this.price = price;
    }

    public String getPic() {
        return pic;
    }

    public void setPic(String pic) {
        this.pic = pic == null ? null : pic.trim();
    }

    public Date getCreatetime() {
        return createtime;
    }

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail == null ? null : detail.trim();
    }
}