package Class;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Nguoi {
	// thuoc tinh
	protected String hoTen107;
	protected Date ngaySinh107;
	protected String queQuan107;

	// phuong thuc
	// ham khoi tao khong doi so
	public Nguoi() {

	}

	// ham khoi tao co doi so
	public Nguoi(String hoTen107, Date ngaySinh107, String queQuan107) {
		this.hoTen107 = hoTen107;
		this.ngaySinh107 = ngaySinh107;
		this.queQuan107 = queQuan107;
	}

	// ham nhap vao thong tin
	public void nhapThongTin(Scanner sc107) {
		System.out.print("\tNhap ho ten: ");
		sc107.nextLine();
		hoTen107 = sc107.nextLine();

		System.out.print("\tNhap ngay sinh: ");
		String strDate107 = sc107.nextLine();
		ngaySinh107 = strToDate(strDate107);

		System.out.print("\tNhap que quan: ");
		queQuan107 = sc107.nextLine();
	}

	private Date strToDate(String strDate107) {
		Date date = null;

		SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");

		try {
			date = sdf.parse(strDate107);
		} catch (ParseException e) {
			System.out.println("Loi dinh dang ngay thang!");
		}

		return date;
	}

	// ham hien thi
	public void hienThiThongTin() {
		System.out.println("\tHo ten: " + hoTen107);
		System.out.println("\tNgay sinh: " + ngaySinh107);
		System.out.println("\tQue quan: " + queQuan107);
	}

	// ham lay ra que quan
	public String getQueQuan() {
		return queQuan107;
	}

	// ham lay ra thong tin ve ngay sinh
	public Date getNgaySinh() {
		return ngaySinh107;
	}
}