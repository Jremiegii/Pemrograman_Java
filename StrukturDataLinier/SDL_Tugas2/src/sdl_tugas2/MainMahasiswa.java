package sdl_tugas2;

import javax.swing.JOptionPane;

public class MainMahasiswa {

    public static void main(String[] agrs) {
        
        int Jumlah;
        String Name, NIM, From;

        Jumlah = Integer.parseInt(JOptionPane.showInputDialog("Jumlah Data"));

        Mahasiswa Data[] = new Mahasiswa[Jumlah];
        for (int i = 0; i < Data.length; i++) {
            Name = JOptionPane.showInputDialog("Nama");
            NIM = JOptionPane.showInputDialog("NIM");
            From = JOptionPane.showInputDialog("Asal Daerah");
            Data[i] = new Mahasiswa(Name, NIM, From);
        }
        Larik.Mahasiswa(Data);
    }

}
