package ujicoba2;

import java.util.Scanner;

public class BagianC3 {

    static double[] x, y;
    static double[] Jarak;
    static double Keliling;
    static int[] A, B, C, D;

    static void bacaTitik() {
        
        String[] puji = {"AB", "AC", "BC"};
        for (int i = 0; i < 3; i++) {
            System.out.println("Sisi " + puji[i]);
            Scanner SegiTiga = new Scanner(System.in);
            System.out.print("Nilai x1 = ");
            A[i] = SegiTiga.nextInt();
            System.out.print("Nilai x2 = ");
            B[i] = SegiTiga.nextInt();
            System.out.print("Nilai y1 = ");
            C[i] = SegiTiga.nextInt();
            System.out.print("Nilai y2 = ");
            D[i] = SegiTiga.nextInt();
        }
    }

    static double hitungJarak(int x1, int y1, int x2, int y2) {
        for (int i = 0; i < 3; i++) {
            x[i] = Math.pow((x2 - x1), 2);
            y[i] = Math.pow((y2 - y1), 2);
            Jarak[i] = Math.sqrt(x[i] + y[i]);
            System.out.println("Sisi = " + Jarak[i]); //3 sisi seperti ini 33
        }
        return x1;
    }

    static double hitungKeliling(double sisiA, double sisiB, double sisiC) {
        Keliling = sisiA + sisiB + sisiC;
        System.out.print("Nilai Keliling = " + sisiA + sisiB + sisiC);
        return Keliling;
    }

    static double hitungLuas(double sisiA, double sisiB) {
        double Luas = Keliling / 2;
        System.out.println("Nilai Luas = " + (sisiA * sisiB) / 2);
        return Luas;
    }

    public static void main(String[] args) {
        x = new double[3];
        y = new double[3];
        A = new int[3];
        B = new int[3];
        C = new int[3];
        D = new int[3];
        Jarak = new double[3];

        bacaTitik();

        for (int i = 0; i < 3; i++) {
            hitungJarak(A[i], B[i], C[i], D[i]);
        }
        hitungKeliling(Jarak[0], Jarak[1], Jarak[2]);
        hitungLuas(Jarak[0], Jarak[1]);
    }
}
