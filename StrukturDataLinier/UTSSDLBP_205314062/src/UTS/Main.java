//Nama = Fransiskus Jremiegi Saputra
//NIM = 205314062
//Prodi = Informatika

package UTS;

public class Main {

    public static void main(String[] args) {

        int nilai[] = {3, 4, 1, 2, 2, 5};

        System.out.print("Nilai : ");
        Larik.Cetak(nilai);
        System.out.println("");
        //data yang dicari data ketika
        int Cari = 1;
        int hasil = Larik.SequentialSearch(nilai, Cari);
        if (hasil >= 0) {
            System.out.println("Data " + Cari + " ketemu diindeks ke " + hasil);
        } else {
            System.out.println("Data yang dicari tidak ditemukan");
        }

        System.out.println("==============================================");

        Pegawai[] Data = new Pegawai[6];

        Data[0] = new Pegawai("aaa", 4);
        Data[1] = new Pegawai("bbb", 6);
        Data[2] = new Pegawai("ccc", 1);
        Data[3] = new Pegawai("ddd", 3);
        Data[4] = new Pegawai("eee", 2);
        Data[5] = new Pegawai("fff", 6);

        System.out.println("Data Array Sebelum Diurutkan");
        Larik.Cetak(Data);
        System.out.println("Data Array Setelah Diurutkan Diurutkan");
        Larik.InsertionSortAsc(Data);
        Larik.Cetak(Data);
    }
}
