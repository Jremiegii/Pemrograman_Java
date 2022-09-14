package Pratikum;

import java.util.Scanner;

public class Latihan4 {

    public static void main(String[] agrs) {

        Scanner in = new Scanner(System.in);

        int Bilangan1, Bilangan2, Hasil;

        while (true) {
            try {
                System.out.print("Masukan bilangan 1 : ");
                Bilangan1 = in.nextInt();
                System.out.print("Masukan bilangan 2 : ");
                Bilangan2 =in.nextInt();
            break;
            } catch (Exception e) {
                System.out.println("Terjadi kesalahan input, mohon diulangi!");
                in.nextLine();
            }
        }
        Hasil = Bilangan1 + Bilangan2;
        System.out.println("Hasil kedua penjumlahan bilangan itu : " + Hasil);
    }
}
