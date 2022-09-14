package ProjectKelompok;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        MethodBantuan Data = new MethodBantuan();
        
        int Pilih = 0;
        
        Data.Informasi();
        
        while (Pilih != 5) {
            System.out.println("Selamat Datang");
            System.out.println("========================");
            System.out.println("Silahkan Pilih Opsi : ");
            System.out.println("1. Daftarkan Diri");
            System.out.println("2. Hapus Data Diri");
            System.out.println("3. Cari Data Diri");
            System.out.println("4. Tampilkan Data");
            System.out.println("5. Keluar");
            System.out.print("Masukan Opsi Pilihan = ");
            int Opsi = in.nextInt();

            switch (Opsi) {
                case 1:
                    Data.Tambah();
                    break;
                case 2:
                    Data.Hapus();
                    break;
                case 3:
                    Data.Cari();
                    break;
                case 4:
                    Data.Menampilkan();
                    break;
                case 5:
                    Data.Keluar();
                    break;
                default:
                    break;
            }
        }
    }
}
