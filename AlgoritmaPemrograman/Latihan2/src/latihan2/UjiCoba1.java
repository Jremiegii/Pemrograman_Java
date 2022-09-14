package latihan2;

import java.util.Scanner;

public class UjiCoba1 {
    public static void main(String[] args){
        
        Scanner datasegitiga = new Scanner(System.in);
        
        double alas, tinggi, luas;
        System.out.println("masukan  Data Alas = ");
        alas = datasegitiga.nextDouble();
        System.out.println();
        System.out.print("Masukan Data Tinggi = ");
        tinggi = datasegitiga.nextDouble();
        
        luas = 0.5*alas*tinggi;
        System.out.println("Alas Segitiga = " + alas);
        System.out.println("Tinggi Segitiga = " + tinggi);
        System.out.println("Luas Segitiga = " + luas);
    }
}
