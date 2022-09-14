package Pratikum;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JRootPane;

public class Latihan2 extends JFrame implements ActionListener{
    
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 30;
    private JButton button;
    
    public static void main(String[] args) {
        
        Latihan2 frame = new Latihan2();
        frame.setVisible(true);
        
    }
    
    public Latihan2(){
        
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        
        //set the frame properties
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setTitle("Program Latihan2");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
        //creat and place two button on the frame's content pane
        button = new JButton("Click Me");
        button.setSize(BUTTON_WIDTH, BUTTON_HEIGHT);
        contentPane.add(button);
        
        // Memanggil method ButtonHandler()
        button.addActionListener(this);
        
        //register 'Exit upon closing' as a default close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        JButton clickedButton = (JButton) e.getSource();
        
        JRootPane rootPane = clickedButton.getRootPane();
        Frame frame = (JFrame) rootPane.getParent();
        String buttonText = clickedButton.getText();
        
        frame.setTitle("Dibuat dengan cara - 2) You clicked " + buttonText);
        
    }
}
