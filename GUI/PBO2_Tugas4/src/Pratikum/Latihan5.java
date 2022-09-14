package Pratikum;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;

public class Latihan5 extends JFrame{
    
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 250;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private JList list;
    
    
    public static void main(String[] agrs){
        
        Latihan5 frame = new Latihan5();
        frame.setVisible(true);
        
    }
    
    public Latihan5(){
        
        Container contentPane;
        JPanel listPanel, okPanel;
        
        JButton okButton;
        String[] names ={"Ape", "Bat", "Bee", "Cat", "Dog", "Eel", "Fox", "Gnu", "Hen", "Man", "Sow", "Yak"};
        
        //set the frame properties
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setTitle("Program Latihan 5");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
        contentPane = getContentPane();
        contentPane.setBackground(Color.white);
        contentPane.setLayout(new BorderLayout());
        
        //creat and place a JList
        listPanel = new JPanel(new GridLayout(0,1));
        listPanel.setBorder(BorderFactory.createTitledBorder("Three-letter Animal Names"));
        
        list = new JList(names);
        listPanel.add(new JScrollPane(list));
        
        //creat and place the OK button
        okPanel = new JPanel(new FlowLayout());
        okButton = new JButton("OK");
        okPanel.add(okButton);
        
        contentPane.add(listPanel, BorderLayout.CENTER);
        contentPane.add(okPanel, BorderLayout.SOUTH);
        
        //register 'EXIT upon closing' as a default close operation
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
