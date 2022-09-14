package Pratikum;

import javax.swing.JOptionPane;

public class Latihan3A {
    
    public static void main(String[] agrs){
        
        String inputStr = JOptionPane.showInputDialog(null, "Masukan umur anda!");
        int age = Integer.parseInt(inputStr);
        
        System.out.println("Umur anda : " +age+" tahun");
        
    }
}
