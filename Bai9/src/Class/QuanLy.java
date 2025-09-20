package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	// thuoc tinh
	private ArrayList<TheMuon> ds107;

	// phuong thuc
	// ham khoi tao khong doi so
	public QuanLy() {
		ds107 = new ArrayList<TheMuon>(10);
	}

	// ham them the muon vao danh sach
	public void themTheMuon(TheMuon theMuon107) {
		ds107.add(theMuon107);
	}

	// ham nhap vao danh sach
	public void nhapDanhSach(Scanner sc107) {
		TheMuon theMuon107;

		System.out.print("Nhap vao so luong the muon: ");
		int n107 = sc107.nextInt();
		sc107.nextLine();

		System.out.println("Nhap vao danh sach:");
		for (int i = 0; i < n107; i++) {
			System.out.println("The muon thu " + (i + 1) + " la:");
			theMuon107 = new TheMuon();
			theMuon107.nhapThongTin(sc107);
			themTheMuon(theMuon107);
		}
	}

	// ham hien thi danh sach
	public void hienThiDanhSachTraCuoiThang() {
		for (TheMuon the : ds107) {
			if (the.getHanTra().getDate() == 31 || the.getHanTra().getDate() == 30) {
				the.hienThiThongTin();
			}
		}
	}
}