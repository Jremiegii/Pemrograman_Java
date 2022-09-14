package Latihan6;

public class Latihan2 {
    
    public static void main(String[] args) {
        
        int count, bil;
        bil = 7;
        
        for (count = 0; count < bil; count ++){
            if (count == 3 || count == 5){
                continue;
                 //break;
            }
            System.out.println(count + ". ba");
        }
        System.out.println("z");
    }
}
