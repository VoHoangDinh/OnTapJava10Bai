package Class;

import java.util.Scanner;

public class NhanVien extends CanBo {
	// thuoc tinh
	private String congViec107;

	// phuong thuc
	// ham khoi tao khong doi so
	public NhanVien() {

	}

	// ham khoi tao co doi so
	public NhanVien(String hoten107, String ngaySinh107, String gioiTinh107, String diaChi107, String congViec107) {
		super(hoten107, ngaySinh107, gioiTinh107, diaChi107);
		this.congViec107 = congViec107;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc107) {
		super.nhapThongTin(sc107);
		System.out.print("\tNhap cong viec: ");
		congViec107 = sc107.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tCong viec: " + congViec107);
	}
}