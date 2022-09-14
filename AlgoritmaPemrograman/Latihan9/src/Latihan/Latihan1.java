package Latihan;

import java.util.Scanner;

public class Latihan1 {

    public static void main(String[] args) {
        
        int i;
        int[] hitung;
        hitung = new int[5];
        
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Masukkan 5 angka bulat: ");
        for (i = 0; i <= 4; i++) {
            hitung[i] = Keyboard.nextInt();
        }
        System.out.println();
        System.out.println("Nilai yang dimasukkan dari AKHIR ke AWAL :");
        for (i = 0; i <= 4; i++) {
            System.out.println(hitung[4 - i]);
        }
    }
}

