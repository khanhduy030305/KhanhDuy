package stt7_lekhanhduy_23644451;

import java.util.Calendar;

public class GiaoDichDat extends GiaoDich {
	private String loaiDat;

	public GiaoDichDat(String maGD, Calendar ngayGD, double donGia, double dienTich, String loaiDat) {
		super(maGD, ngayGD, donGia, dienTich);
		this.loaiDat = loaiDat;
	}
	
	public String getLoaiDat() {
        return loaiDat;
    }

	 @Override
	    public double getThanhTien() {
	        if (loaiDat.equals("A")) {
	            return dienTich * donGia * 1.5;
	        } else {
	            return dienTich * donGia;
	        }
	    }

	@Override
	public String toString() {
		return "GiaoDichDat [loaiDat=" + loaiDat + ", maGD=" + maGD + ", ngayGD=" + ngayGD + ", donGia=" + donGia
				+ ", dienTich=" + dienTich + "]";
	}
}
