package cn.com.mybatis.fuzzy;

public class Emp {

	 private double empno ;
	  private String   ename ;
	 private String   job ;
	  private double  sal ;
	 private String   comm ;
	
	 
	public Emp() {
		super();
	}

	public Emp(double empno, String ename, String job, double sal, String comm) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.sal = sal;
		this.comm = comm;
		
	}

	public double getEmpno() {
		return empno;
	}

	public void setEmpno(double empno) {
		this.empno = empno;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	public String getComm() {
		return comm;
	}

	public void setComm(String comm) {
		this.comm = comm;
	}

	@Override
	public String toString() {
		return "Emp [empno=" + empno + ", ename=" + ename + ", job=" + job + ", sal=" + sal + ", comm=" + comm + "]";
	}

	

	

	

	 

}
