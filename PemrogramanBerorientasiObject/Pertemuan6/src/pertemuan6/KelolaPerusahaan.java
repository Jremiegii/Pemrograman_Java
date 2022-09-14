package pertemuan6;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class KelolaPerusahaan {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        // Mendeklarasikan dan mengalokasikan array
        int Perulangan;
        Perulangan = Integer.parseInt(JOptionPane.showInputDialog(null, "Masukan Banyak Data"));
        
        Pegawai[] Anggota;
        Anggota = new Pegawai[Perulangan];
        
        String Nama;
        String NIP;
        String Namapegawai;
        String NIPPegawai;
        String NamaPerusahaan;
        String KodePerusahaan;
        
        // Memasukan nilai input melalui keyboard
        NamaPerusahaan = JOptionPane.showInputDialog(null, "Nama Perusahaan");
        KodePerusahaan = JOptionPane.showInputDialog(null, "Kode Perusahaan");
        Nama = JOptionPane.showInputDialog(null, "Nama Kepala Perusahaan ");
        NIP = JOptionPane.showInputDialog(null, "NIP");
        
        //Menampilkan/mencetak hasil akhir pada jendela output
        System.out.println("Nama Perusahaan = " + NamaPerusahaan);
        System.out.println("Kode Perusahaan = " + KodePerusahaan);
        System.out.println("Nama Kepala Perusahaan = " + Nama);
        System.out.println("NIP = " + NIP);
        System.out.println("\n");
        
        // Memasukan nilai input melalui keyboard serta menampilkan/mencetak hasil akhir pada jendela output
        for (int i = 0; i < Anggota.length; i++) {
            System.out.println("===== Data Pegawai =====\n");
            System.out.print("Nama Pegawai = ");
            Namapegawai = in.nextLine();
            System.out.print("NIP Pegawai = ");
            NIPPegawai = in.nextLine();
            Anggota[i] = new Pegawai(Nama, NIP);
            System.out.println("Anda Berada Pada Golongan = " + Anggota[i].getGajiPokok());
            System.out.println("Total Jam Kerja = " + Anggota[i].getLamaKerja());
            System.out.println("Gaji Lembur Anda Rp. " + Anggota[i].getHonorLembur());
            System.out.println("Jumlah Anak Anda = " + Anggota[i].getTunjangan1());
            System.out.println("Jumlah Tunjangan Istri/Suami = " + Anggota[i].getTunjangan2());
            System.out.println("Total Gaji Keseluruhan Rp. " + Anggota[i].getTotalGaji());
            System.out.println("\n");
        }
    }
}
