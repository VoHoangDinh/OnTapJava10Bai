package Class;

import java.util.Scanner;

public class HocSinh extends Nguoi {
	// thuoc tinh
	private String lop107;
	private String khoHoc107;
	private String kyHoc107;

	// phuong thuc
	// ham khoi tao khong doi so
	public HocSinh() {

	}

	// ham khoi tao co doi so
	public HocSinh(String hoTen107, String lop107, String khoaHoc107, String kyHoc107) {
		this.hoTen107 = hoTen107;
		this.lop107 = lop107;
		this.khoHoc107 = khoaHoc107;
		this.kyHoc107 = kyHoc107;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc107) {
		super.nhapThongTin(sc107);

		System.out.print("\tNhap lop: ");
		lop107 = sc107.nextLine();

		System.out.print("\tNhap khoa hoc: ");
		khoHoc107 = sc107.nextLine();

		System.out.print("\tNhap ky hoc: ");
		kyHoc107 = sc107.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLop: " + lop107);
		System.out.println("\tKhoa hoc: " + khoHoc107);
		System.out.println("\tKy hoc: " + kyHoc107);
	}

	// ham lay ra thong tin ve lop
	public String getLop() {
		return lop107;
	}
}