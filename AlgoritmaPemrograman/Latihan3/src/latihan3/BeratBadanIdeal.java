package latihan3;

import java.util.Scanner;

public class BeratBadanIdeal {
    
    public static void main(String[] args){
        
        Scanner BeratIdeal = new Scanner(System.in);
        
        String Nama;
        double TinggiBadan;
        double BeratBadan;
        double BeratBadanIdeal;
        
        System.out.print("Nama = ");
        Nama = BeratIdeal.nextLine();
        System.out.print("Tinggi Badan = ");
        TinggiBadan = BeratIdeal.nextDouble();
        System.out.print("Berat badan = ");
        BeratBadan = BeratIdeal.nextDouble();
        
        BeratBadanIdeal = ((TinggiBadan-100) + (0.10*(TinggiBadan-100)));
        System.out.println("Berat badan Ideal = " + BeratBadanIdeal + BeratBadan);
        
    } 
}
