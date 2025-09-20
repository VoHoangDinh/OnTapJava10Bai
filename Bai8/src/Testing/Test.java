package Testing;

import java.util.Scanner;

import Class.QuanLy;

public class Test {

	public static void main(String[] args) {
		Scanner sc107 = new Scanner(System.in);

		QuanLy ql107 = new QuanLy();

		ql107.nhapDanhSach(sc107);

		System.out.println("Danh sach nhung can bo co luong >= 8 trieu la:");
		ql107.timKiem(8000000);

		sc107.close();
	}

}