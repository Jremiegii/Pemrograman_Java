package pertemuan3;

public class Lingkaran {
    
    int jari;
    private float luas;
    private float keliling;
    
    public void setJari(int jari) {
        this.jari = jari;
    }
    
    public int getJari() {
        return jari;
    }
    
    public float getLuas () {
        return luas;
    }
    
    public float getKeliling() {
        return keliling;
    }
    
    public float Luas (){
        return (float) (3.14 * (jari * jari));
    }
    
    public float Keliling () {
        return (float) (2 * (3.14 * jari));
    }
}
