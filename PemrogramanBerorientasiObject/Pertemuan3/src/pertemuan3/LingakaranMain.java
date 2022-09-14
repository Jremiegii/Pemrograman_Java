package pertemuan3;

import java.util.Scanner;

public class LingakaranMain {

    public static void main(String[] args) {
        
        Scanner in = new Scanner (System.in);
        
        Lingkaran Circel = new Lingkaran();
        
        System.out.print("Masukan Jari-Jari = ");
        Circel.jari = in.nextInt();
        System.out.println("Luas Lingkaran Andalah = " + Circel.Luas());
        System.out.println("Keliling Lingakaran Andalah = " + Circel.Keliling());
    }
}
