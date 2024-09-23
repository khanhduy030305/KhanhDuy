package Tuan4.TH;

import java.text.DateFormat;
import java.text.NumberFormat;
import java.util.Calendar;
import java.util.Locale;

public class CDR {
	
	private String maCD, tuaCD, caSy;
	private Calendar ngayPH;
	private int soBaiHat;
	private double gia;
	
	public String getMaCD() {
		return maCD;
	}
	public void setMaCD(String maCD) {
		this.maCD = maCD;
	}
	public String getTuaCD() {
		return tuaCD;
	}
	public void setTuaCD(String tuaCD) {
		this.tuaCD = tuaCD;
	}
	public String getCaSy() {
		return caSy;
	}
	public void setCaSy(String caSy) {
		this.caSy = caSy;
	}
	public Calendar getNgayPH() {
		return ngayPH;
	}
	public void setNgayPH(Calendar ngayPH) throws Exception {
		if(ngayPH!=null) {
			this.ngayPH = ngayPH;
		} else {
			throw new Exception ("Loi");
		}
		
	}
	public int getSoBaiHat() {
		return soBaiHat;
	}
	public void setSoBaiHat(int soBaiHat) {
		this.soBaiHat = soBaiHat;
	}
	public double getGia() {
		return gia;
	}
	public void setGia(double gia) {
		this.gia = gia;
	}
	
	public CDR(String maCD, String tuaCD, String caSy, Calendar ngayPH, int soBaiHat, double gia) 
			throws Exception {
		
		this.maCD = maCD;
		this.tuaCD = tuaCD;
		this.caSy = caSy;
		if (ngayPH!=null) {
			this.ngayPH = ngayPH;
		} else {
			throw new Exception ("Loi");
		}
		this.soBaiHat = soBaiHat;
		this.gia = gia;
	}
	public CDR() {
		
	}
	
	public double getThanhTien() {
		double tg=0;
		tg= getGia()*getSoBaiHat();
		return tg;
	}
	@SuppressWarnings("deprecation")
	Locale lc= new Locale("vi", "VN");
	NumberFormat nf= NumberFormat.getCurrencyInstance(lc);
	DateFormat df= DateFormat.getDateInstance(3, lc);

	@Override
	public String toString() {
		return "CDR [maCD=" + maCD + ", tuaCD=" + tuaCD + ", caSy=" + caSy + ","
				+"ngayPH=" + df.format(getNgayPH().getTime()) + ", soBaiHat="
				+ soBaiHat + ", gia=" + nf.format(getGia()) + ", getThanhTien()=" + nf.format(getThanhTien()) 
				+ "]";
	}

}
