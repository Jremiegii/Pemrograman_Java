package Pratikum;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import static javax.swing.JFrame.EXIT_ON_CLOSE;
import javax.swing.JLabel;
import javax.swing.JRootPane;
import javax.swing.JTextField;

public class Latihan5 extends JFrame implements ActionListener{
    
    private static final int FRAME_WIDTH = 300;
    private static final int FRAME_HEIGHT = 200;
    private static final int FRAME_X_ORIGIN = 150;
    private static final int FRAME_Y_ORIGIN = 250;
    private static final int BUTTON_WIDTH = 80;
    private static final int BUTTON_HEIGHT = 30;
    private JTextField Data1, Data2, DataHasil;
    private JLabel Bilangan1, Bilangan2, Hasil;
    private JButton Jumlah;
    
    public static void main(String[] args) {
        
        Latihan5 frame = new Latihan5();
        frame.setVisible(true);
        
    }
    
    public Latihan5(){
        
        Container contentPane = getContentPane();
        contentPane.setLayout(new FlowLayout());
        
        //set the frame properties
        setSize(FRAME_WIDTH, FRAME_HEIGHT);
        setResizable(false);
        setTitle("Program Latihan 5");
        setLocation(FRAME_X_ORIGIN, FRAME_Y_ORIGIN);
        
        // Membuat untuk menampilkan teks
        Bilangan1 = new JLabel("Bilangan 1");
        Bilangan1.setBounds(10, 20, 70, 20);
        contentPane.add(Bilangan1);
        
        Bilangan2 = new JLabel("Bilangan 2");
        Bilangan2.setBounds(10, 50, 70, 20);
        contentPane.add(Bilangan2);
        
        Hasil = new JLabel("Hasil");
        Hasil.setBounds(10, 80, 70, 20);
        contentPane.add(Hasil);
        
        // Membuat untuk memasukan data
        Data1 = new JTextField();
        Data1.setBounds(100, 20, 100, 20);
        contentPane.add(Data1);
        
        Data2 = new JTextField();
        Data2.setBounds(100, 50, 100, 20);
        contentPane.add(Data2);
        
        DataHasil = new JTextField();
        DataHasil.setBounds(100, 80, 100, 20);
        contentPane.add(DataHasil);
        
        // Membuat tombol
        Jumlah = new JButton("Jumlah");
        Jumlah.setBounds(100, 110, 80, 30);
        contentPane.add(Jumlah);
        
        // Agar dapat melakukan aksi
        Jumlah.addActionListener(this);
        
        contentPane.setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        JButton clickedButton = (JButton) e.getSource();
        
        JRootPane rootPane = clickedButton.getRootPane();
        Frame frame = (JFrame) rootPane.getParent();
        String buttonText = clickedButton.getText();
        
        int Value1 = Integer.parseInt(this.Data1.getText());
        int Value2 = Integer.parseInt(this.Data2.getText());
        
        if(buttonText.equals("Jumlah")){
            int Result = Value1 + Value2;
            this.DataHasil.setText(Integer.toString(Result));
        }
    }
}
