package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	// thuoc tinh
	private ArrayList<CBGV> ds107;

	// phuong thuc
	// ham khoi tao
	public QuanLy() {
		ds107 = new ArrayList<CBGV>(10);
	}

	// ham them can bo vao danh sach
	public void themCBGV(CBGV canBo107) {
		ds107.add(canBo107);
	}

	// ham nhap vao danh sach
	public void nhapDanhSach(Scanner sc107) {
		CBGV canBo107;

		System.out.print("Nhap vao so luong can bo: ");
		int n107 = sc107.nextInt();
		sc107.nextLine();

		System.out.println("Nhap vao danh sach:");
		for (int i = 0; i < n107; i++) {
			System.out.println("Can bo thu " + (i + 1) + " la:");
			canBo107 = new CBGV();
			canBo107.nhapThongTin(sc107);
			themCBGV(canBo107);
		}
	}

	// ham hien thi danh sach
	public void hienThiDanhSach() {
		for (CBGV cb : ds107) {
			cb.hienThiThongTin();
		}
	}

	// ham tim kiem
	public void timKiem(double luong107) {
		for (CBGV cb : ds107) {
			if (cb.getLuongThucLinh() >= luong107) {
				cb.hienThiThongTin();
			}
		}
	}
}