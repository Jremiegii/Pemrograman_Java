package PratikumSDL;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int[] Data = {5, 8, 26, 15, 11, 31};

        System.out.print("Data Yang Dicari = ");
        int Kunci = in.nextInt();

        int Hasil = Larik.SequentialSearch(Data, Kunci);

        if (Hasil == -1) {
            System.out.println(Kunci + " Tidak Ditemukan");
        } else {
            System.out.println(Kunci + " Ditemukan Pada Indeks = " + Hasil);
        }

        System.out.println("");
        Larik.Cetak(Data);
        Arrays.sort(Data);
        Larik.Cetak(Data);
        System.out.println("");

        int hasil = Larik.BinarySearch(Data, Kunci);

        if (hasil == -1) {
            System.out.println(Kunci + " Tidak Ditemukan");
        } else {
            System.out.println(Kunci + " Ditemukan Pada Indeks = " + hasil);
        }
        System.out.println("");
    }
}
