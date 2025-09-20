package Class;

import java.util.Scanner;

public class CanBo {
	// thuoc tinh
	private String hoTen107;
	private String ngaySinh107;
	private String gioiTinh107;
	private String diaChi107;

	// phuong thuc
	// ham khoi tao khong doi so
	public CanBo() {

	}

	// ham khoi tao co doi so
	public CanBo(String hoten107, String ngaySinh107, String gioiTinh107, String diaChi107) {
		this.hoTen107 = hoten107;
		this.ngaySinh107 = ngaySinh107;
		this.gioiTinh107 = gioiTinh107;
		this.diaChi107 = diaChi107;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc107) {
		System.out.print("\tNhap ho ten: ");
		hoTen107 = sc107.nextLine();
		System.out.print("\tNhap ngay sinh (dd/MM/yyyy): ");
		ngaySinh107 = sc107.nextLine();
		System.out.print("\tNhap gioi tinh: ");
		gioiTinh107 = sc107.nextLine();
		System.out.print("\tNhap dia chi: ");
		diaChi107 = sc107.nextLine();
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen107);
		System.out.println("\tNgay sinh: " + ngaySinh107);
		System.out.println("\tGioi tinh: " + gioiTinh107);
		System.out.println("\tDia chi: " + diaChi107);
	}

	// ham lay thong tin ho ten
	public String getHoTen() {
		return this.hoTen107;
	}
}