package pertemuan5;

import java.util.Scanner;

public class Pegawai {
    
    /* Membuat atribut bersifat private berupa TunjanganAnak TunjanganXY, 
    GajiLembur, JamKerja, Hierarki, JumlahAnak, TotalGaji, Nama dan NIP*/
    private double TunjanganAnak;
    private double TunjanganXY;
    private double GajiLembur;
    private double JamKerja;
    private int Hierarki;
    private double JumlahAnak;
    private double TotalGaji;
    private String Nama;
    private String NIP;
    
    // Membuat constructor pada kelas Pegawai dengan parameter berupa Nama dan NIP
    Pegawai (String Nama, String NIP) {
        
        this.Nama = Nama;
        this.NIP = NIP;
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("1. Golongan 1");
        System.out.println("2. Golongan 2");
        System.out.println("3. Golongan 3");
        System.out.print("Silahkan Pilih Golongan Anda = "); 
        Hierarki = in.nextInt();
        System.out.print("Silahkan Total Jam Kerja Anda = ");
        JamKerja = in.nextInt();
        System.out.println("1. Memiliki 1 Anak");
        System.out.println("2. Memiliki 2 Anak");
        System.out.println("3. Memiliki 3 Anak");
        System.out.print("Jumlah Anak Anda = ");
        JumlahAnak = in.nextInt();
        System.out.println("\n");
    }

    /* Membuat setter dan getter pada method Golongan, GajiPokok, LamaKerja, Honorlembur,
    Tunjangan1, Tunjangan2, TotalGaji, Nama dan NIP*/
    public int getGolongan() {
        return Hierarki;
    }

    public int setGajiPokok(int Uang) {
        return Hierarki = Uang;
    }

    public int getGajiPokok() {

        final double Gol1 = 500000;
        final double Gol2 = 750000;
        final double Gol3 = 1000000;

        // Jenis golongan
        switch (Hierarki) {
            case 1:
                System.out.println("Golongan 1 = " + Gol1);
                Hierarki = 500000;
                break;
            case 2:
                System.out.println("Golongan 2 = " + Gol2);
                Hierarki = 750000;
                break;
            case 3:
                System.out.println("Golongan 3 = " + Gol3);
                Hierarki = 1000000;
                break;
            default:
                System.out.println("Opsi Tidak Tersedia");
                break;
        }
        return Hierarki;
    }

    public void setLamaKerja(int Waktu) {
        this.JamKerja = Waktu;
    }

    public double getLamaKerja() {
        
        // Lama waktu berkerja dan porolehan bonus yang didapat
        if (JamKerja > 150) {
            System.out.println("Anda Mendapatkan Bonus");
            GajiLembur = JamKerja - 150;
            System.out.println("Waktu Lembur Anda = " + GajiLembur);
        } else {
            System.out.println("Anda Tidak Memiliki Bonus");
        }
        return JamKerja;
    }

    public void setHonorLembur(double Lembur) {
        this.GajiLembur = Lembur;
    }

    public double getHonorLembur() {
        //Menghitung gaji lembur
        return GajiLembur = (GajiLembur * 20000);
    }

    public void setTunjangan1(int Anak) {
        this.JumlahAnak = Anak;
    }

    public double getTunjangan1() {

        // Mengetahui jumlah anak dan tunjang yang diperoleh berdasarkan jumlah anak
        if (JumlahAnak == 1) {
            TunjanganAnak = 0.1 * Hierarki * 1;
            System.out.println("Jumlah Tunjangan Anak Anda = " + TunjanganAnak);
        } else if (JumlahAnak == 2) {
            TunjanganAnak = 0.1 * Hierarki * 2;
            System.out.println("Jumlah Tunjangan Anak Anda = " + TunjanganAnak);
        } else if (JumlahAnak == 3) {
            TunjanganAnak = 0.1 * Hierarki * 3;
            System.out.println("Jumlah Tunjangan Anak Anda = " + TunjanganAnak);
        } else {
            System.out.println("Opsi Anda Tidak Tersedia !");
        }
        return JumlahAnak;
    }

    public void setTunjangan2(double Honor) {
        this.TunjanganXY = Honor;
    }

    public double getTunjangan2() {
        //Menghitung tunjangan suami/istri
        return TunjanganXY = 0.2 * Hierarki;
    }
    
    public void setTotalGaji(double Total) {
        this.TotalGaji = Total;
    }

    public double getTotalGaji() {
        //Menghitung total keselurhan gaji yang diperoleh
        return (double) (TotalGaji = Hierarki + GajiLembur + TunjanganAnak + TunjanganXY);
    }
    
    public void setNama(String MyName) {
        Nama = "Fransiskus Jremiegi Saputra";
        this.Nama = MyName;
    }
    
    public String getNama() {
        return Nama;
    }
    
    public void setNIP(String nip) {
        NIP = "205314062";
        this.NIP = nip;
    }
    
    public String getNIP() {
        return NIP;
    }
}
