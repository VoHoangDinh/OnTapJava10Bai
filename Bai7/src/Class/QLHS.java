package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QLHS {
	// thuoc tinh
	private ArrayList<HocSinh> dshs107;

	// phuong thuc
	// ham khoi tao
	public QLHS() {
		dshs107 = new ArrayList<HocSinh>(10);
	}

	// ham them hoc sinh
	public void themHS(HocSinh hs107) {
		dshs107.add(hs107);
	}

	// ham nhap danh sach
	public void nhapDanhSachHS(Scanner sc107) {
		HocSinh hs107;

		System.out.print("Nhap vao so luong hoc sinh: ");
		int n107 = sc107.nextInt();

		System.out.println("Nhap thong tin cho hoc sinh trong danh sach:");
		for (int i = 0; i < n107; i++) {
			System.out.println("\tHoc sinh thu " + (i + 1) + " la:");

			hs107 = new HocSinh();
			hs107.nhapThongTin(sc107);

			themHS(hs107);
		}
	}

	// ham hien thi
	public void hienThiDanhSach() {
		int n107 = dshs107.size();
		for (int i = 0; i < n107; i++) {
			System.out.println("\tHoc sinh thu " + (i + 1) + " la:");
			dshs107.get(i).hienThiThongTin();
		}
	}

	// ham tim kiem thong tin
	public void timKiemThongTin(int nam107, String que107) {
		for (HocSinh hs : dshs107) {
			if ((hs.getNgaySinh().getYear() + 1900 == nam107) && (que107.equals(hs.getQueQuan()))) {
				hs.hienThiThongTin();
			}
		}
	}

	public void timKiemThongTin(String lop107) {
		for (HocSinh hs : dshs107) {
			if (lop107.equals(hs.getLop())) {
				hs.hienThiThongTin();
			}
		}
	}
}