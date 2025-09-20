package Testing;

import java.util.Scanner;

import Class.TuyenSinh;

public class Test {

	public static void main(String[] args) {
		Scanner sc107 = new Scanner(System.in);

		TuyenSinh dsTuyenSinh107 = new TuyenSinh();

		System.out.println("Nhap vao danh sach thi sinh: ");
		dsTuyenSinh107.nhapDanhSach(sc107);

		System.out.println("Danh sach thi sinh du thi la:");
		dsTuyenSinh107.hienThiDanhSach();

		System.out.print("Nhap so bao danh can tim: ");
		int soBaoDanh107 = sc107.nextInt();
		sc107.nextLine();

		dsTuyenSinh107.timKiemThiSinh(soBaoDanh107);

		sc107.close();
	}

}