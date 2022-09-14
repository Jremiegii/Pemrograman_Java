package BangunDatar;

import java.util.Scanner;

public class BangunDatarMain {
    
    public static void main(String[] agrs){
        
        Scanner in = new Scanner (System.in);

        int Banyak, Jenis;
        double Panjang, Lebar, SisiA, SisiB, SisiC, Jari_Jari;
        
        System.out.print("Masukan Jumlah Total Bangun Datar = ");
        Banyak = in.nextInt();
        BangunDatar[] Dimensi = new BangunDatar[Banyak];
        for (int i = 0; i < Dimensi.length; i++) {
            System.out.println("Jenis Bangun Datar : ");
            System.out.println("1. Segitiga");
            System.out.println("2. Persegi Panjang");
            System.out.println("3. Lingkaran");
            System.out.print("Masukan Jenis Bangun Datar = ");
            Jenis = in.nextInt();
            if (Jenis == 1) {
                System.out.print("Masukkan Nilai Sisi A = ");
                SisiA = in.nextDouble();
                System.out.print("Masukkan Nilai Sisi B = ");
                SisiB = in.nextDouble();
                System.out.print("Masukkan Nilai Sisi C = ");
                SisiC = in.nextDouble();
                Dimensi[i] = new Segitiga(); 
                ((Segitiga) Dimensi[i]).setSisiA(SisiA);
                ((Segitiga) Dimensi[i]).setSisiB(SisiB);
                ((Segitiga) Dimensi[i]).setSisiC(SisiC);
            } else if (Jenis == 2) {
                System.out.print("Masukkan Nilai Panjang = ");
                Panjang = in.nextDouble();
                System.out.print("Masukkan Nilai Lebar = ");
                Lebar = in.nextDouble();
                Dimensi[i] = new PersegiPanjang();
                ((PersegiPanjang) Dimensi[i]).setPanjang(Panjang);
                ((PersegiPanjang) Dimensi[i]).setLebar(Lebar);
            } else if (Jenis == 3) {
                System.out.print("Masukkan Nilai Jari-Jari = ");
                Jari_Jari = in.nextDouble();
                Dimensi[i] = new Lingkaran(); 
                ((Lingkaran) Dimensi[i]).setR(Jari_Jari);
            }
        }
        System.out.println("======================================================");
        System.out.println("No. |Bangun Datar     |     Keliling    |   Luas ");
        System.out.println("------------------------------------------------------");
        for (int i = 0; i < Dimensi.length; i++) {
     System.out.println((i + 1) + "    " + Dimensi[i].getClass().getSimpleName() + "         " + 
             Dimensi[i].Keliling() + "     " + Dimensi[i].Luas());
        }
        System.out.println("------------------------------------------------------");
    }
}
