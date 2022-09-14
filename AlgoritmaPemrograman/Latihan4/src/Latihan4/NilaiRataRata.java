package Latihan4;

import java.util.Scanner;

public class NilaiRataRata {

    public static void main(String[] args) {
        
        Scanner Ujian = new Scanner(System.in);
        
        double Ujian1;
        double Ujian2;
        double Ujian3;
        double Ujian4;
        double Rata_rata;
        
        System.out.print("Nilai Ujian Pertama = ");
        Ujian1 = Ujian.nextDouble();
        System.out.print("Nilai Ujian Kedua = ");
        Ujian2 = Ujian.nextDouble();
        System.out.print("Nilai Ujian Ketiga = ");
        Ujian3 = Ujian.nextDouble();
        System.out.print("Nilai Ujian Keempat = ");
        Ujian4 = Ujian.nextDouble();
        
        Rata_rata = (Ujian1 + Ujian2 + Ujian3 + Ujian4) / 4;
        System.out.println("Nilai Rata-rata Ujian = " + Rata_rata);
        
        if (Rata_rata > 60){
            System.out.println("Lulus");
        } else {
            System.out.println("Tidak Lulus");
        }           
    }   
}
