package latihan2;

import java.util.Scanner;

public class LuasBujursangkar {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in); 
        int Sisi;
        int Luas;
        
        System.out.print("Sisi bujursangkar = ");
        Sisi = in.nextInt();
        
        Luas = Sisi*Sisi;
        System.out.println("Luas Bujursangkar = " + Luas);
        
    }
    
}
