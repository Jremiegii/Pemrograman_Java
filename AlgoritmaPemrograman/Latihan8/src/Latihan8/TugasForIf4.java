package Latihan8;

import java.util.Scanner;

public class TugasForIf4 {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int Perulangan, Baris, Kolom;
        
        System.out.print("Jumlah Perulangan = ");
        Perulangan = in.nextInt();
        
        for (Baris = 0; Baris < Perulangan; Baris++) {
            for (Kolom = 0; Kolom < Perulangan; Kolom++) {
                if (Baris == Kolom || Kolom == Perulangan - Baris - 1)
                    System.out.print(" $ ");
                else if (Baris == 0 || Baris == Perulangan - 1)
                    System.out.print(" $ ");
                else 
                    System.out.print(" . ");
            }
            System.out.println(" ");
        } 
    } 
}
