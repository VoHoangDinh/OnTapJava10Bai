package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	private String hoTen107;
	private Date ngaySinh107;
	private String ngheNghiep107;

	// phuong thuc
	// ham khoi tao khong doi so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen107, Date ngaySinh107, String ngheNghiep107) {
		this.hoTen107 = hoTen107;
		this.ngaySinh107 = ngaySinh107;
		this.ngheNghiep107 = ngheNghiep107;
	}

	// nhap cac thong tung nguoi trong ho gia dinh
	public void nhapThongTin(Scanner sc107) {
		System.out.print("\tNhap ho ten: ");
		hoTen107 = sc107.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		String strDate107 = sc107.nextLine();
		ngaySinh107 = strToDate(strDate107);
		System.out.print("\tNhap nghe nghiep: ");
		ngheNghiep107 = sc107.nextLine();
	}

	// ham thuc hien chuyen string sang date
	private Date strToDate(String strDate107) {
		Date date = null;

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date = sdf.parse(strDate107);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date;
	}

	// hien thi ra tung nguoi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen107);
		System.out.println("\tNgay sinh: " + dateToString(ngaySinh107));
		System.out.println("\tNghe nghiep: " + ngheNghiep107);
	}

	// ham chuyen dinh dang tu date sang String
	private String dateToString(Date date) {
		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		String strDate = sdf.format(date);

		return strDate;
	}

	// ham lay thong tin ve ngay sinh
	public Date getNgaySinh() {
		return ngaySinh107;
	}
}