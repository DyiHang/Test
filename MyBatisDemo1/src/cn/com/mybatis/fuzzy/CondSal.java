package cn.com.mybatis.fuzzy;

public class CondSal {

	private double minSal;//最低工资
	private double maxSal;//最高工资
	public CondSal(){
		
	}
	public CondSal(double minSal, double maxSal) {
		super();
		this.minSal = minSal;
		this.maxSal = maxSal;
	}
	public double getMinSal() {
		return minSal;
	}
	public void setMinSal(double minSal) {
		this.minSal = minSal;
	}
	public double getMaxSal() {
		return maxSal;
	}
	public void setMaxSal(double maxSal) {
		this.maxSal = maxSal;
	}
	@Override
	public String toString() {
		return "CondSal [minSal=" + minSal + ", maxSal=" + maxSal + "]";
	}
	
	
	
}
