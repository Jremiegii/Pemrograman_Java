package Pegawai;

public class Manager extends Pegawai{

    private double TunjanganJabatan;

    public double getTunjanganJabatan() {
        return TunjanganJabatan;
    }

    public void setTunjanganJabatan(double Jabatan) {
        this.TunjanganJabatan = Jabatan;
    }
    
    @Override
    protected double Total() {
        return getGajipokok() + getGajilembur() + getTunjKelu() + getTunjanganJabatan();
    }
}
