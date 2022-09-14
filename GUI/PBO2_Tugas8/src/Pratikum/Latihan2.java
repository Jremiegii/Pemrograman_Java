package Pratikum;

import java.util.Arrays;
import java.util.Scanner;

public class Latihan2 {
    
    public static void main(String[] agrs){
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input kata : ");
        String Kata = in.nextLine();
        
        char[] Data = Kata.toCharArray();
        Arrays.sort(Data);
        
        String Urutan = new String(Data);
        
        System.out.println("Urutan huruf: " + Urutan);
        
    }
}
