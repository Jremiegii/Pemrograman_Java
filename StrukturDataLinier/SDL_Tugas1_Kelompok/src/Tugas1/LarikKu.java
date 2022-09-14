/*
Kelompok 8
Anggota:
Petrus Krisna Priya Nanda (205314060)     = 34% (Persentse Kontribusi)
Yohanes Rio Septian S (205314061)         = 33% (Persentase Kontribusi)
Fransiskus Jremiegi S (205314062)         = 33% (Persentase Kontribusi)
*/

package Tugas1;

public class LarikKu {

    private double[] data;
    private int maxData;
    private int jumlahData = 0;

    public LarikKu(int maxData) {
        data = new double[maxData];
        this.maxData = maxData;
    }

    public void tambahBelakang(double data) {
        this.data[jumlahData] = data;
        jumlahData++;
    }

    public void tambahDepan(double data) {
        jumlahData++;
        for (int i = jumlahData; i > 0;) 
            this.data[i] = this.data[--i];
        this.data[0] = data;
    }

    public void printData() {
        System.out.println("Jumlah Data = " + this.jumlahData);
        System.out.print("Larik       = ");
        for (int i = 0; i < jumlahData; i++) {
            System.out.print(this.data[i] + "; ");
        }
        System.out.println();
        System.out.println();
    }

    public void cariData(double data) {
        int j;
        for (j = 0; j < this.data.length; j++) {
            if (this.data[j] == data) {
                System.out.println(data + " berada di indeks no : " + j + "\n");
                break;
            }
        }
        if (j == maxData) {
            System.out.println(data + " tidak ada di larik");
        }
    }
}
