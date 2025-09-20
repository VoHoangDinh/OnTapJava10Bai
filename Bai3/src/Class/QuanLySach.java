package Class;

import java.util.ArrayList;
import java.util.Scanner;

public class QuanLySach {
	// thuoc tinh
	private ArrayList<TaiLieu> dstl107;

	// phuong thuc
	// ham khoi tao
	public QuanLySach() {
		dstl107 = new ArrayList<TaiLieu>(10);
	}

	// them moi 1 tai lieu
	public void themTaiLieu(TaiLieu tl107) {
		dstl107.add(tl107);
	}

	// nhap danh sach tai lieu
	public void nhapDanhSachTL(Scanner sc107) {
		int chon107;
		String stop107;
		TaiLieu tl107;

		do {
			System.out.print("Chon loai tai lieu (1-Sach; 2-TapChi; 3-Bao): ");
			chon107 = sc107.nextInt();
			sc107.nextLine();

			switch (chon107) {
			case 1:
				tl107 = new Sach();
				break;
			case 2:
				tl107 = new TapChi();
				break;
			case 3:
				tl107 = new Bao();
				break;

			default:
				tl107 = new Sach();
				break;
			}

			tl107.nhapThongTin(sc107);
			themTaiLieu(tl107);

			System.out.print("\nBan co muon nhap vao nua hay khong (c/k): ");
			stop107 = sc107.nextLine();
		} while (stop107.equals("c"));
	}

	// tim kiem theo ma tai lieu
	public void timMaTL(String maTL107) {
		for (TaiLieu tl107 : dstl107) {
			if (maTL107.equals(tl107.getMaTaiLieu())) {
				tl107.hienThiThongTin();
			}
		}
	}

	// tim kiem theo loai tai lieu
	public void timLoaiTL(String loai107) {
		for (TaiLieu tl107 : dstl107) {
			if (loai107.equals("Sach") && (tl107 instanceof Sach)) {
				tl107.hienThiThongTin();
			} else if (loai107.equals("TapChi") && (tl107 instanceof TapChi)) {
				tl107.hienThiThongTin();
			} else if (loai107.equals("Bao") && (tl107 instanceof Bao)) {
				tl107.hienThiThongTin();
			}
		}
	}
}