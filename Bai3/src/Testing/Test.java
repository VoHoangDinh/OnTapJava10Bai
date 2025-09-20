package Testing;

import java.util.Scanner;

import Class.QuanLySach;

public class Test {

	public static void main(String[] args) {
		Scanner sc107 = new Scanner(System.in);

		QuanLySach qls107 = new QuanLySach();

		qls107.nhapDanhSachTL(sc107);

		System.out.print("\n\nNhap vao loai tai lieu can tim: ");
		String loai107 = sc107.nextLine();
		qls107.timLoaiTL(loai107);

		System.out.print("\n\nNhap vao ma tai lieu can tim: ");
		String maTL107 = sc107.nextLine();
		qls107.timMaTL(maTL107);

		sc107.close();
	}

}