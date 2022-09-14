package Pratikum;

import java.io.*;

public class Latihan1C {
    
    public static void main(String agrs[]){
        
        File file = new File("sample.txt");
        
        if(!file.exists()){
            System.out.println("Maaf, file tidak ditemukan");
        } else {
            System.out.println("Nama File : " + file.getName());
            System.out.println("Full Path : " + file.getAbsolutePath());
        }
    }   
}
