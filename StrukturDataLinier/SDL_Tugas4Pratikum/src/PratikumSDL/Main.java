package PratikumSDL;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {
        
        Mahasiswa[] USD = new Mahasiswa[3];
        
        USD[0] = new Mahasiswa("Egi", 205314062);
        USD[1] = new Mahasiswa("Moses", 205314063);
        USD[2] = new Mahasiswa("Cahya", 205314064);
        
        Scanner in = new Scanner(System.in);
        
        System.out.print("Data Yang Dicari = ");
        int Data = in.nextInt();
        Mahasiswa XY = new Mahasiswa(Data);
        
        int Hasil = Larik.SequentialSearch(USD, XY);
        Larik.Cetak(USD);
        
        if(Hasil == -1){
            System.out.println(XY.getNIM() + " Tidak Terdapat Data Mahasiswa");
        } else {
            System.out.println("Data Mahasiswa Yang Dicari Pada Ideks = " + Hasil);
        }
        
        System.out.println();
        Arrays.sort(USD);
        Larik.Cetak(USD);
        System.out.println();
        
        Hasil = Larik.BinarySearch(USD, XY);
        
        if(Hasil == -1){
            System.out.println(XY.getNIM() + " Tidak Terdapat Data Mahasiswa");
        } else {
            System.out.println("Data Mahasiswa Yang Dicari Pada Indeks = " + Hasil);
        }
    }
}
