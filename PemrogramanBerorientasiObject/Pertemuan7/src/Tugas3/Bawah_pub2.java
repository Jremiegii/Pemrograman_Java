package Tugas3;

public class Bawah_pub2 extends Atas {
    
    private void cetak1() {
        System.out.println("Ada di class BAWAH..");
    }
    
    public void cetak2(){
        System.out.println("Ada di class BAWAH..");
        System.out.println("i = " + i);
    }
}
