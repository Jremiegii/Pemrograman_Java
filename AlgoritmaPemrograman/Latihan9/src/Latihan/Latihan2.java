package Latihan;

import java.util.Scanner;

public class Latihan2 {
    
    public static void main (String[] args){
        
        int i;
        int[] hitung, H;
        hitung = new int[5];
        
        Scanner Keyboard = new Scanner(System.in);
        System.out.println("Masukkan 5 nomor : ");
        for (i = 0; i <= 4; i++) {
            hitung[i] = Keyboard.nextInt();
        }
        H = hitung;
        System.out.println();
        System.out.println("Isi array hitung dari AKHIR ke AWAL: ");
        for (i = 0; i <= 4; i++) {
            System.out.println(hitung[4 - i]);
        }
        System.out.println("Isi array H dari AKHIR ke AWAL: ");
        for (i = 0; i <= 4; i++) {
            System.out.println(H[4 - i]);
        }  
    }
}
