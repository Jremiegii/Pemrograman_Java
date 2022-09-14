package latihan2;

import java.util.Scanner;

public class LuasSegitiga {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        double Alas;
        int Tinggi;
        double Luas;
        
        System.out.print("Alas Segitiga = ");
        Alas = in.nextDouble();
        System.out.print("Tinggi Segitiga = ");
        Tinggi = in.nextInt();
        Luas = Alas*Tinggi*1/2;
        System.out.println("Luas Segitiga = " + Luas);

    }
}
