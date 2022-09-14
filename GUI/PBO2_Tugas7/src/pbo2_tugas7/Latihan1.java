package pbo2_tugas7;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Latihan1 {
    
    public static void main(String[] args){
        
        Scanner sc = new Scanner(System.in);
        int waktu = 0;
        
        try{
            System.out.print("Masukan Jarak Perjalanan Anda (km): ");
            int jarak = sc.nextInt();
            System.out.print("Masukan kecepatan kendaraan anda (km/jam): ");
            int kecepatan = sc.nextInt();
            waktu = jarak/kecepatan;
        }catch(InputMismatchException e){
            System.out.println("Maaf terjadi kesalahan input");
        }catch(ArithmeticException e){
            System.out.println("Maaf terjadi kesalahan proses perhitungan");
        }finally{
            System.out.println("Waktu yang anda butuhkan adalah "+waktu+" jam");
        }
        
        System.out.println("Terima Kasih.....");
    }   
}
