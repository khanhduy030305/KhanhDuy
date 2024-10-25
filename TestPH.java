package LeKhanhDuy_23644451_PhongHoc;

import java.util.List;

public class TestPH {
	public static void main(String[] args) {
		ListPH ph = new ListPH();
		
		ph.themPhong(new PhongLT("A1","Day A", 100, 30, true ));
		ph.themPhong(new PhongMT("A2","Day B", 150, 20, 60 ));
		ph.themPhong(new PhongMT("A3","Day H", 100, 30, 50 ));
		ph.themPhong(new PhongTN("A6","Day A", 80, 30,"vat ly", 40, true ));
		
		
		System.out.println("Danh sach phong hoc:");
		System.out.println(ph);
		
		String mp = "A01";
		System.out.println("Phong hoc voi ma : "+ mp);
		System.out.println(ph.timPhong(mp));
		
		List<PhongHoc> pDC = ph.danhsachDC();
		System.out.println("Danh sach phong dat chuan");
		for (PhongHoc p : pDC) {
			System.out.println(p);
		}
		
		ph.sapXepTheoDayNha();
		System.out.println("Danh sach phong hoc theo day nha");
		System.out.println(ph);
		
		ph.SapXepTheoDienTich();
		System.out.println("Danh sach phong hoc theo dien tich");
		System.out.println(ph);
		
		ph.sapXeptheoBongDen();
		System.out.println("Danh sach phong hoc theo bong den");
		System.out.println(ph);
		
		ph.capNhatSoMayTinh("H7", 80);
		System.out.println("Danh sach phong hoc sau khi cap nhat");
		System.out.println(ph);
		
		ph.xoaPhong("A1");
		System.out.println("Danh sach phong hoc sau khi xoa ");
		System.out.println(ph);
		
		System.out.println("Tong so phong hoc:"+ ph.tongSoPhong());
		
		List<PhongMT> p60 = ph.dsPhongCo60May();
		System.out.println("Danh sach phong cos 60 may");
		for (PhongMT p : p60) {
			System.out.println(p);
		}
	}

}
