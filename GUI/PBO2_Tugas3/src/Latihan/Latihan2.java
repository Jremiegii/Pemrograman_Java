package Latihan;

import javax.swing.JFrame;

public class Latihan2 extends JFrame{
    
    public Latihan2(){
        
        this.setSize(300, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ini Class turunan dari clsss JFrame");
        this.setVisible(true);
        
    }
    
    public static void main(String[] agrs){
        
        new Latihan2();
        
    }
}
