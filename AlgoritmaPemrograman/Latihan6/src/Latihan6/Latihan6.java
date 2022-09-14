package Latihan6;

import java.util.Scanner;

public class Latihan6 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        int Jumlah;
        
        System.out.print("Masukan Jumlah = ");
        Jumlah = in.nextInt();
        
        do {
            System.out.println(Jumlah + ". Fransiskus Jremiegi Saputra ");
            Jumlah--;
        } while (Jumlah > 0 );
    }
}
