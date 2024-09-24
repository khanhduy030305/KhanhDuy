package stt7_lekhanhduy_23644451;

import java.util.Calendar;

public class GiaoDichNha extends GiaoDich{
	private String loaiNha; 
    private String diaChi;
	
	 public GiaoDichNha(String maGD, Calendar ngayGD, double donGia, double dienTich, String loaiNha, String diaChi) {
		super(maGD, ngayGD, donGia, dienTich);
		this.loaiNha = loaiNha;
		this.diaChi = diaChi;
	}

	public String getLoaiNha() {
	        return loaiNha;
	    }

	    public String getDiaChi() {
	        return diaChi;
	    }
	    
	    @Override
	    public double getThanhTien() {
	        if (loaiNha.equals("cao cấp")) {
	            return dienTich * donGia;
	        } else {
	            return dienTich * donGia * 0.9;
	        }
	    }

		@Override
		public String toString() {
			return "GiaoDichNha [maGD=" + maGD + ", ngayGD=" + ngayGD.getTime() + ", donGia=" + donGia + ", dienTich=" + dienTich + ", loaiNha=" + loaiNha + ", diaChi=" + diaChi + "]";
		}
}
