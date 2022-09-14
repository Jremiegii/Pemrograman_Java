package Latihan8;

import java.util.Scanner;

public class TugasForIf2 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int Perulangan, Baris, Kolom;
        
        System.out.print("Jumlah Perulangan = ");
        Perulangan = in.nextInt();
        
        for (Baris = 1; Baris <= Perulangan; Baris++){
            for (Kolom = 0; Kolom < Perulangan; Kolom++){
                if (Kolom == Perulangan - Baris)
                    System.out.print(Kolom + " ");
                else
                    System.out.print(" . ");
            }
            System.out.println(" ");
        }   
    } 
}
