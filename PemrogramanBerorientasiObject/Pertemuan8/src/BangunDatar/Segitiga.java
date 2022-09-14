package BangunDatar;

public class Segitiga extends BangunDatar {

    private double SisiA;
    private double SisiB;
    private double SisiC;

    @Override
    public double Keliling() {
        Keliling = SisiA + SisiB + SisiC;
        return super.Keliling();
    }

    @Override
    public double Luas() {
        double S;
        S = Keliling() / 2;
        Luas = Math.sqrt(S * (S - SisiA) * (S - SisiB) * (S - SisiC));
        return super.Luas();
    }

    public double getSisiA() {
        return SisiA;
    }

    public void setSisiA(double sisiA) {
        this.SisiA = sisiA;
    }

    public double getSisiB() { 
        return SisiB;
    }

    public void setSisiB(double sisiB) {
        this.SisiB = sisiB;
    }

    public double getSisiC() {
        return SisiC;
    }

    public void setSisiC(double sisiC) {
        this.SisiC = sisiC;
    }
}
