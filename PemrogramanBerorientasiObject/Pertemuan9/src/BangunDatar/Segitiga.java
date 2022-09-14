package BangunDatar;

public class Segitiga extends BangunDatar{
    
    private double SisiA;
    private double SisiB;
    private double SisiC;
    
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

    @Override
    protected double Luas() {
        double S;
        S = Keliling() / 2;
        return Math.sqrt(S * (S - SisiA) * (S - SisiB) * (S - SisiC));
    }

    @Override
    protected double Keliling() {
        return SisiA + SisiB + SisiC;
    }
}
