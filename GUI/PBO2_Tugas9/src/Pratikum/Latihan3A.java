package Pratikum;

import java.io.*;

public class Latihan3A {
    
    public static void main(String[] args){
        
        FileInputStream inStream = null;
        
        File inFile = new File("ujicoba.txt");
        try{
            inStream = new FileInputStream(inFile);
        } catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        }
        
        int fileSize = (int)inFile.length();
        byte[] byteArray = new byte[fileSize];
        try{
            inStream.read(byteArray);
            for(int i = 0; i < fileSize; i++){
                System.out.print((char)byteArray[i]);
            }
            inStream.close();
        } catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
