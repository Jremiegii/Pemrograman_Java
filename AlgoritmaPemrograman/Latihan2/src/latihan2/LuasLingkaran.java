package latihan2;

import java.util.Scanner;

public class LuasLingkaran {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        double Phi;
        int Jari_Jari;
        double Luas;
        
        System.out.print("Phi Lingkaran = ");
        Phi = in.nextDouble();
        System.out.print("Jari-jari = ");
        Jari_Jari = in.nextInt();
        Luas = Phi*Jari_Jari*Jari_Jari;
        System.out.println("Luas Lingkaran = " + Luas);
    }
    
}
