package pbo2_tugas7;

import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;

public class Latihan4 extends JFrame implements ActionListener{
    
    JLabel NoInduk, Nama, Status;
    JTextField Data1, Data2;
    JComboBox Data3;
    JButton Simpan;
    
    Latihan4(){
        
        Container GUI = getContentPane();
        
        setSize(300, 200);
        setTitle("Pendaftaran Seminar");
        setLayout(new FlowLayout());
        GUI.setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        NoInduk = new JLabel("No Induk");
        NoInduk.setBounds(10, 20, 50, 20);
        GUI.add(NoInduk);
        Data1 = new JTextField();
        Data1.setBounds(100, 20, 130, 20);
        GUI.add(Data1);
        
        Nama = new JLabel("Nama");
        Nama.setBounds(10, 50, 50, 20);
        GUI.add(Nama);
        Data2 = new JTextField();
        Data2.setBounds(100, 50, 130, 20);
        GUI.add(Data2);
        
        Status = new JLabel("Status");
        Status.setBounds(10, 80, 50, 20);
        GUI.add(Status);
        Data3 = new JComboBox(new Object[]{
            "Mahasiswa", "Dosen"
        });
        Data3.setBounds(100, 80, 130, 20);
        GUI.add(Data3);
        
        Simpan = new JButton("Simpan");
        Simpan.setBounds(45, 120, 80, 25);
        GUI.add(Simpan);
        
        Simpan.addActionListener(this);
        
    }
    
    public static void main(String[] agrs){
        
        Latihan4 frame = new Latihan4();
        frame.setVisible(true);
        
    }   

    @Override
    public void actionPerformed(ActionEvent ae){
        
        if(ae.getSource() == Simpan){
            
            int NoInduk;
            String Tampung;
            
            try{
                NoInduk = Integer.parseInt(Data1.getText());
                if(Data1.getText().length() < 9 || Data1.getText().length() > 9){
                    JOptionPane.showMessageDialog(null, "Maaf, format no induk anda salah");
                }
                Tampung = Data3.getItemAt(Data3.getSelectedIndex()).toString();
                if(NoInduk > 139999999 && Tampung.equalsIgnoreCase("Mahasiswa")){
                    JOptionPane.showMessageDialog(null, "Maaf, anda tidak bisa mengikuti seminar");
                } else{
                    JOptionPane.showMessageDialog(null, "Terima kasih telah mendaftar");
                }
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, "Masukan no induk dengan angka");
            }
        }
    }
}
