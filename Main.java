package stt7_lekhanhduy_23644451;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Main {
	    public static void main(String[] args) {
	        List<GiaoDich> giaoDichList = new ArrayList<>();

	        Calendar date1 = Calendar.getInstance();
	        date1.set(2013, Calendar.SEPTEMBER, 15);
	        giaoDichList.add(new GiaoDichDat("GD001", date1, 1000, 50, "A"));

	        Calendar date2 = Calendar.getInstance();
	        date2.set(2013, Calendar.SEPTEMBER, 25);
	        giaoDichList.add(new GiaoDichNha("GD002", date1, 0, 0, "cao cấp", null));

	        Calendar date3 = Calendar.getInstance();
	        date3.set(2013, Calendar.OCTOBER, 5);
	        giaoDichList.add(new GiaoDichDat("GD003", date3, 1500, 40, "B"));

	        Calendar date4 = Calendar.getInstance();
	        date4.set(2013, Calendar.SEPTEMBER, 10);
	        giaoDichList.add(new GiaoDichNha("GD004", date2, 0, 0, "thường", null));

	       
	        int countDat = 0, countNha = 0;
	        double totalDat = 0;
	        for (GiaoDich gd : giaoDichList) {
	            if (gd instanceof GiaoDichDat) {
	                countDat++;
	                totalDat += gd.getThanhTien();
	            } else if (gd instanceof GiaoDichNha) {
	                countNha++;
	            }
	        }
	        System.out.println("Số lượng giao dịch đất: " + countDat);
	        System.out.println("Số lượng giao dịch nhà: " + countNha);

	       
	        if (countDat > 0) {
	            System.out.println("Trung bình thành tiền giao dịch đất: " + (totalDat / countDat));
	        }

	        System.out.println("Các giao dịch tháng 9 năm 2013:");
	        for (GiaoDich gd : giaoDichList) {
	            if (gd.getNgayGD().get(Calendar.YEAR) == 2013 && gd.getNgayGD().get(Calendar.MONTH) == Calendar.SEPTEMBER) {
	                System.out.println(gd.toString());
	            }
	       }
	   }
}
