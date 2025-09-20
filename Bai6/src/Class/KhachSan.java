package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class KhachSan {
	// thuoc tinh
	private ArrayList<KhachTro> ds107;

	// phuong thuc
	// ham khoi tao
	public KhachSan() {
		ds107 = new ArrayList<KhachTro>(10);
	}

	// ham them khach tro vao khach san
	public void themKhachTro(KhachTro kt107) {
		ds107.add(kt107);
	}

	// ham nhap danh sach
	public void nhapDanhSach(Scanner sc107) {
		KhachTro khach107;

		System.out.print("Nhap vao so luong khach: ");
		int n107 = sc107.nextInt();
		sc107.nextLine();

		System.out.println("Nhap vao thong tin khach tro:");
		for (int i = 0; i < n107; i++) {
			System.out.println("Khach tro thu " + (i + 1) + " la:");
			khach107 = new KhachTro();
			khach107.nhapThongTin(sc107);
			themKhachTro(khach107);
		}
	}

	// ham hien thi
	public void hienThiDanhSach() {
		for (KhachTro khach : ds107) {
			khach.hienThiThongTin();
		}
	}

	// ham tinh tien
	public double tinhTien(int CMND107) {
		double tien107 = 0;

		for (KhachTro khach : ds107) {
			if (khach.getCMND() == CMND107) {
				tien107 = khach.getSoNgayTro() * khach.getGiaPhong();
			}
		}

		return tien107;
	}
}