package BuildClass;

import java.util.Scanner;

public class BienLai extends KhachHang {
	// Thuoc tinh
	private int chiSoMoi107;
	private int chiSoCu107;
	private double tien107;

	// Phuong thuc
	// Ham khoi tao khong doi so
	public BienLai() {

	}

	// Ham khoi tao co doi so
	public BienLai(int chiSoMoi107, int chiSoCu107, double tien107) {
		this.chiSoMoi107 = chiSoMoi107;
		this.chiSoCu107 = chiSoCu107;
		this.tien107 = tien107;
	}

	public BienLai(String tenChuHo107, int chiSoMoi107, int chiSoCu107, double tien107) {
		this.tenChuHo107 = tenChuHo107;
		this.chiSoMoi107 = chiSoMoi107;
		this.chiSoCu107 = chiSoCu107;
		this.tien107 = tien107;
	}

	// Ham nhap
	public void nhapThongTin(Scanner sc107) {
		super.nhapThongTin(sc107);
		System.out.print("\tNhap chi so moi: ");
		chiSoMoi107 = sc107.nextInt();
		sc107.nextLine();
		System.out.print("\tNhap chi so cu: ");
		chiSoCu107 = sc107.nextInt();
		sc107.nextLine();
		tien107 = (chiSoMoi107 - chiSoCu107) * 750;
	}

	// Ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();
		System.out.println("\tChi so moi: " + chiSoMoi107);
		System.out.println("\tChi so cu: " + chiSoCu107);
		System.out.println("\tTien: : " + tien107);
	}
}