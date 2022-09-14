package Pratikum;

import java.util.Scanner;

public class Latihan5 {
    
    public static void main(String[] agrs){
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Input : ");
        String input = sc.next();
        String result = input.replaceAll("[aiueo]", "#");
        System.out.println("Output : " + result);
        
    }
}
