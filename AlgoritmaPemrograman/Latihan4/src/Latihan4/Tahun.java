package Latihan4;

import java.util.Scanner;

public class Tahun {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int Tahun;
        
        System.out.print("Tahun Sekarang = ");
        Tahun = in.nextInt();
        
        if (Tahun % 4 == 0){
            System.out.println("Tahun Kabisan");
        } else {
            System.out.println("Bukan Tahun  Kabisan");
        }
    }
    
}
