//Nama = Fransiskus Jremiegi Saputra
//NIM = 205314062
//Prodi = Informatika

package PratikumSDL;

public class Larik {

    public static void Cetak(Object[] data) {

        System.out.println("Data Array = ");
        for (int i = 0; i < data.length; i++) {
            System.out.println(data[i] + " ");
        }
    }

    public static int SequentialSearch(Object[] x, Object y) {

        for (int i = 0; i < x.length; i++) {
            if (((Comparable) x[i]).compareTo(y) == 0) {
                return i;
            }
        }
        return -1;
    }

    public static int BinarySearch(Object[] x, Object y) {

        int Awal = 0;
        int Akhir = x.length;

        while (Awal <= Akhir) {
            int tengah = ((Awal + Akhir) / 2);
            if (((Comparable) x[tengah]).compareTo(y) == 0) {
                return tengah;
            } else {
                if (((Comparable) x[tengah]).compareTo(y) == 1) {
                    Akhir = (tengah - 1);
                } else {
                    Awal = (tengah + 1);
                }
            }
        }
        return -1;
    }
}
