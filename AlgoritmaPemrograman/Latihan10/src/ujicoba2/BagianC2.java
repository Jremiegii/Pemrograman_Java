package ujicoba2;

import java.util.Scanner;

public class BagianC2 {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int r,n;
        
        System.out.print("Nilai n = ");
        n = in.nextInt();
        r = 1;
        System.out.println("nilai dari C(" + n + "," + r + ")adalah = " + kombinasi(n, r));
        for (int i = 0; i <= n; i++) {
            System.out.print(kombinasi(n, i) + " ");
        }
        System.out.println("");
    }

    static int Faktorial(int n) {

        int hasFak = 1;
        if (n == 0) {
            return 1;
        } else {
            for (int i = 1; i <= n; i++) {
                hasFak = hasFak * i;
            }
            return hasFak;
        }
    }

    static int kombinasi(int n, int r) {
        int HasilFaktorial = Faktorial(n) / (Faktorial(n - r) * Faktorial(r));
        return HasilFaktorial;
    }
}
