package latihan5;

import java.util.Scanner;

public class JenisSegitiga {
    
    public static void main(String[] args) {
        
        Scanner Segitiga = new Scanner(System.in);
        
        int A;
        int B;
        int C;
        
        System.out.print("Sisi A = ");
        A = Segitiga.nextInt();
        System.out.print("Sisi B = ");
        B = Segitiga.nextInt();
        System.out.print("Sisi C = ");
        C = Segitiga.nextInt();
        
        if ((A == B) && (B == C) && (C == A)){
            System.out.println("Segitiga Sama Sisi");
        } else if ((A == B) && (A != C) && (C != B)){
            System.out.println("Segitiga Sama Kaki");
        } else if ((Math.sqrt(C^2) == (Math.sqrt(B^2) + (Math.sqrt(A^2))))){
            System.out.println("Segitiga Siku-siku");
        } else 
            System.out.println("Segitiga Sembarang");
    }
}
