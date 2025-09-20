package Testing;

import java.util.Scanner;

import Class.QLHS;

public class Test {

	public static void main(String[] args) {
		Scanner sc107 = new Scanner(System.in);
		
		QLHS list107 = new QLHS();
		
		list107.nhapDanhSachHS(sc107);
		
		System.out.println("Nhung hoc sinh sinh nam 1985 va que Thai Nguyen la:");
		list107.timKiemThongTin(1985, "Thai Nguyen");
		
		System.out.println("Nhung hoc sinh hoc lop 10A1 la:");
		list107.timKiemThongTin("10A1");
		
		sc107.close();
	}

}