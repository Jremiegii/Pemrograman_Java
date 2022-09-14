package ujicoba2;

public class FungsiStatic {
    
    void makan(String makanan){
        System.out.println("Hi !");
        System.out.println("Saya sedang makan " + makanan);
    }
    static void minum(String minuman) {
        System.out.println("Saya sedang minum " + minuman);
    }
    public static void main(String[] args){
        minum("kopi");
        
    }
}
