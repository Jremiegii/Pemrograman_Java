package Pratikum;

import java.util.Scanner;

public class Latihan4 {
    
    public static void main(String[] agrs){
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Kalimat 1 : ");
        String Data1 = in.nextLine();
        System.out.print("Kalimat 2 : ");
        String Data2 = in.nextLine();
        String Data3 = Data1.concat(" " + Data2);
        System.out.println("Ouput : " + Data3);
        
    }
}
