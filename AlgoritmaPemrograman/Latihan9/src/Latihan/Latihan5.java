package Latihan;

import java.util.Scanner;

public class Latihan5 {
    
    public static void main(String[] args) {
        
        int[] hitung, cadangan;
        hitung = new int[5];
        cadangan = hitung;
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Masukan data 5 bulat = ");
        // Membaca 5 data bulat
        for(int i = 0; i <= 4; i++){
            System.out.print("Data ke " + (i+1) + " : ");
            cadangan[i] = Keyboard.nextInt();
        }
        for(int i = 0; i <= 4; i++) {
            System.out.println("Data ke "+(i+1)+" Array Cadangan adalah "+cadangan[i]);
        }
    }
}
