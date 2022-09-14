package BangunDatar;

public class PersegiPanjang extends BangunDatar {

    private double Panjang;
    private double Lebar;

    @Override
    public double Keliling() {
        Keliling = ((2 * getPanjang()) + (2 * getLebar()));
        return super.Keliling();
    }

    @Override
    public double Luas() {
        Luas = getPanjang() * getLebar();
        return super.Luas();
    }

    public double getPanjang() {
        return Panjang;
    }

    public void setPanjang(double panjang) {
        this.Panjang = panjang;
    }

    public double getLebar() {
        return Lebar;
    }

    public void setLebar(double lebar) {
        this.Lebar = lebar;
    }
}
