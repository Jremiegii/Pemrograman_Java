package Pratikum;;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Latihan10 {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Masukan kalimat:");
        String Kalimat = in.nextLine();;
        
        StringTokenizer Data = new StringTokenizer(Kalimat);
        
        System.out.println("Jumlah kata:" + Data.countTokens());
        
    }
}
