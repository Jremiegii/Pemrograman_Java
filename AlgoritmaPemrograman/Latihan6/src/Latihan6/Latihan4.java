package Latihan6;

import java.util.Scanner;

public class Latihan4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        double nilai;
        
        do {
            System.out.print("Nilai : ? ");
            nilai = sc.nextDouble();
            
        } while (nilai < 0 || nilai > 100);
        
        System.out.println("Nilai = " + nilai);
    }
}
