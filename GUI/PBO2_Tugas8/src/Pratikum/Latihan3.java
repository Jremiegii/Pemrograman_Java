package Pratikum;

import java.util.Scanner;

public class Latihan3 {
    
    public static void main(String[] agrs){
        
        Scanner in = new Scanner(System.in);
        
        String Kalimat = "saya belajar java";
        System.out.println("Inputan kata : " + Kalimat);
        System.out.print("Posisi Awal : ");
        int Awal = in.nextInt();
        System.out.print("Posisi Akhir : ");
        int Akhir = in.nextInt();
        
        System.out.println("Output : " + Kalimat.substring(Awal-1, Akhir));
        
    }
}
