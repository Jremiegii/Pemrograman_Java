package TugasKelompok;

import java.io.FileWriter;
import java.io.IOException;

public class Main {
    
    public static void main(String[] agrs){
        
        String jawaban = "TFTFTFTFTTTFFFT";
        String joe = "TFTFTFTFTTTFFTT";
        String jerome = "TFTFTFTFTTTFFFF";
        String jeff = "TFTFTFTFTTTFFFT";

        // 
        int hitungBenarJoe = 0;
        int hitungBenarJerome = 0;
        int hitungBenarJeff = 0;
        char x;
        char y;
        //hitung punya joe
        for (int i = 0; i < jawaban.length(); i++) {
            x = joe.charAt(i);
            y = jawaban.charAt(i);
            if (x == y) {
                hitungBenarJoe++;

            }
        }
        // hitung punya jerome
        for (int i = 0; i < jawaban.length(); i++) {
            x = jerome.charAt(i);
            y = jawaban.charAt(i);
            if (x == y) {
                hitungBenarJerome++;

            }
        }
        // hitung punya jeff
        for (int i = 0; i < jawaban.length(); i++) {
            x = jeff.charAt(i);
            y = jawaban.charAt(i);
            if (x == y) {
                hitungBenarJeff++;

            }
        }
//        System.out.println("JOE Kamu Benar : " + hitungBenarJoe);
//        System.out.println("Jerome Kamu Benar : " + hitungBenarJerome);
//        System.out.println("JEFF Kamu Benar : " + hitungBenarJeff);
////        String fileContent;
        try {
            FileWriter fileWriter = new FileWriter("Hasil.txt");
            fileWriter.write("Kunci jawaban : \n" + jawaban);
            fileWriter.write("\nJoe Jones\n" + joe + " Jawaban benar kamu sebanyak : " + hitungBenarJoe);
            fileWriter.write("\nJanet Jerome\n" + jerome + " Jawaban benar kamu sebanyak : " + hitungBenarJerome);
            fileWriter.write("\nJeff Jubilee\n" + jeff + " Jawaban benar kamu sebanyak : " + hitungBenarJeff);
            fileWriter.close();
            System.out.println("File berhasil ditambahkan");
        } catch (IOException e) {
            System.out.println("Terjadi kesalahan karena: " + e.getMessage());
        }  
    }
}
