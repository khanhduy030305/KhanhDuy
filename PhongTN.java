package LeKhanhDuy_23644451_PhongHoc;

public class PhongTN extends PhongHoc {
	private String chuyenNganh;
	private int suaChua;
	private boolean coBonRua;
	

	public PhongTN(String maPhong, String dayNha, double dienTich, int soBongDen, String chuyenNganh, int suaChua,
			boolean coBonRua) {
		super(maPhong, dayNha, dienTich, soBongDen);
		this.chuyenNganh = "";
		this.suaChua = 0;
		this.coBonRua = false;
	}

	public PhongTN() {
		super();
		
	}

	public String getChuyenNganh() {
		return chuyenNganh;
	}

	public void setChuyenNganh(String chuyenNganh) {
		this.chuyenNganh = chuyenNganh;
	}

	public int getSuaChua() {
		return suaChua;
	}

	public void setSuaChua(int suaChua) {
		this.suaChua = suaChua;
	}

	public boolean isCoBonRua() {
		return coBonRua;
	}

	public void setCoBonRua(boolean coBonRua) {
		this.coBonRua = coBonRua;
	}

	@Override
	public boolean getDatChuan() {
		return (duAnhSang() && coBonRua);
	}
	
	@Override
	public String toString() {
		String bonRua = coBonRua? "Co bon rua ": "Khong co bon rua";
		return super.toString()+ String.format("chuyen nganh: %s; sua chua: %s; %s", getChuyenNganh(), getSuaChua(), bonRua );
	}
	

}
