package Latihan;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Latihan4 extends JFrame{
    
    public Latihan4(){
        
        this.setSize(300, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Find");
        this.setVisible(true);
        
        JPanel Panel = new JPanel();
        
        // Membuat Teks
        JLabel Label = new JLabel();
        Label.setText("keyword:");
        Label.setBounds(80, 0, 100, 100);
        Panel.add(Label);
        // Membuat Memasukan Teks
        JTextField TextField = new JTextField();
        TextField.setBounds(10, 70, 200, 20);
        Panel.add(TextField);
        // Membuat Tombol
        JButton Button = new JButton();
        Button.setText("Find");
        Button.setBounds(70, 100, 70, 25);
        Panel.add(Button);
        Panel.setLayout(null);
        this.add(Panel);
        
    }
    
    public static void main(String[] agrs){
        
        new Latihan4();
        
    }
}
