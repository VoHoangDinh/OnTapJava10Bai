package Class;

import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	protected String hoTen107;
	protected String ngaySinh107;
	protected String queQuan107;

	// phuong thuc
	// ham khoi tao khong so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen107, String ngaySinh107, String queQuan107) {
		this.hoTen107 = hoTen107;
		this.ngaySinh107 = ngaySinh107;
		this.queQuan107 = queQuan107;
	}

	// ham nhap thong tin
	public void nhapThongTin(Scanner sc107) {
		System.out.print("\tNhap ho ten: ");
		hoTen107 = sc107.nextLine();
		System.out.print("\tNhap ngay sinh: ");
		ngaySinh107 = sc107.nextLine();
		System.out.print("\tNhap que quan: ");
		queQuan107 = sc107.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen107);
		System.out.println("\tNgay sinh: " + ngaySinh107);
		System.out.println("\tQue quan: " + queQuan107);
	}
}