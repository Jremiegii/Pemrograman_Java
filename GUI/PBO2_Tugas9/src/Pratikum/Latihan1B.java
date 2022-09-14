package Pratikum;

import java.io.File;

public class Latihan1B {
    
    public static void main(String[] agrs){
        
        File file = new File("sample.txt");
        if(!file.exists()){
            System.out.println("Maaf file tidak ditemukan");
        } else {
            System.out.println("File ditemukan");
        }
    }
}
