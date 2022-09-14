package PratikumSDL;

public class Larik {

    public static void Cetak(int[] data) {

        System.out.print("Data Array = ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
        }
    }
    
    public static void BubleSortAsc(int[] Larik) {

        for (int iterasi = 1; iterasi <= Larik.length - 1; iterasi++){
            for (int elemen = 0; elemen <= Larik.length - 1 - iterasi; elemen++){
                if (Larik[elemen] > Larik[elemen + 1]){
                    int temp = Larik[elemen];
                    Larik[elemen] = Larik[elemen + 1];
                    Larik[elemen + 1] = temp;
                }
            }
        }
    }
    
    public static void BubleSortDesc(int[] Larik) {

        for (int iterasi = 1; iterasi <= Larik.length - 1; iterasi++) {
            for (int elemen = 0; elemen <= Larik.length - 1 - iterasi; elemen++) {
                if (Larik[elemen] < Larik[elemen + 1]) {
                    int temp = Larik[elemen];
                    Larik[elemen] = Larik[elemen + 1];
                    Larik[elemen + 1] = temp;
                }
            }
        }
    }
    
    public static void SelectionSortAsc(int[] Larik){
        
        for (int iterasi = 0; iterasi <= Larik.length - 2; iterasi++){
            int minIndeks = iterasi;
            for (int elemen = iterasi + 1; elemen <= Larik.length - 1; elemen++){
                if (Larik[elemen] < Larik[minIndeks]){
                }
            }
            int temp = Larik[iterasi];
            Larik[iterasi] = Larik[minIndeks];
            Larik[minIndeks] = temp;
        }
    }
    
    public static void SelectionSortDesc(int[] Larik){

        for (int iterasi = 0; iterasi <= Larik.length - 2; iterasi++){
            int minIndeks = iterasi;
            for (int elemen = iterasi + 1; elemen <= Larik.length - 1; elemen++){
                if (Larik[elemen] > Larik[minIndeks]){
                    minIndeks = elemen;
                }
            }
            int temp = Larik[iterasi];
            Larik[iterasi] = Larik[minIndeks];
            Larik[minIndeks] = temp;
        }
    }
    
    public static void InsertionSortAsc(int[] Larik){
        
        for(int iterasi = 1; iterasi <= Larik.length-1; iterasi++){
            for(int elemen = iterasi; elemen >= 1; elemen--){
                if(Larik[elemen] < Larik[elemen-1]){
                    int Data = Larik[elemen];
                    Larik[elemen] = Larik[elemen-1];
                    Larik[elemen-1] = Data;
                } else {
                    elemen = 0;
                }
            }
        }
    }
    
    public static void InsertionSortDesc(int[] Larik){
        
        for(int iterasi = 1; iterasi <= Larik.length-1; iterasi++){
            for(int elemen = iterasi; elemen >= 1; elemen--){
                if(Larik[elemen] > Larik[elemen-1]){
                    int Data = Larik[elemen];
                    Larik[elemen] = Larik[elemen-1];
                    Larik[elemen-1] = Data;
                } else {
                    elemen = 0;
                }
            }
        }
    }
}
