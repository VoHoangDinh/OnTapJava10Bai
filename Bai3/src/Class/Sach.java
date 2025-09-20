package Class;

import java.util.Scanner;

public class Sach extends TaiLieu {
	// thuoc tinh
	private String tacGia107;
	private int soTrang107;

	// phuong thuc
	// ham khoi tao khong doi so
	public Sach() {

	}

	// ham khoi tao co doi so
	public Sach(String maTaiLieu107, String tenNXB107, int soBanPhatHanh107, String tacGia107, int soTrang107) {
		super(maTaiLieu107, tenNXB107, soBanPhatHanh107);
		this.tacGia107 = tacGia107;
		this.soTrang107 = soTrang107;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc107) {
		super.nhapThongTin(sc107);
		System.out.print("\tNhap tac gia: ");
		tacGia107 = sc107.nextLine();
		System.out.print("\tNhap so trang: ");
		soTrang107 = sc107.nextInt();
		sc107.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\ttac gia: " + tacGia107);
		System.out.println("\tSo trang: " + soTrang107);
	}
}