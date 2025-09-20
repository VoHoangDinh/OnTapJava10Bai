package UseClass;

import java.util.Scanner;

import BuildClass.QuanLy;

public class Using {

	public static void main(String[] args) {
		Scanner sc107 = new Scanner(System.in);

		QuanLy ql107 = new QuanLy();
		ql107.nhapDanhSach(sc107);

		System.out.println("Danh sach bien lai cua cac ho gia dinh la:");
		ql107.hienThiDanhSach();

		sc107.close();
	}

}