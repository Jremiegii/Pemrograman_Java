package ujicoba2;

import java.util.Scanner;

public class BagianC1 {
    
    public static void main(String[] args){
        
        Scanner Faktorial = new Scanner(System.in);
        System.out.print(" masukkan r = ");
        int r = Faktorial.nextInt();
        System.out.print(" masukkan n = ");
        int n = Faktorial.nextInt();
        faktorial(n);
        faktorial(n - r);
        faktorial(r);
        int hasilFaktorial;
        if (r<n){
        hasilFaktorial = faktorial(n) / (faktorial(n - r) * faktorial(r));
        System.out.println("Nilai dari C(n,r) ! adalah " + hasilFaktorial);
        System.out.println("");
        }
    }
    static int faktorial(int n) {

        int hasFak = 1;
        if (n == 0) {
            return 0;
        } else {
            for (int i = 1; i <= n; i++) {
                hasFak = hasFak * i;

            }

        }
        return hasFak;
    }
}
