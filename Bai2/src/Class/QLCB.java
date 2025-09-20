package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QLCB {
	// thuoc tinh
	private ArrayList<CanBo> dscb107;

	// phuong thuc
	// ham khoi tao
	public QLCB() {
		dscb107 = new ArrayList<CanBo>(10);
	}

	// ham them can bo
	public void themCanBo(CanBo cb107) {
		dscb107.add(cb107);
	}

	// ham nhap danh sach
	public void nhapDanhSach(Scanner sc107) {
		CanBo cb107;
		System.out.print("Nhap vao so luong can bo: ");
		int n107 = sc107.nextInt();
		sc107.nextLine();

		System.out.println("Nhap thong tin chi tiet:");
		for (int i107 = 0; i107 < n107; i107++) {
			System.out.println("Lan nhap thu " + (i107 + 1) + ":");
			System.out.print("Chon can bo (1-KySu; 2-NhanVien;3-CongNhan): ");
			int chon107 = sc107.nextInt();
			sc107.nextLine();

			cb107 = new CanBo();

			switch (chon107) {
			case 1:
				cb107 = new KySu();
				break;
			case 2:
				cb107 = new NhanVien();
				break;
			case 3:
				cb107 = new CongNhan();
				break;

			default:
				cb107 = new KySu();
				break;
			}

			// sau khi chon loai can bo thi nhap thong tin cho can bo do
			cb107.nhapThongTin(sc107);

			// nhap xong roi thi them can bo vao danh sach
			themCanBo(cb107);
		}
	}
	// ham tim kiem theo ten
	public void timKiemCanBo(String hoTen107) {
		for (CanBo cb107 : dscb107) {
			if (hoTen107.equals(cb107.getHoTen())) {
				cb107.hienThiThongTin();
			}
		}
	}
}