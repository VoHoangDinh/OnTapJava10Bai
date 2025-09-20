package Class;

import java.util.ArrayList;
import java.util.Date;
import java.util.Scanner;

public class KhuPho {
	// thuoc tinh
	private ArrayList<HoDan> dshd107;

	// phuong thuc
	// ham khoi tao
	public KhuPho() {
		dshd107 = new ArrayList<HoDan>(10);
	}

	// ham them 1 ho dan
	public void themHoDan(HoDan hoDan107) {
		dshd107.add(hoDan107);
	}

	// ham nhap vao danh sach ho dan
	public void nhapDanhSach(Scanner sc107) {
		HoDan hoDan107;

		System.out.print("Nhap vao so ho dan: ");
		int soHoDan107 = sc107.nextInt();
		sc107.nextLine();

		System.out.println("Nhap vao thong tin cho tung ho dan:");
		for (int i = 0; i < soHoDan107; i++) {
			System.out.println("Ho dan thu " + (i + 1) + " la:");
			hoDan107 = new HoDan();
			hoDan107.nhapThongTin(sc107);
			themHoDan(hoDan107);
		}
	}

	// ham hien thi danh sach
	public void hienThiDanhSach() {
		int n107 = dshd107.size();

		for (int i = 0; i < n107; i++) {
			System.out.println("Ho dan thu " + (i + 1) + " la:");
			dshd107.get(i).hienThiThongTin();
		}
	}

	// ham tim kiem thong tin
	public void timKiemThongTin() {
		// lay ra duoc nam hien tai
		Date now107 = new Date();
		int namHienTai107 = now107.getYear() + 1900;

		Nguoi[] dstv107 = null;

		for (HoDan hoDan107 : dshd107) {
			dstv107 = hoDan107.getList();
			for (int i = 0; i < hoDan107.getSoNguoi(); i++) {
				if (namHienTai107 - (dstv107[i].getNgaySinh().getYear() + 1900) == 80) {
					hoDan107.hienThiThongTin();
				}
			}
		}
	}
}