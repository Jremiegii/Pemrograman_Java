package Latihan;

public class Jabatan extends MenghitungGaji {

    protected double TunjanganJabatan;
    protected double TunjanganTransport;
    protected double Bonus;
    protected double TotalGaji;

    public void setTunjanganJabatan(double TunJabatan) {
        this.TunjanganJabatan = TunJabatan;
    }

    public double getTunjanganJabatan() {
        TunjanganJabatan = (GajiPokok * 0.25);
        return TunjanganJabatan;
    }
    
    public void setTunjanganTransport(double Kendaraan){
        this.TunjanganTransport = Kendaraan;
    }
    
    public double getTunjanganTransport(){
        return TunjanganTransport = 500000;
    }

    public void setBounus(double bonus) {
        this.Bonus = bonus;
    }

    public double getBonus() {
        return Bonus = 200000;
    }
    
    public void TotalGaji(){
        
        if(Golongan == 1){
            GajiTotal = GajiPokok + GajiLembur + TunjanganAnak + TunjanganJabatan;
            System.out.println("Total Gaji = "+ GajiTotal);
        } else if(Golongan == 2){
            GajiTotal = GajiPokok + GajiLembur + TunjanganAnak + Bonus;
            System.out.println("Total Gaji = " + GajiTotal);
        } else if(Golongan == 3){
            GajiTotal = GajiPokok + GajiLembur + TunjanganAnak + TunjanganTransport;
            System.out.println("Total Gaji = " + GajiTotal);
        }
    }
}
