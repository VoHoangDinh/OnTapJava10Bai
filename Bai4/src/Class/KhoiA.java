package Class;

import java.util.Scanner;

public class KhoiA extends ThiSinh {
	// thuoc tinh
	private String mon1107;
	private String mon2107;
	private String mon3107;

	// phuong thuc
	// ham khoi tao khong doi so
	public KhoiA() {

	}

	// ham khoi tao co doi so
	public KhoiA(String mon1107, String mon2107, String mon3107) {
		this.mon1107 = mon1107;
		this.mon2107 = mon2107;
		this.mon3107 = mon3107;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc107) {
		super.nhapThongTin(sc107);
		System.out.print("\tNhap mon 1: ");
		mon1107 = sc107.nextLine();
		System.out.print("\tNhap mon 2: ");
		mon2107 = sc107.nextLine();
		System.out.print("\tNhap mon 3: ");
		mon3107 = sc107.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tTo hop mon thi: " + mon1107 + " - " + mon2107 + " - " + mon3107);
	}
}