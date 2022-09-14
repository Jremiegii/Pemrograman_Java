package Pratikum;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Latihan2C extends JFrame implements ActionListener{
    
    private JButton Open, Save;
    
    
    Latihan2C(){
        
        Container ContentPane = getContentPane();
        ContentPane.setLayout(new FlowLayout());
        
        setSize(300, 200);
        setResizable(false);
        setTitle("Stream");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        // Membuat Tombol Open
        Open = new JButton("Open");
        Open.setBounds(75, 50, 70, 50);
        ContentPane.add(Open);
        
        // Membuat Tombol Save
        Save = new JButton("Save");
        Save.setBounds(150, 50, 70, 50);
        ContentPane.add(Save);
        
        ContentPane.setLayout(null);
        
        Open.addActionListener(this);
        Save.addActionListener(this);
        
    }
    
    public static void main(String[] agrs){
        
        Latihan2C frame = new Latihan2C();
        frame.setVisible(true);
        
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        
        JButton Click = (JButton) ae.getSource();
        JRootPane RootPane = Click.getRootPane();
        JFrame frame = (JFrame) RootPane.getParent();
        String buttonText = Click.getText();
        
        if(buttonText.equals("Open")){
            JFileChooser Open = new JFileChooser();
            Open.showOpenDialog(null);
        } else if(buttonText.equals("Save")){
            JFileChooser Save = new JFileChooser();
            Save.showSaveDialog(null);
        }
    }
}
