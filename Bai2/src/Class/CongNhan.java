package Class;

import java.util.Scanner;

public class CongNhan extends CanBo {
	// thuoc tinh
	private String bac107;

	// phuong thuc
	// ham khoi tao khong doi so
	public CongNhan() {

	}

	// ham khoi tao co doi so
	public CongNhan(String hoten107, String ngaySinh107, String gioiTinh107, String diaChi107, String bac107) {
		super(hoten107, ngaySinh107, gioiTinh107, diaChi107);
		this.bac107 = bac107;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc107) {
		super.nhapThongTin(sc107);
		System.out.print("\tNhap bac: ");
		bac107 = sc107.nextLine();
	}

	// ham hien thi thong tin
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tBac: " + bac107);
	}
}