package pbo2_tugas7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Latihan2 {

    public static void main(String[] agrs) {

        int s = 0;
        int v = 0;
        int t = 0;

        try {
            Latihan2 lat = new Latihan2();
            s = lat.getJarak();
            v = lat.getKecepatan();
            t = lat.gethitungWaktu(s, v);
        } catch (InputMismatchException e) {
            System.out.println("Maaf terjadi kesalahan input");
        } catch (ArithmeticException e) {
            System.out.println("Maaf terjadi kesalahan proses perhitungan");
        } finally {
            System.out.println("Waktu yang anda butuhkan adalah: " + t + " jam");
        }

        System.out.println("Terima Kasih.....");
    }

    public int getJarak() throws InputMismatchException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan kecepatan anda (km/jam): ");
        int kecepatan = sc.nextInt();
        return kecepatan;

    }

    public int getKecepatan() throws InputMismatchException {

        Scanner sc = new Scanner(System.in);
        System.out.print("Masukan kecepatan kendaraan anda (km/jam): ");
        int kecepatan = sc.nextInt();
        return kecepatan;

    }

    public int gethitungWaktu(int jarak, int kecepatan) throws ArithmeticException {

        int waktu = 0;
        waktu = jarak / kecepatan;
        return waktu;

    }
}
