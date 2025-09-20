package BuildClass;

import java.util.Scanner;

public class KhachHang {
	// Thuoc tinh
	protected String tenChuHo107;
	protected int soNha107;
	protected String maCongTo107;

	// Phuong thuc
	// Ham khoi tao khong doi so
	public KhachHang() {

	}

	// Ham khoi tao co doi so
	public KhachHang(String tenChuHo107, int soNha107, String maCongTo107) {
		this.tenChuHo107 = tenChuHo107;
		this.soNha107 = soNha107;
		this.maCongTo107 = maCongTo107;
	}

	// Ham nhap
	public void nhapThongTin(Scanner sc107) {
		System.out.print("\tNhap ten chu ho: ");
		tenChuHo107 = sc107.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha107 = sc107.nextInt();
		sc107.nextLine();
		System.out.print("\tNhap ma cong to: ");
		maCongTo107 = sc107.nextLine();
	}

	// Hm hien thi
	public void hienThiThongTin() {
		System.out.println("\tTen chu ho: " + tenChuHo107);
		System.out.println("\tSo nha: " + soNha107);
		System.out.println("\tMa cong to: " + maCongTo107);
	}
}