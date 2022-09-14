package Tugas4;

public class Bawah_pub3 extends Atas{
    
    public void cetak1(){
        super.cetak1();
        System.out.println("Telah selesai memanggil cetak1 miik superclass..");
    }
    
    public void cetak2(){
        System.out.println("Ada di class BAWAH..");
        System.out.println("1 = " + i);
    }
}
