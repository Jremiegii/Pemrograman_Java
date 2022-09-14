package Pratikum;

public class Contoh1 extends Thread{
    
    public void run(){
        
        try{
            for(int x = 1; x <= 5; x++){
                System.out.println("Angka " + x);
                Thread.sleep(2000); //Waktu pending
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }
    }
    
    public static void main(String[] args) {
        // Buat Objek dari class cetak
        Contoh1 out = new Contoh1();
        // Mulai jalankan Thread
        out.start();
    }
}
