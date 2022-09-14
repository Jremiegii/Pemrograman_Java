package Latihan4;

import java.util.Scanner;

public class NilaiUjian {
    
    public static void main(String[] args){
        
        Scanner NilaiUjian = new Scanner(System.in);
        
        double UjianPertama;
        double UjianKedua;
        double UjianAkhir;
        double Hasil;
        
        System.out.print("Ujian Pertama = ");
        UjianPertama = NilaiUjian.nextDouble();
        System.out.print("UjianKedua = ");
        UjianKedua = NilaiUjian.nextDouble();
        System.out.print("Ujian Akhir = ");
        UjianAkhir = NilaiUjian.nextDouble();
        
        Hasil = (0.30*UjianPertama) + (0.30*UjianKedua) + (0.40*UjianAkhir) / 3;
        
        if (Hasil >= 80) {
            System.out.println("A");
        } else if ((Hasil <= 65) && (Hasil < 80)){
            System.out.println("B");
        } else if ((Hasil <= 55) && (Hasil < 65)) {
            System.out.println("C");
        } else if ((Hasil <= 50 ) && (Hasil < 55)) {
            System.out.println("D");
        } else if (Hasil < 50) {
            System.out.println("F");
        }
        
        System.out.println("Nilai Rata-rata Ujian = " + Hasil); 
    }
}
