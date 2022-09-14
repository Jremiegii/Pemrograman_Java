package Pratikum;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Latihan1C extends JFrame{
    
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 300;
    private static final int FRAME_Y_ORIGIN = 100;
    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 40;
    private JButton cancelButton;
    private JButton okButton;
    private JTextField txtField;
    private JLabel Teks;
    private JRadioButton JenisKelamin;
    private JCheckBox Hobi;
    
    public static void main(String[] args) {
        
        Latihan1C frame = new Latihan1C();
        frame.setVisible(true);
        
    }
    
    public Latihan1C(){
        
        Container contentPane = getContentPane();
        
        //set the frame properties
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(true);
        setTitle("Program Latihan 1C");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
        //set the content pane properties
        contentPane.setLayout(null);
        contentPane.setBackground(Color.white);
        
        JPanel Panel = new JPanel();
        
        // Membuat Bagian Nama
        Teks = new JLabel();
        Teks.setText("Nama:");
        Teks.setBounds(10, 25, 70, 10);
        contentPane.add(Teks);
        txtField = new JTextField();
        txtField.setBounds(100, 20, 200, 25);
        contentPane.add(txtField);
        
        // Membuat Bagian Jenis Kelamin
        Teks = new JLabel();
        Teks.setText("Jenis kelamin:");
        Teks.setBounds(10, 60, 100, 10);
        contentPane.add(Teks);
        JenisKelamin = new JRadioButton();
        JenisKelamin.setText("Laki - Laki");
        JenisKelamin.setBounds(100, 55, 90, 20);
        contentPane.add(JenisKelamin);
        JenisKelamin = new JRadioButton();
        JenisKelamin.setText("Perempuan");
        JenisKelamin.setBounds(200, 55, 100, 20);
        contentPane.add(JenisKelamin);
        
        // Membuat Bagian Hobi
        Teks = new JLabel();
        Teks.setText("Hobi:");
        Teks.setBounds(10, 100, 100, 10);
        contentPane.add(Teks);
        Hobi = new JCheckBox();
        Hobi.setText("Olahraga");
        Hobi.setBounds(100, 100, 80, 20);
        contentPane.add(Hobi);
        Hobi = new JCheckBox();
        Hobi.setText("Shopping");
        Hobi.setBounds(100, 130, 80,20);
        contentPane.add(Hobi);
        Hobi = new JCheckBox();
        Hobi.setText("Computer Games");
        Hobi.setBounds(100, 160, 130, 20);
        contentPane.add(Hobi);
        Hobi = new JCheckBox();
        Hobi.setText("Nonton Bioskop");
        Hobi.setBounds(100, 190, 120, 20);
        contentPane.add(Hobi);
        
        //creat and place two button on the frame's content pane
        okButton = new JButton("OK");
        okButton.setBounds(100, 230, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(okButton);
        cancelButton = new JButton("CANCEL");
        cancelButton.setBounds(200, 230, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(cancelButton);
        contentPane.setLayout(null);
        this.add(Panel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
}
