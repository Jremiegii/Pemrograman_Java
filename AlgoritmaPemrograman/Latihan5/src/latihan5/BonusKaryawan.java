package latihan5;

import java.util.Scanner;

public class BonusKaryawan {
    
    public static void main(String[] args) {
        
        Scanner Bonus = new Scanner(System.in);
      
        double GajiPokok;
        int MasaKerja;
        int Golongan; 
        
        System.out.print("Gaji Pokok = ");
        GajiPokok = Bonus.nextDouble();
        System.out.print("Masa Kerja = ");
        MasaKerja = Bonus.nextInt();
        System.out.print("Golongan = ");
        Golongan = Bonus.nextInt();
        
        if ((Golongan == 1) && (MasaKerja > 0) && (MasaKerja <= 10)){
            System.out.println("Bonus Karyawan = " + GajiPokok*50/100);  
        }else if ((Golongan == 1) && (MasaKerja >= 11) && (MasaKerja <= 20)){
            System.out.println("Bonus Karyawan = " + GajiPokok*60/100);
        }else if ((Golongan == 1) && (MasaKerja >= 21) && ( MasaKerja <= 30)){
            System.out.println("Bonus Karyawan" + GajiPokok*70/100);
        }else if ((Golongan == 2) && ( MasaKerja > 0) && ( MasaKerja <= 10)){
            System.out.println("Bonus Karyawan = " + GajiPokok*60/100);
        }else if ((Golongan == 2) && (MasaKerja >= 11) && (MasaKerja <= 20)){
            System.out.println("Bonus Karyawan = " + GajiPokok*70/100);
        }else if ((Golongan == 2) && (MasaKerja >=21) && ( MasaKerja <= 30)){
            System.out.println("Bonus Karyawan = " + GajiPokok*80/100);
        }else if ((Golongan == 3) && (MasaKerja >0) && (MasaKerja <= 10)){
            System.out.println("Bonus Karyawan = " + GajiPokok*70/100);
        }else if ((Golongan == 3) && (MasaKerja >=11) && (MasaKerja <= 20)){
            System.out.println("Bonus Karyawan = " + GajiPokok*80/100);
        }else if ((Golongan == 3) && (MasaKerja >=21) && (MasaKerja <= 30)){
            System.out.println("Bonus Karyawan = " + GajiPokok*90/100);
        }else if ((Golongan == 4) && (MasaKerja >0) && (MasaKerja <= 10)){
            System.out.println("Bonus Karyawan = " + GajiPokok*80/100);
        }else if ((Golongan == 4) && (MasaKerja >= 11) && (MasaKerja <= 20)){
            System.out.println("Bonus Karyawan = " + GajiPokok*90/100);
        }else if ((Golongan == 4) && (MasaKerja >= 21) && (MasaKerja <= 30)){
            System.out.println("Bonus Karyawan = " + GajiPokok*100/100);
        }
    }
}
