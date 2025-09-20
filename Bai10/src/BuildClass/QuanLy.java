package BuildClass;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLy {
	// Thuoc tinh
	private ArrayList<BienLai> ds107;

	// Phuong thuc
	// Ham khoi tao
	public QuanLy() {
		ds107 = new ArrayList<BienLai>(10);
	}

	// Ham them bien lai vao danh sach
	public void themBienLai(BienLai bienLai107) {
		ds107.add(bienLai107);
	}

	// Ham nhap danh sach
	public void nhapDanhSach(Scanner sc107) {
		BienLai bienLai107;
		System.out.print("Nhap vao so luong bien lai: ");
		int n107 = sc107.nextInt();
		sc107.nextLine();
		System.out.println("Nhap vao danh sach bien lai:");
		for (int i = 0; i < n107; i++) {
			System.out.println("Bien lai thu " + (i + 1) + " la:");
			bienLai107 = new BienLai();
			bienLai107.nhapThongTin(sc107);

			themBienLai(bienLai107);
		}
	}

	// Ham hien thi danh sach
	public void hienThiDanhSach() {
		for (int i = 0; i < ds107.size(); i++) {
			System.out.println("Bien lai thu " + (i + 1) + " la:");
			ds107.get(i).hienThiThongTin();
			System.out.println();
		}
	}
}