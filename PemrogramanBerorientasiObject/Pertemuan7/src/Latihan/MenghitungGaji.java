package Latihan;

import java.util.Scanner;

public class MenghitungGaji {
    
    protected int Golongan;
    protected int JumlahAnak;
    protected double JamKerja;
    protected double GajiPokok;
    protected double GajiLembur;
    protected double TunjanganAnak;
    protected double GajiTotal;
    
    MenghitungGaji(){
        
        Scanner in = new Scanner(System.in);
        
        System.out.println("===== Posisi Jabatan Pegawai ======");
        System.out.println("1. Maneger");
        System.out.println("2. Marketing");
        System.out.println("3. Umum");
        System.out.print("Masukan Jabatan Pegawai = ");
        Golongan = in.nextInt();
        System.out.print("Total Jumlah Jam Kerja = ");
        JamKerja = in.nextDouble();
        System.out.println("1. Memiliki 1 Anak");
        System.out.println("2. Memiliki 2 Anak");
        System.out.println("3. Memiliki 3 Anak");
        System.out.print("Masukan Jumlah Anak = ");
        JumlahAnak = in.nextInt();
        
    }
    
    public void setGolongan(int Hierarki){
        this.Golongan = Hierarki;
    }
    
    public int getGolongan(){
        switch(Golongan){
            case 1 :
                System.out.println("Posisi Anda Maneger");
                break;
            case 2 :
                System.out.println("Posisi Anda Marketing");
                break;
            case 3 :
                System.out.println("Posis Anda Umum");
                break;
            default :
                System.out.println("Jawaban Anda Tidak Ditemukan !");
            break;
        }
        
        return Golongan;
    }
    
    public void setGajiPokok(double GajiUtama){
        this.GajiPokok = GajiUtama;
    }
    
    public double getGajiPokok(){
        
        GajiPokok = Golongan;
        
        if (GajiPokok == 1){
            GajiPokok = 3000000;
        } else if (GajiPokok == 2){
            GajiPokok = 2000000;
        } else if (GajiPokok == 3) {
            GajiPokok = 1000000;
        } else {
            System.out.println("");
        }
        
        return GajiPokok;
    }
    
    public void setJamKerja(int LamaKerja){
        this.JamKerja = LamaKerja;
    }
    
    public double getJamKerja(){
        
        if(JamKerja > 150) {
            GajiLembur = JamKerja - 150;
            System.out.println("Waktu Lembur Anda = " + GajiLembur);
        } else {
            System.out.println("Anda Tidak Memiliki Waktu Lembur");
        }
        return JamKerja;
    }
    
    public void setGajiLembur(double GajiTambahan){
        this.GajiLembur = GajiTambahan;
    }
    
    public double getGajiLembur(){
        GajiLembur = GajiLembur * 20000;
        return GajiLembur;
    }
    
    public void setTunjanganAnak(int Anak) {
        this.JumlahAnak = Anak;
    } 
    
    public double getTunjanganAnak() {
        
        switch(JumlahAnak){
            case 1 :
                TunjanganAnak = (0.1 * GajiPokok * 1);
                System.out.println("Jumlah Tunjangan Anak Anda = " + TunjanganAnak);
                break;
            case 2 :
                TunjanganAnak = (0.2 * GajiPokok * 2);
                System.out.println("Jumlah Tunjangan Anak Anda = " + TunjanganAnak);
                break;
            case 3:
                TunjanganAnak = (0.3 * GajiPokok * 3);
                System.out.println("Jumlah Tunjangan Anak Anda = " + TunjanganAnak);
                break;
            default :
                System.out.println("Tidak Memenuhi Persyaratan & Kebijakan");
                break;
        }
        return JumlahAnak;
    }
}
