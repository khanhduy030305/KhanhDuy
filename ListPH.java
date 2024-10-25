package LeKhanhDuy_23644451_PhongHoc;

import java.util.ArrayList;
import java.util.List;

public class ListPH {
	private List<PhongHoc> dsPH;
	
	public ListPH() {
		dsPH = new ArrayList<PhongHoc>();
	}
	
	public boolean themPhong (PhongHoc p) {
		if(dsPH.contains(p))
			return false ;
		dsPH.add(p);
		return true;
	}
	
	public PhongHoc timPhong (String maPhong) {
		for (PhongHoc p: dsPH) {
			if(p.getMaPhong().equalsIgnoreCase(maPhong))
				return p;
		}
		return null;
	}
	
	public List<PhongHoc> danhsachDC(){
		List<PhongHoc> dsDC = new ArrayList<PhongHoc>();
		for (PhongHoc p : dsPH) {
			if(p.getDatChuan())
				dsDC.add(p);
		}
		return dsDC;
	}
	
	public void sapXepTheoDayNha () {
		dsPH.sort((p1,p2)-> p1.getDayNha().compareToIgnoreCase(p2.getDayNha()));
	}
	
	public void SapXepTheoDienTich() {
		dsPH.sort((p1,p2)-> Double.compare(p2.getDienTich(), p1.getDienTich()));
	}
	
	public void sapXeptheoBongDen() {
		dsPH.sort((p1,p2)-> Integer.compare(p2.getSoBongDen(), p1.getSoBongDen()));
	}
	
	public void capNhatSoMayTinh (String maPhong , int soMayTinh) {
		PhongHoc p = timPhong(maPhong);
		if(p instanceof PhongMT)
			((PhongMT) p).setSoMayTinh(soMayTinh);
	}
	
	public void xoaPhong (String maPhong) {
		PhongHoc p= timPhong(maPhong);
		if(p!=null)
			dsPH.remove(p);
	}
	
	public int tongSoPhong() {
		return dsPH.size();
	}
	
	public List<PhongMT> dsPhongCo60May() {
		List<PhongMT> ds60 = new ArrayList<PhongMT>();
		for (PhongHoc p : dsPH) {
			if(p instanceof PhongMT && ((PhongMT) p).getSoMayTinh()>=60)
				ds60.add((PhongMT) p);
		}
		return ds60;
	}
	
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		for (PhongHoc p: dsPH) {
			sb.append(p.toString()).append("\n");
		}
		return sb.toString();
	}

}
