package Pratikum;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;

public class Latihan5 extends JFrame implements ActionListener {

    private JLabel Message;
    private JButton Save, Open, Clear;
    private JTextArea Data;

    Latihan5() {

        Container contentPane = getContentPane();

        setSize(500, 400);
        setResizable(true);
        setTitle("Message Form");
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        //Membuat Teks Message
        Message = new JLabel("Message");
        Message.setBounds(10, 30, 70, 15);
        contentPane.add(Message);

        //Membuat TextArea
        Data = new JTextArea();
        Data.setBounds(10, 50, 400, 200);
        contentPane.add(Data);

        //Membuat Tombol Save
        Save = new JButton("Save");
        Save.setBounds(10, 270, 70, 25);
        contentPane.add(Save);

        //Membuat Tombol Open
        Open = new JButton("Open");
        Open.setBounds(100, 270, 70, 25);
        contentPane.add(Open);

        //Membuat Tombol Clear
        Clear = new JButton("Clear");
        Clear.setBounds(190, 270, 70, 25);
        contentPane.add(Clear);

        contentPane.setLayout(null);

        Save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JFileChooser chooser = new JFileChooser();
                chooser.showSaveDialog(null);
                File Data = chooser.getCurrentDirectory();
                int status = chooser.showSaveDialog(null);
                if (status == JFileChooser.APPROVE_OPTION) {
                    JOptionPane.showMessageDialog(null, "Anda menyimpan file di : " + Data.getPath());
                } else {
                    JOptionPane.showMessageDialog(null, "Terjadi kesalahan");
                }
            }
        });

        Open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                JFileChooser chooser = new JFileChooser();
                chooser.showOpenDialog(null);

                int status = chooser.showOpenDialog(null);
                File Data = chooser.getSelectedFile();
                if (status == JFileChooser.APPROVE_OPTION) {
                    JOptionPane.showMessageDialog(null, "Anda membuka file : " + Data.getPath());
                } else {
                    JOptionPane.showMessageDialog(null, "Terjadi kesalahan");
                }
            }
        });

        Clear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Data.setText(" ");
            }
        });

    }

    public static void main(String[] agrs) {

        Latihan5 frame = new Latihan5();
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }
}
