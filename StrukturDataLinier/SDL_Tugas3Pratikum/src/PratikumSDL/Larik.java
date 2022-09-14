package PratikumSDL;

public class Larik {

    public static void Cetak(int[] data) {
        
        System.out.print("Data Array = ");
        for (int i = 0; i < data.length; i++) {
            System.out.print(data[i] + " ");
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

    public static int BinarySearch(int[] x, int y) {
        
        int Awal = 0;
        int Akhir = x.length;

        while (Awal <= Akhir) {
            int tengah = ((Awal + Akhir) / 2);
            if (y == x[tengah]) {
                return tengah;
            } else {
                if (x[tengah] > y) {
                    Akhir = (tengah - 1);
                } else {
                    Awal = (tengah + 1);
                }
            }
        }
        return -1;
    }
}
