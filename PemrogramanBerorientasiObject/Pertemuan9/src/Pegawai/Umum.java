package Pegawai;

public class Umum extends Pegawai{

    private double TunjanganTransport;

    public double getTunjanganTransport() {
        return TunjanganTransport;
    }

    public void setTunjanganTransport(double Transportasi) {
        this.TunjanganTransport = Transportasi;
    }
    
    @Override
    protected double Total() {
        return getGajipokok() + getGajilembur() + getTunjKelu() + getTunjanganTransport();
    }
}
