//Nama = Fransiskus Jremiegi Saputra
//NIM = 205314062
//Prodi = Informatika

package UTS;

public class Larik {

    public static void Cetak(int[] data) {
        
        System.out.print("Data Array = ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
    
    public static void Cetak(Object[] data) {

        System.out.println("Data Array = ");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] + " ");
        }
    }

    public static int SequentialSearch(int[] x, int y) {
        
        for (int i = 0; i < x.length; i++) {
            if (x[i] == y) {
                return i;
            }
        }
        return -1;
    }
    
    public static void InsertionSortAsc(Object[] Larik){
        
        for(int iterasi = 1; iterasi <= Larik.length-1; iterasi++){
            for(int elemen = iterasi; elemen >= 1; elemen--){
                if (((Comparable)Larik[elemen]).compareTo(Larik[elemen-1]) < 0){
                    Object Data = Larik[elemen];
                    Larik[elemen] = Larik[elemen-1];
                    Larik[elemen-1] = Data;
                } else {
                    elemen = 0;
                }
            }
        }
    }   
}
