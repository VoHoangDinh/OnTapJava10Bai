package Class;

import java.util.Scanner;

public class KySu extends CanBo {
	// thuoc tinh
	private String nganhDaoTao107;

	// phuong thuc
	// ham khoi tao khong doi so
	public KySu() {

	}

	// ham khoi tao co doi so
	public KySu(String hoten107, String ngaySinh107, String gioiTinh107, String diaChi107, String nganhDaoTao107) {
		super(hoten107, ngaySinh107, gioiTinh107, diaChi107);
		this.nganhDaoTao107 = nganhDaoTao107;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc107) {
		super.nhapThongTin(sc107);
		System.out.print("\tNhap nganh dao tao: ");
		nganhDaoTao107 = sc107.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tNganh dao tao: " + nganhDaoTao107);
	}
}