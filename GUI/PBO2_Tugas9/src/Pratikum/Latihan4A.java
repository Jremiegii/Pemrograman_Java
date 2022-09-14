package Pratikum;

import java.io.*;

public class Latihan4A {
    
    public static void main(String[] args){
        
        FileOutputStream outStream = null;
        String info = "Ayo berlatih Stream";
        
        File outFile = new File("ujicobaOutputStream.txt");
        try{
            outStream = new FileOutputStream(outFile);
            outStream.write(info.getBytes());//info.getBytes()
            outStream.close();
        } catch (FileNotFoundException ex){
            System.out.println(ex.getMessage());
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
