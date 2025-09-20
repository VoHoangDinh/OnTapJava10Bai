package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class TuyenSinh {
	// thuoc tinh
	private ArrayList<ThiSinh> dsts107;

	// phuong thuc
	public TuyenSinh() {
		dsts107 = new ArrayList<ThiSinh>(10);
	}

	// ham them 1 thi sinh
	public void themThiSinh(ThiSinh ts107) {
		dsts107.add(ts107);
	}

	// nhap danh sach
	public void nhapDanhSach(Scanner sc107) {
		ThiSinh ts107;
		int chon107;

		System.out.print("Nhap vao so luong thi sinh: ");
		int n107 = sc107.nextInt();
		sc107.nextLine();

		for (int i107 = 0; i107 < n107; i107++) {
			System.out.println("Thi sinh thuoc khoi nao (1-KhoiA; 2-KhoiB; 3-KhoiC): ");
			chon107 = sc107.nextInt();

			switch (chon107) {
			case 1:
				ts107 = new KhoiA("Toan", "Ly", "Hoa");
				break;
			case 2:
				ts107 = new KhoiB("Toan", "Hoa", "Sinh");
				break;
			case 3:
				ts107 = new KhoiC("Van", "Su", "Dia");
				break;
			default:
				ts107 = new KhoiA("Toan", "Ly", "Hoa");
				break;
			}

			ts107.nhapThongTin(sc107);
			themThiSinh(ts107);
		}
	}

	// ham hien thi
	public void hienThiDanhSach() {
		int n = dsts107.size();
		for (int i = 0; i < n; i++) {
			System.out.println("Thi sinh thu " + (i + 1) + " la:");
			dsts107.get(i).hienThiThongTin();
		}
	}

	// tim kiem thi sinh theo so bao danh
	public void timKiemThiSinh(int soBaoDanh107) {
		for (ThiSinh ts107 : dsts107) {
			if (ts107.getSoBD() == soBaoDanh107) {
				ts107.hienThiThongTin();
			}
		}
	}
}