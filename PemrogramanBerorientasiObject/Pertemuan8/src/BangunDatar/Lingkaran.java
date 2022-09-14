package BangunDatar;

public class Lingkaran extends BangunDatar {

    private double R;
    private final double Phi = 3.14;

    @Override
    public double Keliling() {
        Keliling = Phi * 2 * getR();
        return super.Keliling();
    }

    @Override
    public double Luas() {
        Luas = 3.14 * getR() * getR();
        return super.Luas();
    }

    public double getR() {
        return R;
    }

    public void setR(double r) {
        this.R = r;
    }
}
