package Latihan;

import java.util.Scanner;

public class Latihan6 {
    
    public static void main(String[] args) {
        float Rata_rata, Total = 0;
        int  Minimal, Maksimal;
        int[] hitung;
        hitung = new int[5];
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Masukkan 5 data bulat = ");
        for (int i = 0; i <= 4; i++) {
            System.out.print("Data ke " + (i + 1) + " : ");
            hitung[i] = Keyboard.nextInt();
        }
        for (int i = 0; i <= 4; i++) {
            System.out.println("Data ke " + (i + 1) + " array hitung adalah " + hitung[i]);
            Total = Total + hitung[i]; //1,2,3,4,5
        }
        Rata_rata = Total / hitung.length;
        System.out.println("Nilai Rata-Rata Array Hitung Adalah = " + Rata_rata);
        Maksimal = hitung[0];   
        Minimal = hitung[0];   
        for (int i=0; i<hitung.length; i++){
            if(hitung[i] > Maksimal){ 
                Maksimal = hitung[i];  
            }
            else if(hitung[i] < Minimal){
                Minimal = hitung[i]; 
            }    
        }
        System.out.println("Nilai Minimal = " + Minimal);
        System.out.println("Nilai Maksimal = " + Maksimal);
    }
}
