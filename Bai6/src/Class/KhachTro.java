package Class;

import java.util.Scanner;

public class KhachTro extends Nguoi {
	// thuoc tinh
	private int soNgayTro107;
	private String loaiPhong107;
	private double giaPhong107;

	// phuong thuc
	// ham khoi tao khong doi so
	public KhachTro() {

	}

	// ham khoi tao co doi so
	public KhachTro(String hoTen107, int CMND107, int soNgayTro107, String loaiPhong107, double giaPhong107) {
		this.hoTen107 = hoTen107;
		this.CMND107 = CMND107;
		this.soNgayTro107 = soNgayTro107;
		this.loaiPhong107 = loaiPhong107;
		this.giaPhong107 = giaPhong107;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc107) {
		super.nhapThongTin(sc107);

		System.out.print("\tNhap so ngay tro: ");
		soNgayTro107 = sc107.nextInt();
		sc107.nextLine();
		System.out.print("\tNhap loai phong: ");
		loaiPhong107 = sc107.nextLine();
		System.out.print("\tNhap gia phong: ");
		giaPhong107 = sc107.nextDouble();
		sc107.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tSo ngay tro: " + soNgayTro107);
		System.out.println("\tLoai phong: " + loaiPhong107);
		System.out.println("\tGia phong: " + giaPhong107);
	}

	// ham lay ra thong tin so ngay tro
	public int getSoNgayTro() {
		return soNgayTro107;
	}

	// ham lay thong tin gia phong
	public double getGiaPhong() {
		return giaPhong107;
	}
}