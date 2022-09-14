package BangunDatar;

public class Lingkaran extends BangunDatar{
    
    private double R;
    private final double Phi = 3.14;
    
    public double getR() {
        return R;
    }

    public void setR(double r) {
        this.R = r;
    }

    @Override
    protected double Luas() {
        return 3.14 * getR() * getR();
    }

    @Override
    protected double Keliling() {
        return Phi * 2 * getR();
    }
}
