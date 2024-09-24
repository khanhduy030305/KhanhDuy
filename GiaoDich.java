package stt7_lekhanhduy_23644451;

import java.util.Calendar;

public abstract class GiaoDich {
	 protected String maGD;
	 protected Calendar ngayGD;
	 protected double donGia;
	 protected double dienTich;
	public GiaoDich(String maGD, Calendar ngayGD, double donGia, double dienTich) {
		this.maGD = maGD;
		this.ngayGD = ngayGD;
		this.donGia = donGia;
		this.dienTich = dienTich;
	}
	public String getMaGD() {
        return maGD;
    }

    public Calendar getNgayGD() {
        return ngayGD;
    }

    public double getDonGia() {
        return donGia;
    }

    public double getDienTich() {
        return dienTich;
    }

    public abstract double getThanhTien();

    public abstract String toString();
} 