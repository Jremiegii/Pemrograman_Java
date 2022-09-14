package pertemuan2;

import java.util.Scanner;

public class BujurSakarMain {
    
    public static void main(String[] args) {
        
        BujurSangkar bujur1 = new BujurSangkar();
        BujurSangkar bujur2 = new BujurSangkar();
        
        Scanner tombol = new Scanner(System.in);
        System.out.print("Masukan sisi bujur sangkar I : ");
        bujur1.sisi = tombol.nextInt();
        
        System.out.print("Masukan sisi bujur sangkar II : ");
        bujur2.sisi = tombol.nextInt();
        
        System.out.println("Luas bujur sangkar dengan sisi = " + bujur1.sisi + " adalah bujur = " + bujur1.luas());
        System.out.println("Luas bujur sangkar dengan sisi = " + bujur2.sisi + " adalah bujur = " + bujur2.luas());
        
    }
}
