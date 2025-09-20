package Class;

import java.util.Scanner;

public class TaiLieu {
	// thuoc tinh
	private String maTaiLieu107;
	private String tenNXB107;
	private int soBanPhatHanh107;

	// phuong thuc
	// ham khoi tao khong doi so
	public TaiLieu() {

	}

	// ham khoi tao co doi so
	public TaiLieu(String maTaiLieu107, String tenNXB107, int soBanPhatHanh107) {
		this.maTaiLieu107 = maTaiLieu107;
		this.tenNXB107 = tenNXB107;
		this.soBanPhatHanh107 = soBanPhatHanh107;
	}

	// nhap
	public void nhapThongTin(Scanner sc107) {
		System.out.print("\tNhap ma tai lieu: ");
		maTaiLieu107 = sc107.nextLine();
		System.out.print("\tNhap ten nha xuat ban: ");
		tenNXB107 = sc107.nextLine();
		System.out.print("\tNhap so ban phat hanh: ");
		soBanPhatHanh107 = sc107.nextInt();
		sc107.nextLine();
	}

	// hien thi
	public void hienThiThongTin() {
		System.out.println("\tMa tai lieu: " + maTaiLieu107);
		System.out.println("\tTen nha xuat ban: " + tenNXB107);
		System.out.println("\tSo ban phat hanh: " + soBanPhatHanh107);
	}

	// ham lay ra ma tai lieu
	public String getMaTaiLieu() {
		return maTaiLieu107;
	}
}