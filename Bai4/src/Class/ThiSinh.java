package Class;

import java.util.Scanner;

public class ThiSinh {
	// thuoc tinh
	private int soBD107;
	private String hoTen107;
	private String diaChi107;
	private String dienUuTien107;

	// phuong thuc
	// ham khoi tao khong doi so
	public ThiSinh() {

	}

	// ham khoi tao co doi so
	public ThiSinh(int soBD107, String hoTen107, String diaChi107, String dienUuTien107) {
		this.soBD107 = soBD107;
		this.hoTen107 = hoTen107;
		this.diaChi107 = diaChi107;
		this.dienUuTien107 = dienUuTien107;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc107) {
		System.out.print("\tNhap so bao danh: ");
		soBD107 = sc107.nextInt();
		sc107.nextLine();
		System.out.print("\tNhap ho ten: ");
		hoTen107 = sc107.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi107 = sc107.nextLine();
		System.out.print("\tNhap dien uu tien: ");
		dienUuTien107 = sc107.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tSo bao danh: " + soBD107);
		System.out.println("\tHo ten: " + hoTen107);
		System.out.println("\tDia chi: " + diaChi107);
		System.out.println("\tDien uu tien: " + dienUuTien107);
	}

	// ham lay ra thong tin ve so bao danh
	public int getSoBD() {
		return soBD107;
	}
}