package Latihan8;

import java.util.Scanner;

public class TugasFor4 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int Perulangan, Baris, Kolom;
        
        System.out.print("Jumlah Perulangan = ");
        Perulangan = in.nextInt();
        
        for(Baris = 1; Baris <= Perulangan; Baris++){
            for (Kolom = 1; Kolom < Perulangan; Kolom++) {
                System.out.print(Kolom * Baris + " ");
            }
            System.out.println(Baris * Kolom + " ");
        } 
    }  
}
