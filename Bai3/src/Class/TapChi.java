package Class;

import java.util.Scanner;

public class TapChi extends TaiLieu {
	// thuoc tinh
	private int soPhatHanh107;
	private int thangPhatHanh107;

	// phuong thuc
	// ham khoi tao khong doi so
	public TapChi() {

	}

	// ham khoi tao co doi so
	public TapChi(String maTaiLieu107, String tenNXB107, int soBanPhatHanh107, int soPhatHanh107, int thangPhatHanh107) {
		super(maTaiLieu107, tenNXB107, soBanPhatHanh107);
		this.soPhatHanh107 = soPhatHanh107;
		this.thangPhatHanh107 = thangPhatHanh107;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc107) {
		super.nhapThongTin(sc107);
		System.out.print("\tNhap so phat hanh: ");
		soPhatHanh107 = sc107.nextInt();
		System.out.print("\tNhap thang phat hanh: ");
		thangPhatHanh107 = sc107.nextInt();
		sc107.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tSo phat hanh: " + soPhatHanh107);
		System.out.println("\tThang phat hanh: " + thangPhatHanh107);
	}
}