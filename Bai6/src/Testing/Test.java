package Testing;

import java.util.Scanner;

import Class.KhachSan;

public class Test {

	public static void main(String[] args) {
		Scanner sc107 = new Scanner(System.in);

		KhachSan ql107 = new KhachSan();

		ql107.nhapDanhSach(sc107);

		System.out.print("Nhap vao khach tro can tinh tien: ");
		int cmnd107 = sc107.nextInt();

		System.out.println("==> Tong tien la: " + ql107.tinhTien(cmnd107));

		sc107.close();
	}

}