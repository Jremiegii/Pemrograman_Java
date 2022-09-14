package Latihan;

import java.util.Scanner;

public class Latihan9 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int Bilangan;
        int[] hitung;
        
        System.out.print("Masukan Jumlah Bilangan = ");
        Bilangan = sc.nextInt();
        
        hitung = new int[Bilangan];
        for (int i = 0; i < Bilangan; i++) {
            System.out.print("Data Ke " + (i + 1) + ": ");
            hitung[i] = sc.nextInt(); //5,5,6,6,7
        }
        System.out.print("Duplikasi Bilangan : ");
        for (int i = 0; i < Bilangan; i++) {
            for (int j = i + 1; j < Bilangan; j++) 
                if (hitung[i] == hitung[j]) 
                    System.out.print(hitung[j]+ " ");
        }
    }
}
