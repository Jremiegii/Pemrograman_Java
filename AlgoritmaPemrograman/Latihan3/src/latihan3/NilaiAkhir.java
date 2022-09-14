package latihan3;

import java.util.Scanner;

public class NilaiAkhir {
    
    public static void main(String[] args) {
        
        Scanner NilaiAkhir = new Scanner(System.in);
        
        double UjianSisipan1;
        double UjianSisipan2;
        double UjianAkhirSemester;
        double NilaiFinal;
        
        System.out.print("Nilai Ujian Sisipan 1 = ");
        UjianSisipan1 = NilaiAkhir.nextDouble();
        System.out.print("NIlai Ujian Sisipan 2 = ");
        UjianSisipan2 = NilaiAkhir.nextDouble();
        System.out.print("Nilai Ujian Akhir Semester = ");
        UjianAkhirSemester = NilaiAkhir.nextDouble();
        
        NilaiFinal = ((0.30*UjianSisipan1) + (0.30*UjianSisipan2) + (0.40*UjianAkhirSemester));
        
        System.out.println("Nilai Akhir = " + NilaiFinal);
        
    }
    
}
