package Class;
import java.util.Scanner;
public class PhanSo {
    // thuộc tính
    private int tuSo107;
    private int mauSo107;

    // phương thức
    public PhanSo() {
        tuSo107 = 0;
        mauSo107 = 1;
    }

    // hàm khởi tạo có đối số
    public PhanSo(int tuSo107, int mauSo107) {
        this.tuSo107 = tuSo107;
        this.mauSo107 = mauSo107;
    }

    public void NhapPS(Scanner sc107) {
        int a107;
        int b107;
        do {
            System.out.printf("\nNhap vao tu so: ");
            a107 = sc107.nextInt();
            System.out.printf("\nNhap vao mau so: ");
            b107 = sc107.nextInt();
            if (b107 == 0) {
                System.out.printf("Vui long nhap mau khac 0");
            } else {
                tuSo107 = a107;
                mauSo107 = b107;
            }
        } while (b107 == 0);
    }

    public void HienThi() {
        if (tuSo107 * mauSo107 < 0) {
            System.out.println("\t-" + Math.abs(tuSo107) + "/" + Math.abs(mauSo107));
        } else {
            System.out.println("\t" + Math.abs(tuSo107) + "/" + Math.abs(mauSo107));
        }
    }

    public int USCLN(int tuSo107, int mauSo107) {
        while (tuSo107 % mauSo107 != 0) {
            if (tuSo107 > mauSo107)
                tuSo107 = tuSo107 - mauSo107;
            else
                mauSo107 = mauSo107 - tuSo107;
        }
        return mauSo107;
    }

    // hàm cộng
    public PhanSo CongHaiPS(PhanSo ps2107) {
        int a107 = tuSo107 * ps2107.mauSo107 + ps2107.tuSo107 * mauSo107;
        int b107 = mauSo107 * ps2107.mauSo107;
        int USCLN107 = USCLN(a107, b107);
        a107 = a107 / USCLN107;
        b107 = b107 / USCLN107;
        return new PhanSo(a107, b107);
    }

    // hàm trừ
    public PhanSo TruHaiPS(PhanSo ps2107) {
        int a107 = tuSo107 * ps2107.mauSo107 - ps2107.tuSo107 * mauSo107;
        int b107 = mauSo107 * ps2107.mauSo107;
        int USCLN107 = USCLN(a107, b107);
        a107 = a107 / USCLN107;
        b107 = b107 / USCLN107;
        return new PhanSo(a107, b107);
    }

    // hàm nhân
    public PhanSo NhanHaiPS(PhanSo ps2107) {
        int a107 = tuSo107 * ps2107.tuSo107;
        int b107 = mauSo107 * ps2107.mauSo107;
        int USCLN107 = USCLN(a107, b107);
        a107 = a107 / USCLN107;
        b107 = b107 / USCLN107;
        return new PhanSo(a107, b107);
    }

    // hàm chia
    public PhanSo ChiaHaiPS(PhanSo ps2107) {
        int a107 = tuSo107 * ps2107.mauSo107;
        int b107 = mauSo107 * ps2107.tuSo107;
        int USCLN107 = USCLN(a107, b107);
        a107 = a107 / USCLN107;
        b107 = b107 / USCLN107;
        return new PhanSo(a107, b107);
    }

    public static void main(String[] args) {
        Scanner sc107 = new Scanner(System.in);
        PhanSo ps1107 = new PhanSo();
        PhanSo ps2107 = new PhanSo();
        PhanSo psTong107 = new PhanSo();
        int choice107;

        // Nhập ps1
        System.out.println("Nhap phan so thu 1: ");
        ps1107.NhapPS(sc107);
        // Nhập ps2
        System.out.println("Nhap phan so thu 2: ");
        ps2107.NhapPS(sc107);

        do {
            // menu
            System.out.println("\n===== MENU =====");
            System.out.println("1. Tong 2 phan so");
            System.out.println("2. Hieu 2 phan so");
            System.out.println("3. Tich 2 phan so");
            System.out.println("4. Thuong 2 phan so");
            System.out.println("0. Thoat chuong trinh");
            System.out.print("Nhap lua chon: ");
            choice107 = sc107.nextInt();

            // hiển thị
            System.out.println("\nPhan so thu nhat la: ");
            ps1107.HienThi();
            System.out.println("\nPhan so thu hai la: ");
            ps2107.HienThi();

            switch (choice107) {
                case 1:
                    // Tổng 2 ps
                    psTong107 = ps1107.CongHaiPS(ps2107);
                    System.out.println("\nTong hai phan so la: ");
                    psTong107.HienThi();
                    break;
                
                case 2:
                    // Hiệu 2 ps
                    psTong107 = ps1107.TruHaiPS(ps2107);
                    System.out.println("\nHieu hai phan so la: ");
                    psTong107.HienThi();
                    break;
                
                case 3:
                    // Tích 2 ps
                    psTong107 = ps1107.NhanHaiPS(ps2107);
                    System.out.println("\nTich hai phan so la: ");
                    psTong107.HienThi();
                    break;
                
                case 4:
                    // Thương 2 ps
                    psTong107 = ps1107.ChiaHaiPS(ps2107);
                    System.out.println("\nThuong hai phan so la: ");
                    psTong107.HienThi();
                    break;
                
                case 0:
                    System.out.println("Thoat chuong trinh");
                    break;
                
                default:
                    System.out.println("Chon 1 trong 4 lua chon tren");
                    break;
            }
        } while (choice107 != 0);
        sc107.close();
    }
}
