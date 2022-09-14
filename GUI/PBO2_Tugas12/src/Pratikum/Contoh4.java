package Pratikum;

public class Contoh4 {
    
    public static void main(String[] agrs){
        
        Thread out = new Thread(new Runnable() {
            
            @Override
            public void run() {
                
                try{
                    for(int x = 1; x <= 5; x++){
                        System.out.println("Angka " + x);
                        Thread.sleep(1000);
                    }
                } catch (Exception exc) {
                    exc.printStackTrace();
                }
            }
        });
        out.start();
    }
}
