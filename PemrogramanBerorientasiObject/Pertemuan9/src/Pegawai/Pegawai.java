package Pegawai;

public abstract class Pegawai {

    protected String Nama;
    protected int Golongan;
    protected String Kasta;
    protected int JumlahAnak;
    protected int JamKerja;
    protected abstract double Total();

    public Pegawai(String nama, String status, int jumAnak, int jamkerja, int golongan) {

        this.Nama = nama;
        this.Golongan = golongan;
        this.Kasta = status;
        this.JumlahAnak = jumAnak;
        this.JamKerja = jamkerja;
    }

    Pegawai() {

    }

    public double getGajipokok() {
        double gajipokok = 0;
        if (getGolongan() == 1) {
            gajipokok = 500000;
        } else if (getGolongan() == 2) {
            gajipokok = 750000;
        } else if (getGolongan() == 3) {
            gajipokok = 1000000;
        }
        return gajipokok;
    }

    public double getGajilembur() {
        double gajilembur = 0;
        if (getJamKerja() > 150) {
            gajilembur = (getJamKerja() - 150) * 20000;
        } else {
            gajilembur = 0;
        }
        return gajilembur;
    }

    public String getNama() {
        return Nama;
    }

    public double getTunjKelu() {
        double tunjAnk = 0;
        if (getJumlahAnak() <= 3 && getJumlahAnak() != 0) {
            tunjAnk = (0.1 * getGajipokok() * getJumlahAnak());
        } else if (getJumlahAnak() > 3) {
            tunjAnk = 0;
        }

        return tunjAnk;
    }

    public int getJumlahAnak() {
        return JumlahAnak;
    }

    public int getJamKerja() {
        return JamKerja;
    }

    public int getGolongan() {
        return Golongan;
    }

    public void setNama(String nama) {
        this.Nama = nama;
    }

    public void setJumlahAnak(int jumAnk) {
        this.JumlahAnak = jumAnk;
    }

    public void setJamKerja(int jamkerja) {
        this.JamKerja = jamkerja;
    }

    public void setGolongan(int golongan) {
        this.Golongan = golongan;
    }
}
