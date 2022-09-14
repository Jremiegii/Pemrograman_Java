package Pratikum;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Latihan9 {
    
    public static void main(String[] agrs){
        //get sentece
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Masukan sebuah kalimat");
        String sentece = scanner.nextLine();
        
        //process user sentence
        StringTokenizer tokens = new StringTokenizer(sentece);
        
        System.out.println("Kalimat anda terdiri dari kata - kata berikut ini:");
        while(tokens.hasMoreTokens())
            System.out.println(tokens.nextToken());
        
    }
}
