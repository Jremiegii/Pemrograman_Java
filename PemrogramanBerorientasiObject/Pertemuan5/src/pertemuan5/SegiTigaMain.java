package pertemuan5;

public class SegiTigaMain {

    public static void main(String[] args) {

        // Membuat objek baru berupa titik1, titik2 dan titik3 dari kelas Titik
        Titik titik1 = new Titik(0, 0);
        Titik titik2 = new Titik(5, 4);
        Titik titik3 = new Titik(8, 2);

        //Membuat objek baru berupa Segitiga dari kelas SegiTiga
        SegiTiga Segitiga = new SegiTiga(titik1, titik2, titik3);

        //Menampilkan/mencetak hasil akhir pada jendela output
        System.out.println("Luas        = " + Segitiga.hitungLuas());
        System.out.println("Keliling    = " + Segitiga.hitungKeliling());
    }
}
