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
    public double getGajitotal() {
        Total = getGajipokok() + getGajilembur() + getTunjKelu() + getTunjanganTransport();
        return super.getGajitotal();
    }
}
