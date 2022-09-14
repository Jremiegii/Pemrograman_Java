package pertemuan3;

public class MenghitungGaji {
    
    private double TunjanganAnak;
    private double TunjanganXY;
    private double GajiLembur;
    private double Gaji;
    double JamKerja;
    int Hierarki; 
    double JumlahAnak;
    double TotalGaji;
    private double Golongan;
    
    
    public int getGolongan () {
        return Hierarki;
    } 
    
    public int setGajiPokok(int Uang) {
        return Hierarki = Uang;
    }
    
    public int getGajiPokok() { 
        
        final double Gol1 = 500000;
        final double Gol2 = 750000;
        final double Gol3 = 1000000;
        
        switch (Hierarki) {
            case 1 :
                System.out.println("Golongan 1 = " + Gol1);
                Hierarki = 500000;
                break;
            case 2 : 
                System.out.println("Golongan 2 = " + Gol2);
                Hierarki = 750000;
                break;
            case 3 :
                System.out.println("Golongan 3 = " + Gol3);
                Hierarki = 1000000;
                break;
            default :
                System.out.println("Opsi Tidak Tersedia");
                break;
        }
        return Hierarki;
    }
    
    public void setLamaKerja (int Waktu) {
        this.JamKerja = Waktu;
    }
    
    public double getLamaKerja (){
         
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
    
    public double getHonorLembur () {
        return GajiLembur = (GajiLembur * 20000);
    }
    
    public void setTunjangan1(int Anak) {
        this.JumlahAnak = Anak;
    } 
    
    public double getTunjangan1() {
        
        if (JumlahAnak == 1) {
            TunjanganAnak = 0.1 * Hierarki * 1;
            System.out.println("Jumlah Tunjangan Anak Anda = " + TunjanganAnak);
        } else if (JumlahAnak == 2) {
            TunjanganAnak = 0.1 * Hierarki * 2;
            System.out.println("Jumlah Tunjangan Anak Anda = " + TunjanganAnak);
        } else if (JumlahAnak == 3) {
            TunjanganAnak = 0.1 * Hierarki * 3;
            System.out.println("Jumlah Tunjangan Anak Anda = " + TunjanganAnak);
        }else {
            System.out.println("Opsi Anda Tidak Tersedia !");
        }
        return JumlahAnak;
    }
    
    public void setTunjangan2 (double Honor) {
        this.TunjanganXY = Honor;
    }
    
    public double getTunjangan2 () {
        return TunjanganXY = 0.2 * Hierarki;
    }
    
    public double TotalGaji () {
        return (double) (TotalGaji = Hierarki + GajiLembur + TunjanganAnak + TunjanganXY);
    }
}
