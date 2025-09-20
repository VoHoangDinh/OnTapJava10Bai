package Class;

import java.util.Date;
import java.util.Scanner;

public class HoDan extends Nguoi {
	// thuoc tinh
	private int soNguoi107;
	private int soNha107;
	private Nguoi[] list107; // list la mang danh sach chua cac thanh vien trong ho

	// phuong thuc
	// ham khoi tao khong doi so
	public HoDan() {
		list107 = new Nguoi[10];
	}

	// ham khoi tao co doi so
	public HoDan(String hoTen107, Date ngaySinh107, String ngheNghiep107, int soNguoi107, int soNha107) {
		super(hoTen107, ngaySinh107, ngheNghiep107);
		this.soNguoi107 = soNguoi107;
		this.soNha107 = soNha107;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc107) {
		System.out.print("\tNhap so nguoi: ");
		soNguoi107 = sc107.nextInt();
		sc107.nextLine();
		System.out.print("\tNhap so nha: ");
		soNha107 = sc107.nextInt();
		sc107.nextLine();
		System.out.println("\tNhap thong tin cho tung nguoi trong ho:");
		for (int i = 0; i < soNguoi107; i++) {
			System.out.println("Nguoi thu " + (i + 1) + " la:");
			list107[i] = new Nguoi();
			list107[i].nhapThongTin(sc107);
		}
	}

	// hien thi
	public void hienThiThongTin() {
		System.out.println("\tSo nguoi: " + soNguoi107);
		System.out.println("\tSo nha: " + soNha107);
		System.out.println("\tThong tin cua tung nguoi trong gia dinh:");
		for (int i = 0; i < soNguoi107; i++) {
			System.out.println("Nguoi thu " + (i + 1) + " la:");
			list107[i].hienThiThongTin();
		}
	}

	// ham lay ra thanh vien trong ho dan
	public Nguoi[] getList() {
		return list107;
	}

	// ham lay ra so thanh vien trong ho gia dinh
	public int getSoNguoi() {
		return soNguoi107;
	}
}