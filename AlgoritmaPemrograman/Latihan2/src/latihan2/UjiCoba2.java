package latihan2;

import java.util.Scanner;

public class UjiCoba2 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        
        String name = sc.nextLine();
        char gender = sc.next().charAt(0);
        int age = sc.nextInt();
        long Mobilneo = sc.nextLong();
        double cpga = sc.nextDouble();
        
        System.out.println("Nama = " + name);
        System.out.println("gender = " + gender);
        System.out.println("age = " + age);
        System.out.println("Mobil Number = " + Mobilneo);
        System.out.println("CPGA =  " + cpga);
        
        
    }
    
}
