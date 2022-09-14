package Latihan;

public class Latihan11 {
    
    public static void main(String[] args) {
        int[] Bilangan = {23, 26, 30, 32, 33, 39, 69, 50, 70, 80, 55, 76, 53, 21};
        int[] BilanganGanjil, BilanganGenap;
        int bilangan, A = 0, B = 0, C = 0, D = 0;

        for (int i = 0; i < Bilangan.length; i++) {
            bilangan = Bilangan[i] % 2; // 23     
            if (bilangan == 0) {
                B++; //b=1,2,3,4,5,6,7
            } else {
                A++; // a=1,2,3,4,5,6,7
            }
        }
        BilanganGenap = new int[B];
        BilanganGanjil = new int[A];

        for (int i = 0; i < Bilangan.length; i++) {
            bilangan = Bilangan[i] % 2; //0=23,1=26,2=30,3=32
            if (bilangan == 0) {
                BilanganGenap[C] = Bilangan[i]; //0=26,1=30,2=32
                C++;
            } else {
                BilanganGanjil[D] = Bilangan[i]; //0=23
                D++;
            }
        }
        System.out.print("Bilangan Ganjil = ");
        for (int i = 0; i < BilanganGanjil.length; i++) {
            System.out.print(BilanganGanjil[i] + " ");
        }
        System.out.println("");
        System.out.print("Bilangan Genap  = ");
        for (int i = 0; i < BilanganGenap.length; i++) {
            System.out.print(BilanganGenap[i] + " ");
        }
    }
}





