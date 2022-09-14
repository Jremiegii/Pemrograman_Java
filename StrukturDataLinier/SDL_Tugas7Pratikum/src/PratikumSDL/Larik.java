package PratikumSDL;

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
    
    public static void SortQiuck(int[] x){
        
        QuickSort(x, 0, x.length-1);
    }
    
    public static void SortQiuck(Object[] x){
        
        QuickSort(x, 0, x.length - 1);
    }
    
    public static void QuickSort(int x[], int Awal, int Akhir) {
        
        int tukar;

        if (Awal < Akhir) {

            int i = Awal + 1;
            int j = Akhir;

            while (i <= Akhir && x[i] <= x[Awal]) {
                i = i + 1;
            }

            while (j > Awal && x[j] > x[Awal]) {
                j = j - 1;
            }

            if (i < j) {

                tukar = x[i];
                x[i] = x[j];
                x[j] = tukar;

                while (i <= Akhir && x[i] <= x[Awal]) {
                    i = i + 1;
                }

                while (j > Awal && x[j] > x[Awal]) {
                    j = j - 1;
                }
            }

            tukar = x[Awal];
            x[Awal] = x[j];
            x[j] = tukar;

            QuickSort(x, Awal, j - 1);

            QuickSort(x, j + 1, Akhir);

        }
    }

    public static void QuickSort(Object x[], int Awal, int Akhir) {
        
        Object tukar;

        if (Awal < Akhir) {

            int i = Awal + 1;
            int j = Akhir;

            while (i <= Akhir && ((((Comparable) x[i]).compareTo(x[Awal]) < 0) || 
                    (((Comparable) x[i]).compareTo(x[Awal]) == 0))) {

                i = i + 1;
            }

            while (j > Awal && ((Comparable) x[j]).compareTo(x[Awal]) > 0) {

                j = j - 1;
            }

            if (i < j) {

                tukar = x[i];
                x[i] = x[j];
                x[j] = tukar;

                while (i <= Akhir && ((((Comparable) x[i]).compareTo(x[Awal]) < 0) || 
                        (((Comparable) x[i]).compareTo(x[Awal]) == 0))) {
                    i = i + 1;
                }

                while (j > Awal && ((Comparable) x[j]).compareTo(x[Awal]) > 0) {
                    j = j - 1;
                }
            }
            
            tukar = x[Awal];
            x[Awal] = x[j];
            x[j] = tukar;
            
            QuickSort(x, Awal, j - 1);
            QuickSort(x, j + 1, Akhir);
        }
    }
}
