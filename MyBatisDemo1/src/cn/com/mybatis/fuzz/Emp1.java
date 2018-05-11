package cn.com.mybatis.fuzz;

import java.io.Serializable;

public class Emp1 implements Serializable{
	private int empno;
	private String ename;
	private String job;
	private double comm;//奖金
	private double sal;
	
	public Emp1() {
		super();
	}

	public Emp1(int empno, String ename, String job, double comm, double sal) {
		super();
		this.empno = empno;
		this.ename = ename;
		this.job = job;
		this.comm = comm;
		this.sal = sal;
	}

	public int getEmpno() {
		return empno;
	}

	public void setEmpno(int empno) {
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

	public double getComm() {
		return comm;
	}

	public void setComm(double comm) {
		this.comm = comm;
	}

	public double getSal() {
		return sal;
	}

	public void setSal(double sal) {
		this.sal = sal;
	}

	@Override
	public String toString() {
		return "Emp1 [empno=" + empno + ", ename=" + ename + ", job=" + job + ", comm=" + comm + ", sal=" + sal + "]";
	}
	
	
	
}
