package latihan2;

import java.util.Scanner;

public class JarakTempuhMobil {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        int Kecepatan;
        double Waktu;
        double Jarak;
        
        System.out.print("Kecepatan = " );
        Kecepatan = in.nextInt();
        System.out.print("Waktu = " );
        Waktu = in.nextDouble();
        Jarak = Kecepatan*Waktu;
        System.out.println("Jarak Tempuh = " + Jarak);
    }
}
