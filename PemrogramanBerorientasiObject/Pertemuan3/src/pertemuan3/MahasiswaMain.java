package pertemuan3;

import java.util.Scanner;

public class MahasiswaMain {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        Mahasiswa Data = new Mahasiswa();
        
        for(int i = 1; i < 4; i++){
            System.out.println("-------- Mahasiswa --------\n"); 
            System.out.print("Masukan Nama = ");
            Data.Nama = in.nextLine();
            System.out.print("Masukan NIM = ");
            Data.NIM = in.nextLine();
            System.out.print("Masukan Jurusan = ");
            Data.Jurusan = in.nextLine();
            System.out.print("Memulai Kuliah Perdana Pada = ");
            Data.WaktuMasuk = in.nextLine();
            System.out.println("\n");
        }
    }   
}
