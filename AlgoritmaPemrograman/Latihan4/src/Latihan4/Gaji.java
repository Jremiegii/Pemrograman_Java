package Latihan4;

import java.util.Scanner;

public class Gaji {
    
    public static void main(String[] args){
        
        Scanner Profit = new Scanner(System.in);
        
        double GajiPokok;
        double JumlahJamLembur;
        double Pajak = 0;
        double Tunjangan;
        double GajiTotal;
        double UpahLembur;
        double GajiBersih;
        
        System.out.print("Gaji = ");
        GajiPokok = Profit.nextDouble();
        System.out.print("Jumlah Jam Lembur = ");
        JumlahJamLembur = Profit.nextDouble();
        
        Tunjangan = GajiPokok*0.15;
        System.out.println("Tunjangan = " + Tunjangan);
        
        UpahLembur = JumlahJamLembur*0.3;
        System.out.println("Upah Lembur = " + UpahLembur);
        
        GajiTotal = GajiPokok + Tunjangan + UpahLembur;
        System.out.println("Gaji totoal = " + GajiTotal);
        
        if (GajiTotal > 1500000) {
            Pajak = GajiPokok*0.10;
            System.out.println("Pajak 10%");
        } else if ((GajiTotal > 500000  && GajiPokok < 1500000)) {
            Pajak = GajiPokok*0.5;
            System.out.println("Pajak 5%");
        } else if (GajiTotal < 500000) {
            System.out.println("Pajak Tidak Berlaku");
        }
        GajiBersih = GajiTotal - Pajak;
        System.out.println("Gaji Bersih = " + GajiBersih);
    }
    
}
