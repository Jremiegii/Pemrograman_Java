package Latihan4;

import java.util.Scanner;

public class BeratIdeal {
    
    public static void main(String[] args){
        
        Scanner BeratIdeal = new Scanner(System.in);
    
        double TinggiBadan;
        double BeratBadan;
        double BeratBadanIdeal;
        
        System.out.print("Berat Badan = ");
        BeratBadan = BeratIdeal.nextDouble();
        System.out.print("Tinggi Badan = ");
        TinggiBadan = BeratIdeal.nextDouble();

        if ((BeratBadan-TinggiBadan) <= 90 && (BeratBadan-TinggiBadan) <= 110) {
            System.out.println("Gemuk");
        } else if (BeratBadan-TinggiBadan < 90) {
            System.out.println("Ideal");
        } else if (BeratBadan-TinggiBadan >110) {
            System.out.println("Kurus");
        } else {
        }
    }         
}
