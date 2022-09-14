package Pratikum;

import java.awt.Container;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFrame;

public class Latihan1 extends JFrame{
    
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 30;
    private JButton button;
    
    public static void main(String[] args) {
        
        Latihan1 frame = new Latihan1();
        frame.setVisible(true);
        
    }
    
    public Latihan1(){
        
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        
        //set the frame properties
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setTitle("Program Latihan1");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
        //creat and place two button on the frame's content pane
        button = new JButton("Click Me");
        button.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(button);
        
        // Memanggil method ButtonHandler()
        ButtonHandler handler = new ButtonHandler();
        button.addActionListener(handler);
        
        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }
}
