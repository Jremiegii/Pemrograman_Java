package Tugas2;

public class BilanganPrima {

    public static boolean BilanganPrima(int a, int b) {
        
        boolean HasilAkhir;
        int x, y;
        x = b;

        if (a <= b) {
            return (a == b) ? 
                true : false;
        } else if (a % b == 0) {
            return false;
        }
        return HasilAkhir = BilanganPrima(a, b + 1);
    }

    public static void main(String[] agrs) {
        
        System.out.println("Bilangan prima = ");
        for (int i=1; i <= 10; i++) {
            if (BilanganPrima(i, 2)) {
                System.out.print(i + ", ");
            }   
        }
    }
}
