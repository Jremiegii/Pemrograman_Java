package Tugas2;

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
        Ketua.getJenisSertifikat();
        
        Mahasiswa Sekretaris = new Mahasiswa("200919020", "Marie", "17/08/2002");
        Data.setSekretaris(Sekretaris);
        Sekretaris.getJenisSertifikat();
        
        Mahasiswa Student  = new Mahasiswa(null, null, null);
        Student.getJenisSertifikat();
        Student.getFasilitas();
        Student.getKomsumsi();
        
        MasyarakatSekitar People = new MasyarakatSekitar(null, null, null);
        People.getJenisSertifikat();
        People.getFasilitas();
        People.getKomsumsi();

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
                    System.out.print("Verifikasi Kembali Pilihan Anda = ");
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
        System.out.println("Nama UKM = " + Data.getNamaUnit());
        System.out.println("Nama Ketua = " + Data.getKetua().getNama());
        System.out.println("Nama Sekretaris = " + Data.getSekretaris().getNama());
        System.out.println("Daftar Anggota");
        System.out.println("========================================================================================="
                + "=======================================");
        System.out.println("No \t" + "Nama \t" + "Iuran \t\t" + "Sertifikat \t\t" + "Fasilitas \t\t\t\t" + "Konsumsi");
        System.out.println("-----------------------------------------------------------------------------------------"
                + "---------------------------------------");
        System.out.println("1." + "\t" + Data.getKetua().getNama() + "\t" + "- \t\t" +
                    Ketua.getJenisSertifikat() + "\t\t" + Ketua.getFasilitas() + "\t\t\t" + Ketua.getKomsumsi());
            System.out.println("2." + "\t" + Data.getSekretaris().getNama() + "\t- \t\t" +
                    Sekretaris.getJenisSertifikat() + "\t\t" + Sekretaris.getFasilitas() + "\t\t\t" + Sekretaris.getKomsumsi());
        
        for (int j = 0; j < Data.getAnggota().length; j++){
            System.out.print((j + 3) + "." + "\t"+ Data.getAnggota()[j].getNama() + "\t");
            if (Data.getAnggota()[j] instanceof Mahasiswa) {
                System.out.print(((Mahasiswa) Data.getAnggota()[j]).hitungIuran() + "\t" + Student.getJenisSertifikat() 
                        + "\t\t" + Student.getFasilitas() + "\t\t\t" + Student.getKomsumsi() + "\n");
            } else if (Data.getAnggota()[j] instanceof MasyarakatSekitar) {
                System.out.println(((MasyarakatSekitar) Data.getAnggota()[j]).hitungIuran() + "\t\t" +
                        People.getJenisSertifikat() + "\t\t" + People.getFasilitas() + "\t" + People.getKomsumsi());
            } else {
                
            }
        }System.out.println("");
        System.out.println("========================================================================================="
                + "========================================");
        System.out.println("Total Iuran Seluruh Anggota = " + TotalIuran);
    }
}
