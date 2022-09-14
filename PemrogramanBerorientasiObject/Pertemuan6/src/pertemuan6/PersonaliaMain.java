package pertemuan6;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class PersonaliaMain {
    
    public static void main(String[] agrs) {
        
        Scanner in = new Scanner(System.in);
        
        // Mendeklarasikan dan mengalokasikan array
        int Perulangan;
        Perulangan = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan Banyak Data"));
        
        Pegawai[] Anggota;
        Anggota = new Pegawai[Perulangan];
        
        String Nama;
        String NIP;
        
        // Memasukan nilai input melalui keyboard
        for (int i = 0; i < Anggota.length; i++) {
            System.out.println("===== Data Pegawai =====\n");
            Nama = JOptionPane.showInputDialog(null, "Nama Pegawai ");
            System.out.println("Nama = " + Nama);
            NIP = JOptionPane.showInputDialog(null, "NIP Pegawai ");
            System.out.println("NIP = " + NIP);
            Anggota[i] = new Pegawai(Nama, NIP);
            System.out.println("Gaji Pokok Yang Anda Perioleh Anda Rp. " + Anggota[i].getGajiPokok());
            System.out.println("===========================\n");
        }
        
        // Menghitung nilai rata-rata gaji pokok
        float sum = 0, Mean;
        
        for (int i = 0; i < Anggota.length; i++) {
            sum += Anggota[i].getGajiPokok();
        }
        Mean = sum / (float) Anggota.length;
        
        Pegawai Minimal, Maksimal;
        
        Minimal = Maksimal = Anggota[0];
        for (int i = 0; i < Anggota.length; i++) {
            if (Anggota[i].getGajiPokok() < Minimal.getGajiPokok()){
                Minimal = Anggota[i];
            } else if (Anggota[i].getGajiPokok() > Maksimal.getGajiPokok()) {
                Maksimal = Anggota[i];
            }
        }
        
        //Menampilkan/mencetak hasil akhir pada jendela output
        System.out.println("Jumlah Pegawai = " + Anggota.length);
        System.out.println("Gaji Pokok Minimal Pegawai Rp. " + Minimal.getGajiPokok());
        System.out.println("Gaji Pokok Maksimal Pegawai Rp. " + Maksimal.getGajiPokok());
        System.out.println("Rata-Rata Gaji Pokok Anggota Rp. " + Mean);
    }
}
