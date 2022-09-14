package PratikumSDL;

public class Mahasiswa implements Comparable {

    private String Nama;
    private int NIM;

    Mahasiswa(String Name, int nim) {

        this.Nama = Name;
        this.NIM = nim;

    }

    Mahasiswa(int nim) {

        this.NIM = nim;

    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public int getNIM() {
        return NIM;
    }

    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "Nama = " + Nama + ", NIM = " + NIM + '}';
    }

    @Override
    public int compareTo(Object o) {

        if (NIM == ((Mahasiswa) o).getNIM()) {
            return 0;
        } else if (NIM > ((Mahasiswa) o).getNIM()) {
            return 1;
        } else {
            return -1;
        }
    }
}
