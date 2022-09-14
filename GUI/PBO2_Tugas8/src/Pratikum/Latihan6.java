package Pratikum;

import java.util.Scanner;

public class Latihan6 {
    
    public static void main(String[] agrs){
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input kata : ");
        String Kata = in.nextLine();
        
        String Word1 = Kata.replaceAll("a", "4");
        String Word2 = Word1.replaceAll("I", "1");
        String Word3 = Word2.replaceAll("e", "3");
        String Word4 = Word3.replaceAll("o", "0");
        String Word5 = Word4.replaceAll("u", "11");
        
        System.out.println("Output : " + Word5);
        
    }
}
