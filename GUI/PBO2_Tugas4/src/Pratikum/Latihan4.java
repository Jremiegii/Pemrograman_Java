package Pratikum;

import java.awt.Color;
import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Latihan4 extends JFrame{
    
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    
    
    public static void main(String[] agrs){
        
        Latihan4 frame = new Latihan4();
        frame.setVisible(true);
        
    }
    
    public Latihan4(){
        
        Container contentPanel;
        JButton button1, button2, button3, button4, button5;
        
        //set the frame properties
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Program latihan 4");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
        Container contentPane = getContentPane();
        contentPane.setBackground(Color.white);
        contentPane.setLayout(new GridLayout(2,3));
        
        //creat and place four button on the content pane
        button1 = new JButton("button 1");
        button2 = new JButton("button 2");
        button3 = new JButton("button 3");
        button4 = new JButton("button 4");
        button5 = new JButton("button 5");
        
        contentPane.add(button1);
        contentPane.add(button2);
        contentPane.add(button3);
        contentPane.add(button4);
        contentPane.add(button5);
        
        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
