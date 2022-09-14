package latihan3;

import java.util.Scanner;

public class KelilingDanLuasLingkaran {
    
    public static void main(String[] args){
        
        Scanner Lingkaran = new Scanner(System.in);
        
        double Phi;
        int jari_jari;
        double Luas;
        double Keliling;
        
        System.out.print("Phi Lingkaran = ");
        Phi = Lingkaran.nextDouble();
        System.out.print("Jari-jari lingkaran = ");
        jari_jari = Lingkaran.nextInt();
        
        Luas = (Phi*jari_jari*jari_jari);
        System.out.println("Luas Lingkaran = " + Luas);
        
        Keliling = (Phi*2*jari_jari);
        System.out.println("Keliling Lingkaran = " + Keliling);
    }
}
