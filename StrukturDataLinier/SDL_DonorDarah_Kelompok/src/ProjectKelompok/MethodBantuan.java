package ProjectKelompok;

import java.util.Scanner;

public class MethodBantuan {
    
    Queue Data = new Queue();
    int Antrian = 1;
    
    // Membuat Method Informasi Agar menmapilkan Data Berdasarkan Yang Ada Pada Method Ini
    public void Informasi(){
        
        Identitas Data1 = new Identitas(Antrian++, "Egi", "B");
        Identitas Data2 = new Identitas(Antrian++, "Moses", "O");
        Identitas Data3 = new Identitas(Antrian++, "Cahya", "O");
        
        Data.enqueue(Data1);
        Data.enqueue(Data2);
        Data.enqueue(Data3);
        
    }
    
    // Membuat Method Tambah Agar Bisa Menambahkan Data
    public void Tambah(){
        
        Scanner in = new Scanner(System.in);
        System.out.print("Jumlah Individu = ");
        int Kuantitas = in.nextInt();
        for (int i = 0; i < Kuantitas; i++) {
            System.out.print("Nama Anda = ");
            String Nama = in.next();
            System.out.print("Golongan Darah Anda = ");
            String Darah = in.next();
            Identitas tampung = new Identitas(Antrian++, Nama, Darah);
            Data.enqueue(tampung);
            System.out.println("Registrasi Pendaftaran Berhasil Dilakuakan!" + " \n");
        }
    }
    
    // Membuat Method Hapus Agar Bisa Menghapus Data
    public void Hapus(){
        
        System.out.println(Data.dequeue());
        System.out.println("Data Berhasil Dihapus");
        
    }
    
    // Membuat Method Cari Agar Bisa Mencari Data
    public void Cari() {
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Nama Anda = ");
        String Nama = in.next();
        
        try {
            Identitas tampung = new Identitas(0, Nama, " ");
            if (Data.Search(tampung) == null) {
                System.out.println("Data Tidak Ditemukan");
            } else {
                System.out.println("Data Ditemukan");
            }
        } catch (Exception e) {
            System.out.println("Data Tidak terdefinisikan");
        }
    }
    
    // Membuat Method Menampilkan Agar Bisa Menampilkan Data Secara Keseluruhan
    public void Menampilkan(){
        
        if(!Data.isEmpty()){
            System.out.println(Data.toString());
        } else {
            System.out.println("Data Tidak Ditemukan");
        }
    }
    
    // Method Keluar Agar Bisa Menghentikan/Mengeluarkan Program Saat Sedang Berlangsung
    public void Keluar(){
        
        System.out.println("Anda Telah Berhasil Keluar Dari Sistem Pendaftaran");
        System.exit(0);
        
    }
}
