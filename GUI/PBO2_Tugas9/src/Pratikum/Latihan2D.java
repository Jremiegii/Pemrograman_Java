package Pratikum;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import javax.swing.*;
import static javax.swing.JFrame.EXIT_ON_CLOSE;

public class Latihan2D extends JFrame implements ActionListener {

    private final JButton Open, Save;

    Latihan2D() {

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

        Open.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                JFileChooser chooser = new JFileChooser();
                chooser.showOpenDialog(null);
                File Data = chooser.getSelectedFile();
                int status = chooser.showOpenDialog(null);
                if (status == JFileChooser.APPROVE_OPTION) {
                    JOptionPane.showMessageDialog(null, "Anda membuka file " + Data.getPath());

                } else {
                    JOptionPane.showMessageDialog(null, "Terjadi kesalahan");
                }
            }
        });

        Save.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {

                JFileChooser chooser = new JFileChooser();
                chooser.showSaveDialog(null);
                File Data = chooser.getCurrentDirectory();
                int status = chooser.showSaveDialog(null);
                if (status == JFileChooser.APPROVE_OPTION) {
                    JOptionPane.showMessageDialog(null, "Anda menyimpan di " + Data.getPath());

                } else {
                    JOptionPane.showMessageDialog(null, "Terjadi kesalahan");
                }
            }
        });

        ContentPane.setLayout(null);

    }

    @Override
    public void actionPerformed(ActionEvent ae) {

    }

    public static void main(String[] agrs) {

        Latihan2D Latihan = new Latihan2D();
        Latihan.setVisible(true);

    }
}
