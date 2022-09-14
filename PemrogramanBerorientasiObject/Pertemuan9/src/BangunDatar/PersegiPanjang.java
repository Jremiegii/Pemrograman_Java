package BangunDatar;

public class PersegiPanjang extends BangunDatar{
    
    private double Panjang;
    private double Lebar;
    
    public double getPanjang() {
        return Panjang;
    }

    public void setPanjang(double panjang) {
        this.Panjang = panjang;
    }

    public double getLebar() {
        return Lebar;
    }
    
    public void setLebar(double lebar){
        this.Lebar = lebar;
    }
    
    @Override
    protected double Luas() {
        return getPanjang() * getLebar();
    }

    @Override
    protected double Keliling() {
        return ((2 * getPanjang()) + (2 * getLebar()));
    }
}
