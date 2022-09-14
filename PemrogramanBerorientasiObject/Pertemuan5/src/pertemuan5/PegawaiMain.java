package pertemuan5;

public class PegawaiMain {

    public static void main(String[] args) {
        
        //Membuat objek baru berupa Anggota dari kelas Pegawai
        Pegawai Anggota = new Pegawai("Fransiskus Jremiegi Saputra", "205314062");
        
        //Membuat objek baru berupa ketua dari kelas Perusahaan
        Perusahaan Ketua = new Perusahaan("PT Kopi Nusantara Bumi Pertiwi", "FJ391020102");
        
        //Memasukan nilai ke variabel Nama yang terdapat pada objek Anggota dan method getNama()
        Anggota.getNama();
        String Nama = Anggota.getNama();
        
        //Memasukan nilai ke variabel NIP yang terdapat pada objek Anggota dan method getNIp()
        Anggota.getNIP();
        String NIP = Anggota.getNIP();
        
        //Menampilkan/mencetak hasil akhir pada jendela output
        System.out.println("===== Data Pegawai =====\n");
        System.out.println("Nama Anda = " + Nama);
        System.out.println("NIP Anda = " + NIP);
        System.out.println("Nama Perusahaan = " + Ketua.getNamaPerusahaan());
        System.out.println("Kode Perusahaan = " + Ketua.getKode());
        System.out.println("Anda Berada Pada Golongan = " + Anggota.getGajiPokok());
        System.out.println("Total Jam Kerja = " + Anggota.getLamaKerja());
        System.out.println("Gaji Lembur Anda Rp. " + Anggota.getHonorLembur());
        System.out.println("Jumlah Anak Anda = " + Anggota.getTunjangan1());
        System.out.println("Jumlah Tunjangan Istri/Suami = " + Anggota.getTunjangan2());
        System.out.println("Total Gaji Keseluruhan Rp. " + Anggota.getTotalGaji());
    }
}
