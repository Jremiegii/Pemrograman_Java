package Pratikum;

import java.util.Scanner;

public class Latihan2 {
    
    public static void main(String[] agrs){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Masukan Jarak Perjalanan Anda (km): ");
        int jarak = sc.nextInt();
        System.out.print("Masukan bnayaknya bensin yang dihabiskan (liter): ");
        int liter = sc.nextInt();
        
        int konsumsi = 0;
        try{
            konsumsi = jarak/liter;
        } catch(Exception e){
            konsumsi = 0;
        }
        
        System.out.println("Konsumsi BBM anda adalah= "+konsumsi+" km/liter");
        
    }
}
