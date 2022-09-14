package Kelompok3;

/*

205314038_Refokatus Amadeus Martin Putranto
205314043_Delvin Wang
205314062_Fransiskus Jremiegi Saputra
205314063_Moses Amor Deo Wuryanto

*/

public class Mahasiswa extends Penduduk{
    
    private String nim;
    
    
    public Mahasiswa(String nim, String nama, String tanggalLahir) {
        super(nama, tanggalLahir);
        this.nim = nim;
    }
    
    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    @Override
    public double hitungIuran() {
        return Double.parseDouble(getNim())/10000;
    }
}
