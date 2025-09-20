package Testing;

import java.util.Scanner;

import Class.QLCB;

public class Test {

	public static void main(String[] args) {
		Scanner sc107 = new Scanner(System.in);

		QLCB qlcb107 = new QLCB();

		qlcb107.nhapDanhSach(sc107);

		System.out.print("Nhap vao ho ten can tim kiem: ");
		String name107 = sc107.nextLine();

		qlcb107.timKiemCanBo(name107);

		// huy sc
		sc107.close();
	}

}