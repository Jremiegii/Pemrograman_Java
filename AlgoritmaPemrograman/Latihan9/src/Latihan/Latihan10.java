package Latihan;

public class Latihan10 {
    
    public static void main(String[] args){
        
        int[] Semester1 = {20, 40, 50, 60, 70};
        int[] Semester2 = {25, 25, 55, 65, 75};
        int[] NilaiSemester;
        int Nilai = 0;       
        NilaiSemester = new int [Semester1.length + Semester2.length];
        System.out.print("Nilai gabungan = ");        
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < Semester1.length; j++) {
                if (i==0) {
                    Nilai = Semester1[j];
                    NilaiSemester [j] = Nilai;
                }else{
                    Nilai = Semester2[j];
                    NilaiSemester [j + 5] = Nilai;
                }
            }
        }
        for (int i = 0; i < NilaiSemester.length; i++) {
            System.out.print(NilaiSemester[i] + " ");
        }
    }
}




