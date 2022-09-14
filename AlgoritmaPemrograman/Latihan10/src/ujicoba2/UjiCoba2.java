package ujicoba2;

public class UjiCoba2 {

    public static void main(String[] args) {
        
        // Menulis bintang( * ) memakai metode
 
        bintang(5);// 5 bintang
        bintang(7);// 7 bintang
        bintang(10);// 10 bintang
        Penjumlahan (2, 3, 4, 5);
    }

    static void bintang(int n) {
        System.out.print(n + " bintang: ");
       for (int i = 1; i <= n; i++) {
            System.out.print(" * ");
        }
        System.out.println("");
    }
    
    static void Penjumlahan (int n, int m, int o, int q) {
        System.out.println(m + " " + " + " + n + " " + " = " + (m + n));
        System.out.println("Penjumlahan dari 4 + 5 = " + (o + q));
    }
}
