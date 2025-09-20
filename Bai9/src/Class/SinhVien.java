package Class;

import java.util.Scanner;

public class SinhVien {
	// thuoc tinh
	protected String hoTen107;
	protected String maSV107;
	protected String ngaySinh107;
	protected String lop107;

	// phuong thuc
	// ham khoi tao khong doi so
	public SinhVien() {

	}

	// ham khoi tao co doi so
	public SinhVien(String hoTen107, String maSV107, String ngaySinh107, String lop107) {
		this.hoTen107 = hoTen107;
		this.maSV107 = maSV107;
		this.ngaySinh107 = ngaySinh107;
		this.lop107 = lop107;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc107) {
		System.out.print("\tNhap ho ten: ");
		hoTen107 = sc107.nextLine();

		System.out.print("\tNhap ma sinh vien: ");
		maSV107 = sc107.nextLine();

		System.out.print("\tNhap ngay sinh: ");
		ngaySinh107 = sc107.nextLine();

		System.out.print("\tNhap lop: ");
		lop107 = sc107.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen107);
		System.out.println("\tNgay sinh: " + ngaySinh107);
		System.out.println("\tMa sinh vien: " + maSV107);
		System.out.println("\tLop: " + lop107);
	}
}