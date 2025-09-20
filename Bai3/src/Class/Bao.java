package Class;

import java.util.Scanner;

public class Bao extends TaiLieu {
	// thuoc tinh
	private String ngayPhatHanh107;

	// phuong thuc
	// ham khoi tao khong doi so
	public Bao() {

	}

	// ham khoi tao co doi so
	public Bao(String maTaiLieu107, String tenNXB107, int soBanPhatHanh107, String ngayPhatHanh107) {
		super(maTaiLieu107, tenNXB107, soBanPhatHanh107);
		this.ngayPhatHanh107 = ngayPhatHanh107;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc107) {
		super.nhapThongTin(sc107);
		System.out.print("\tNhap ngay phat hanh: ");
		ngayPhatHanh107 = sc107.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tNgay phat hanh: " + ngayPhatHanh107);
	}
}