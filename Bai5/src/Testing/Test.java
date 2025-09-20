package Testing;

import java.util.Scanner;

import Class.KhuPho;

public class Test {

	public static void main(String[] args) {
		Scanner sc107 = new Scanner(System.in);

		KhuPho qlkp107 = new KhuPho();

		qlkp107.nhapDanhSach(sc107);

		System.out.println("Danh sach ho dan co nguoi 80 tuoi la:");
		qlkp107.timKiemThongTin();
	}

}