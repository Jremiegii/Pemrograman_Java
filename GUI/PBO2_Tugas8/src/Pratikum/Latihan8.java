package Pratikum;

import java.util.Scanner;

public class Latihan8 {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Input kata : ");
        String Kata = in.nextLine();
        
        StringBuffer Word = new StringBuffer(Kata);
        
        Word.reverse();
        System.out.println("Reverse kata : " + Word);
        
        if(Kata.contentEquals(Word)){
            System.out.println("Status : Paliondrom");
        } else {
            System.out.println("Status : Bukan Paliondrom");
        }
    }   
}
