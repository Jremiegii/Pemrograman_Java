package latihan5;

import java.util.Scanner;

public class Zodiak {
    
    public static void main(String[] args) {
        
        Scanner RasiBintang = new Scanner(System.in);
        
        int Tanggal;
        int Bulan;
        
        System.out.print("Tanggal Lahir = ");
        Tanggal = RasiBintang.nextInt();
        System.out.print("Bulan Lahir = ");
        Bulan = RasiBintang.nextInt();
        
        if ((Tanggal >= 20 && Bulan == 1) || (Tanggal <= 18 && Bulan == 2)) {
            System.out.println("Aquarius");
        } else if ((Tanggal >= 19 && Bulan == 2) || (Tanggal <= 20 && Bulan == 3)) {
            System.out.println("Pices");
        } else if ((Tanggal >= 21 && Bulan == 3) || (Tanggal <= 19 && Bulan == 4)) {
            System.out.println("Aries");
        } else if ((Tanggal >= 20 && Bulan == 4)|| (Tanggal <= 20 && Bulan == 5 )) {
            System.out.println("Taurus");
        }  else if ((Tanggal >= 21 && Bulan == 5) || (Tanggal <= 20 && Bulan == 6)) {
            System.out.println("Gemini");
        } else if ((Tanggal >= 21 && Bulan == 6) || (Tanggal <= 22 && Bulan == 7)) {
            System.out.println("Cancer");
        } else if ((Tanggal >= 23 && Bulan == 7) || (Tanggal <= 22 && Bulan == 8)) {
            System.out.println("Leo");
        } else if ((Tanggal >= 23 && Bulan == 8) || (Tanggal <= 22 && Bulan == 9)) {
            System.out.println("Virgo");
        } else if ((Tanggal >= 23 && Bulan == 9) || (Tanggal <= 22 && Bulan == 10)) {
            System.out.println("Libra");
        } else if((Tanggal >= 23 && Bulan == 10) || (Tanggal <= 21 && Bulan == 11)) {
            System.out.println("Scorpio");
        } else if ((Tanggal >= 22 && Bulan == 11) || (Tanggal <= 21 && Bulan == 12)) {
            System.out.println("Sagitarius");
        } else if((Tanggal >= 22 && Bulan == 12 ) || (Tanggal <= 19 && Bulan == 1)) {
            System.out.println("Capricon");
        } else {
            System.out.println("Don't Kidding Me !");
        }
    }    
}
