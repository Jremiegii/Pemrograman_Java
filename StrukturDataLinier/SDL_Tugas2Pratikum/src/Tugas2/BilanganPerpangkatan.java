package Tugas2;

import java.util.Scanner;

public class BilanganPerpangkatan {
    
    public static int Pangkat(int x, int y){
        if(y == 0){
            return 1;
        } else {
            return x*Pangkat(x,y - 1);
        }
    }
    
    public static void main(String[] agrs){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("Bilangan x : ");
        int X = in.nextInt();
        System.out.println("Bilangan y : ");
        int Y = in.nextInt();
        
        System.out.println(X + " dipangkatkan " + Y + " = " + BilanganPerpangkatan.Pangkat(X, Y));
    }
}
