package Latihan7;

public class Latihan4 {
    
    public static void main(String[] args){
        
        int baris, kolom;
        
        for (baris= 0; baris < 5; baris++){
            for (kolom = 0; kolom < 5; kolom++){
                if (kolom == baris)
                    System.out.print(kolom + " ");
                else 
                    System.out.print(" . ");
                }
             System.out.println(" ");   
        }
    }     
}
