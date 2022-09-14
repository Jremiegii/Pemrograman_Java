package Pratikum;

public class Contoh2 extends Thread{
    
    public void run(){
        
        try{
            for(int x = 1; x <= 5; x++){
                System.out.println("Angka " + x);
                Thread.sleep(1000); // Waktu pending
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }   
    }
    
    public static void main(String[] agrs){
        // Buat Objek dari class Cetak
        Contoh2 out = new Contoh2();
        Contoh2 out2 = new Contoh2();
        // Mulai jalankan Thread
        out.start();
        out2.start();
        
    }
}
