package pertemuan3;

import java.util.Scanner;

public class MenghitungGajiMain {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        MenghitungGaji Hore = new MenghitungGaji();
        
        
        System.out.println("1. Golongan 1");
        System.out.println("2. Golongan 2");
        System.out.println("3. Golongan 3");
        System.out.print("Silahkan Pilih Golongan Anda = "); 
        Hore.Hierarki = in.nextInt();
        System.out.print("Silahkan Total Jam Kerja Anda = ");
        Hore.JamKerja = in.nextInt();
        System.out.println("1. Memiliki 1 Anak");
        System.out.println("2. Memiliki 2 Anak");
        System.out.println("3. Memiliki 3 Anak");
        System.out.print("Jumlah Anak Anda = ");
        Hore.JumlahAnak = in.nextInt();
        System.out.println("\n");
        
        
        System.out.println("===== Data Pegawai =====");
        System.out.println("Anda Berada Pada Golongan = " + Hore.getGajiPokok());
        System.out.println("Total Jam Kerja = " + Hore.getLamaKerja());
        System.out.println("Gaji Lembur Anda Rp. " + Hore.getHonorLembur());
        System.out.println("Jumlah Anak Anda = " + Hore.getTunjangan1());
        System.out.println("Jumlah Tunjangan Istri/Suami = " + Hore.getTunjangan2());
        System.out.println("Total Gaji Keseluruhan Rp. " + Hore.TotalGaji());
    }
}
