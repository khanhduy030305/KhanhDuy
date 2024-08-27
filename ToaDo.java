package KhanhDuy_23644451;

public class ToaDo {
	public static final double PI=3.1416;
	private double banKinh;
	private HinhTron tam;
	public double getBanKinh() {
		return banKinh;
	}
	public void setBanKinh(double banKinh) {
		this.banKinh = banKinh;
	}
	public HinhTron getTam() {
		return tam;
	}
	public void setTam(HinhTron tam) {
		this.tam = tam;
	}
	public ToaDo() {}
	public ToaDo(double banKinh, HinhTron tam) {
		this.banKinh = banKinh;
		this.tam = tam;
	}
	public double getDienTich() {
		return getBanKinh()*getBanKinh()*PI;
	}
	@Override
	public String toString() {
		String s1="";
		s1=s1+s1.format("Ban kinh: %-5s; Dien tich: %-10s", getBanKinh(), getDienTich());
		return s1;
	}

}
