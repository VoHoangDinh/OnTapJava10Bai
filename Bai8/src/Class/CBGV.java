package Class;

import java.util.Scanner;

public class CBGV extends Nguoi {
	// thuoc tinh
	private double luongCung107;
	private double thuong107;
	private double phat107;
	private double luongThucLinh107;

	// phuong thuc
	// ham khoi tao khong doi so
	public CBGV() {

	}

	// ham nhap
	public void nhapThongTin(Scanner sc107) {
		super.nhapThongTin(sc107);

		System.out.print("\tNhap luong cung: ");
		luongCung107 = sc107.nextDouble();
		sc107.nextLine();

		System.out.print("\tNhap thuong: ");
		thuong107 = sc107.nextDouble();
		sc107.nextLine();

		System.out.print("\tNhap phat: ");
		phat107 = sc107.nextDouble();
		sc107.nextLine();

		// tinh luong
		luongThucLinh107 = luongCung107 + thuong107 - phat107;
	}

	// ham hien thi thong tin
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tLuong cung: " + luongCung107);
		System.out.println("\tThuong: " + thuong107);
		System.out.println("\tPhat: " + phat107);
		System.out.println("\tLuong thuc linh: " + luongThucLinh107);
	}

	// ham lay ra thong tin ve luong thuc linh
	public double getLuongThucLinh() {
		return luongThucLinh107;
	}
}