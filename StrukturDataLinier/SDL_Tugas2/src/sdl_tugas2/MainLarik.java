package sdl_tugas2;

import java.util.Scanner;

public class MainLarik {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        
        int Jumlah, Angka;
        
        System.out.print("Jumlah Data = ");
        Jumlah = in.nextInt();
        
        int Data[] = new int[Jumlah];
        for(int i = 0; i < Data.length; i++){
            System.out.print("Masukan Data = ");
            Angka = in.nextInt();
            Data[i] = Angka;
        }
        Larik.Cetak(Data);
    }
}
