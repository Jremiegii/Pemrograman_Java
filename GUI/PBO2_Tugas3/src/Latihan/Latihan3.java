package Latihan;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Latihan3 extends JFrame{
    
    public Latihan3(){
        
        this.setSize(300, 500);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Ini Class turunan dari calss JFrame");
        this.setVisible(true);
        
        JPanel panel = new JPanel();
        JButton tombol = new JButton();
        tombol.setText("Ini Tombol");
        tombol.setBounds(10, 50, 100, 45);
        panel.add(tombol);
        // Membuat Label
        JLabel label = new JLabel();
        label.setText("Ini Merupakan Label");
        label.setBounds(10, 90, 700, 100);
        panel.add(label);
//         Membuat JTextField
        JTextField TextField = new JTextField();
        TextField.setText("TextField");
        TextField.setBounds(10, 200, 700, 45);
        panel.add(TextField);
//         Membuat JCheckBox
        JCheckBox CheckBox = new JCheckBox();
        CheckBox.setText("Check Box");
        CheckBox.setBounds(10, 270, 100, 45);
        panel.add(CheckBox);
//         Membuat JRadioButton
        JRadioButton RadioButton = new JRadioButton();
        RadioButton.setText("Radio Button");
        RadioButton.setBounds(10, 300, 100, 90);
        panel.add(RadioButton);
        panel.setLayout(null);
        this.add(panel);
        
    }
    
    public static void main(String[] agrs){
        
        new Latihan3();
        
    }
}
