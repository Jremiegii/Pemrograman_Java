package pertemuan2;

public class Persegi {
    
    private int panj;
    private int lebar;
    private double luas;
    
    public double luas() {
        luas = panj * lebar;
        return luas;
    }
    
    public int getPanj() {
        return panj;
    }
    
    public int getLebar() {
        return lebar;
    }
    
    public void setPanj(int Panjang) {
        panj = Panjang;
    }
    
    public void setLebar(int Lebar) {
        lebar = Lebar;
    }
}

