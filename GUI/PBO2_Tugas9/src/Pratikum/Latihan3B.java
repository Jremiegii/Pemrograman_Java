package Pratikum;

import java.io.*;
import javax.swing.JFileChooser;

public class Latihan3B {
    
    public static void main(String[] agrs){
        
        JFileChooser chooser = new JFileChooser();
        chooser.showOpenDialog(null);
        
        File Data = chooser.getSelectedFile();
        String BackUp = chooser.getName(Data);
        
        FileInputStream inStream = null;
        File inFile = new File("ujiCoba.txt");
        
        try{
            inStream = new FileInputStream(inFile);
        } catch (FileNotFoundException ex) {
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
        } catch (IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}
