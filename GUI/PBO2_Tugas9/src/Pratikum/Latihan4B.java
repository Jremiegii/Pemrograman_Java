package Pratikum;

import java.io.*;
import java.util.Scanner;
import javax.swing.JFileChooser;

public class Latihan4B {
    
    public static void main(String[] agrs){
        
        Scanner in = new Scanner(System.in);
        
        JFileChooser chooser = new JFileChooser();
        chooser.showSaveDialog(null);
        
        int info = chooser.showSaveDialog(null);
        
        if(info == JFileChooser.APPROVE_OPTION){
            System.out.println("Masukan Isi Pesan : ");
            String Pesan = in.nextLine();
            File Data = chooser.getSelectedFile();
            
            try{
                FileWriter Write = new FileWriter(Data.getPath());
                Write.write(Pesan);
                Write.flush();
                Write.close();
            } catch (Exception ex){
                System.out.println("Error " + ex.getMessage());
            }
        }
    }
}
