package Pratikum;

import javax.swing.JOptionPane;

public class Latihan3B {
    
    public static void main(String[] agrs){
        
        String inputStr = JOptionPane.showInputDialog(null, "Masukan umur anda!");
        
        int age;
        try{
            age = Integer.parseInt(inputStr);
        } catch(Exception e){
            age = 0;
            System.out.println("Tidak Terdefenisikan!");
        }
        System.out.println("Umur anda : "+age+" tahun");
    }
}
