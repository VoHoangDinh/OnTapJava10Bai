package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class TheMuon extends SinhVien {
	// thuoc tinh
	private int soMuon107;
	private Date ngayMuon107;
	private Date hanTra107;
	private String soHieu107;

	// phuong thuc
	// ham khoi tao khong doi so
	public TheMuon() {

	}

	// ham khoi tao co doi so
	public TheMuon(int soMuon107, Date ngayMuon107, String soHieu107) {
		this.soMuon107 = soMuon107;
		this.ngayMuon107 = ngayMuon107;
		this.soHieu107 = soHieu107;
	}

	// ham nhap
	public void nhapThongTin(Scanner sc107) {
		super.nhapThongTin(sc107);

		System.out.print("\tNhap so muon: ");
		soMuon107 = sc107.nextInt();
		sc107.nextLine();

		System.out.print("\tNhap ngay muon: ");
		String strNgayMuon107 = sc107.nextLine();
		ngayMuon107 = strToDate(strNgayMuon107);

		String strNgayTra107 = "31-12-2020";
		hanTra107 = strToDate(strNgayTra107);

		System.out.println("\tNhap so hieu: ");
		soHieu107 = sc107.nextLine();
	}

	private Date strToDate(String strNgayMuon107) {
		Date date = null;

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date = sdf.parse(strNgayMuon107);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date;
	}

	// ham hien thi
	public void hienThiThongTin() {
		super.hienThiThongTin();

		System.out.println("\tSo phieu muon: " + soMuon107);
		System.out.println("\tNgay muon: " + ngayMuon107);
		System.out.println("\tHan tra: " + hanTra107);
		System.out.println("\tSo hieu: " + soHieu107);
	}

	// ham lay ra thong tin ve han tra
	public Date getHanTra() {
		return hanTra107;
	}
}