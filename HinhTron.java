package HuynhTriVy_23681901;

public class HinhTron {
	private double banKinh;
	public static final double PI=3.1416;
	private Tam t;
	public Tam getT() {
		return t;
	}
	public void setT(Tam t) throws Exception {
		if (t!=null) {
			this.t = t;
		} else {
			throw new Exception("loi");
		}
		
	}
	// Hang thuc
	
	public double getBanKinh() {
		return banKinh;
	}
	public void setBanKinh(double bk) throws Exception {
		if (bk>0) {
			this.banKinh = bk;
		} else {
			throw new Exception("loi");
		}
		
	}
	// Tao ham (Constructor)
	public HinhTron() {}
	public HinhTron(double banKinh, Tam t) {
		this.banKinh = banKinh;
		this.t = t;
	}
	// Tinh dien tich va chu vi
	public double getDienTich() {
		return getBanKinh()*getBanKinh()*PI;
    }
	public double getChuVi() {
		return getBanKinh()*2*PI;
	}
	// May in
	@Override
	public String toString() {
		String m="";
		m+=m.format(", %-3s, %10s, %10s.", getBanKinh(), getDienTich(), getChuVi());
		return m;
	}
}
