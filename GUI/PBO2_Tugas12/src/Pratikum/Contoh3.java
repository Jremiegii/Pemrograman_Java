package Pratikum;

public class Contoh3 implements Runnable{

    @Override
    public void run() {
        
        for(int x = 1; x <= 5; x++){
            try{
                System.out.println("Angka " + x);
                Thread.sleep(1000);
            } catch (Exception exc) {
                System.out.println("Pesan Error : " + exc.getMessage());
            }
        }
    }
    
    public static void main(String[] agrs){
        // Buat Objek dari class Cetak
        Contoh3 out = new Contoh3();
        // Mulai jalankan Thread
        Thread td = new Thread(out);
        td.start();
    }
}
