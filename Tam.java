package HuynhTriVy_23681901;

public class Tam {
	// Khai bao thuoc tinh
	private String ten;
	private double x;
	private double y;
	// Dong goi
	public String getTen() {
		return ten;
	}
	public void setTen(String ten) throws Exception {
		if (ten!=null) {
			this.ten = ten;
		} else {
			throw new Exception("loi");
		}
		this.ten = ten;
	}
	public double getX() {
		return x;
	}
	public void setX(double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	public void setY(double y) {
		this.y = y;
	}
	// Constructor
	public Tam() {}
	public Tam(String ten, double x, double y) throws Exception {
		if (ten!=null) {
			this.ten = ten;
		} else {
			throw new Exception("loi");
		}
		this.x = x;
		this.y = y;
	}
	// May in
	@Override
	public String toString() {
	 String s="";
	 s=s+s.format("%2s(%2s, %2s)", getTen(), getX(), getY());
		return s;
	}
}
