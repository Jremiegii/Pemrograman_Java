package Pratikum;

import java.util.Scanner;

public class Latihan7 {
    
    public static void main(String[] agrs){
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("First Name : ");
        String FirstName = in.nextLine();
        System.out.print("Middle Nama : ");
        String MiddleName = in.nextLine();
        System.out.print("Last Name : ");
        String LastName = in.nextLine();
        
        StringBuffer FullName = new StringBuffer();
        FullName.append(FirstName);
        FullName.append(" ");
        FullName.append(MiddleName);
        FullName.append(" ");
        FullName.append(LastName);
        System.out.println("Full Name : " + FullName);
        
    }
}
