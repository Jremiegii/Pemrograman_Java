package Kelompok3;

/*

205314038_Refokatus Amadeus Martin Putranto
205314043_Delvin Wang
205314062_Fransiskus Jremiegi Saputra
205314063_Moses Amor Deo Wuryanto

*/

import java.util.Scanner;

public class Pengujian {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int Perulangan;
        String NamaUKM;
        double TotalIuran = 0;

        System.out.print("Masukan Nama UKM = ");
        NamaUKM = in.nextLine();

        UKM Data = new UKM(NamaUKM);
        Mahasiswa Ketua = new Mahasiswa("205314062", "James", "02/11/2002");
        Data.setKetua(Ketua);

        Mahasiswa Sekretaris = new Mahasiswa("200919020", "Marie", "17/08/2002");
        Data.setSekretaris(Sekretaris);

        System.out.print("Masukan Jumlah Peserta = ");
        Perulangan = in.nextInt();

        Penduduk[] anggota;
        anggota = new Penduduk[Perulangan];

        for (int i = 0; i < anggota.length; i++) {
            System.out.print("Nama Anda = ");
            String Name = in.next();
            System.out.print("Data Kelahiran = ");
            String Lahir = in.next();
            System.out.println("1. Mahasiswa");
            System.out.println("2. Masyarakat Umum");
            System.out.print("Pilih Opsi = ");
            int Opsional = in.nextInt();
            if(Opsional != 1 || Opsional != 2){
                while(Opsional != 1 || Opsional != 2){
                    System.out.print("Verifikasi Kemabli Pilihan Anda = ");
                    Opsional = in.nextInt();
                    if (Opsional == 1) {
                        System.out.print("NIM = ");
                        String NIM = in.next();
                        anggota[i] = new Mahasiswa(NIM, Name, Lahir);
                        TotalIuran += anggota[i].hitungIuran();
                        break;
                    } else if (Opsional == 2) {
                        System.out.print("Nomor = ");
                        String Nomor = in.next();
                        anggota[i] = new MasyarakatSekitar(Nomor, Name, Lahir);
                        TotalIuran += anggota[i].hitungIuran();
                        break;
                    }
                }
            }
            
        }
        Data.setAnggota(anggota);
        System.out.println("\n");
        System.out.println("======== Nama UKM ========" + Data.getNamaUnit() + "\n");
        System.out.println("Nama Ketua = " + Data.getKetua().getNama());
        System.out.println("NIM Ketua = " + Data.getKetua().getNim());
        System.out.println("Data Kelahiran = " + Data.getKetua().getTanggalLahir());
        System.out.println("Nama Sekretaris = " + Data.getSekretaris().getNama());
        System.out.println("NIM Sekretaris = " + Data.getSekretaris().getNim());
        System.out.println("Data kelahiran = " + Data.getSekretaris().getTanggalLahir());
        
        for (int j = 0; j < Data.getAnggota().length; j++) {
            System.out.println("Nama Anggota = " + Data.getAnggota()[j].getNama());
            System.out.println("Data Kelahiran Anggota = " + Data.getAnggota()[j].getTanggalLahir());
            if (Data.getAnggota()[j] instanceof Mahasiswa) {
                System.out.println("NIM Anggota = " + ((Mahasiswa) Data.getAnggota()[j]).getNim());
                System.out.println("Iuran Anggota = " + ((Mahasiswa) Data.getAnggota()[j]).hitungIuran());
            } else if (Data.getAnggota()[j] instanceof MasyarakatSekitar) {
                System.out.println("Nomor Anggota = " + ((MasyarakatSekitar) Data.getAnggota()[j]).getNomor());
                System.out.println("Iuran Anggota = " + ((MasyarakatSekitar) Data.getAnggota()[j]).hitungIuran());
            } else {
                
            }
        }
        System.out.println("\n");
        System.out.println("Total Iuran Seluruh Anggota = " + TotalIuran);
    }
}
