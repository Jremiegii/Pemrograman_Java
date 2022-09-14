package Pratikum;

import java.awt.Color;
import java.awt.Container;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Latihan1A extends JFrame{
    
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 300;
    private static final int FRAME_Y_ORIGIN = 100;
    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 40;
    private JButton cancelButton;
    private JButton okButton;
    private JTextField txtField;
    
    public static void main(String[] args) {
        
        Latihan1A frame = new Latihan1A();
        frame.setVisible(true);
        
    }
    
    public Latihan1A(){
        
        Container contentPane = getContentPane();
        
        //set the frame properties
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(true);
        setTitle("Program Latihan 1");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
        //set the content pane properties
        contentPane.setLayout(null);
        contentPane.setBackground(Color.white);
        
        //creat and place two button on the frame's content pane
        okButton = new JButton("OK");
        okButton.setBounds(110, 100, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(okButton);
        cancelButton = new JButton("CANCEL");
        cancelButton.setBounds(165, 125, BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(cancelButton);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
}
