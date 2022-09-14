package PratikumSDL;

public class Larik {

    public static void Cetak(Object[] data) {

        System.out.println("Data Array = ");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] + " ");
        }
    }
    
    public static void BubleSortAsc(Object[] Larik) {

        for (int iterasi = 1; iterasi <= Larik.length - 1; iterasi++){
            for (int elemen = 0; elemen <= Larik.length - 1 - iterasi; elemen++){
                if (((Comparable)Larik[elemen]).compareTo(Larik[elemen + 1]) > 0){
                    Object temp = Larik[elemen];
                    Larik[elemen] = Larik[elemen + 1];
                    Larik[elemen + 1] = temp;
                }
            }
        }
    }
    
    public static void BubleSortDesc(Object[] Larik) {

        for (int iterasi = 1; iterasi <= Larik.length - 1; iterasi++) {
            for (int elemen = 0; elemen <= Larik.length - 1 - iterasi; elemen++) {
                if (((Comparable)Larik[elemen]).compareTo(Larik[elemen + 1]) < 0) {
                    Object temp = Larik[elemen];
                    Larik[elemen] = Larik[elemen + 1];
                    Larik[elemen + 1] = temp;
                }
            }
        }
    }
    
    public static void SelectionSortAsc(Object[] Larik){
        
        for (int iterasi = 0; iterasi <= Larik.length - 2; iterasi++){
            int minIndeks = iterasi;
            for (int elemen = iterasi + 1; elemen <= Larik.length - 1; elemen++){
                if (((Comparable)Larik[elemen]).compareTo(Larik[minIndeks]) < 0){
                }
            }
            Object temp = Larik[iterasi];
            Larik[iterasi] = Larik[minIndeks];
            Larik[minIndeks] = temp;
        }
    }
    
    public static void SelectionSortDesc(Object[] Larik){

        for (int iterasi = 0; iterasi <= Larik.length - 2; iterasi++){
            int minIndeks = iterasi;
            for (int elemen = iterasi + 1; elemen <= Larik.length - 1; elemen++){
                if (((Comparable)Larik[elemen]).compareTo(Larik[minIndeks]) > 0){
                    minIndeks = elemen;
                }
            }
            Object temp = Larik[iterasi];
            Larik[iterasi] = Larik[minIndeks];
            Larik[minIndeks] = temp;
        }
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
    
    public static void InsertionSortDesc(Object[] Larik){
        
        for(int iterasi = 1; iterasi <= Larik.length-1; iterasi++){
            for(int elemen = iterasi; elemen >= 1; elemen--){
                if (((Comparable)Larik[elemen]).compareTo(Larik[elemen-1]) > 0){
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
