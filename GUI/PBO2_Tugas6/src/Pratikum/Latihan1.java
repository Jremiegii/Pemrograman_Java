package Pratikum;

import java.util.Scanner;

public class Latihan1 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukan Jarak Perjalanan Anda (km): ");
        int jarak = sc.nextInt();
        System.out.print("Masukan banyaknya besin yang dihabiskan (liter): ");
        int liter = sc.nextInt();
        
        int konsumsi = jarak/liter;
        System.out.println("Konsumsi BBM anda adalah= " +konsumsi+" km/liter");
    }
}
