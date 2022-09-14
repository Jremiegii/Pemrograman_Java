package Kelompok3;

/*

205314038_Refokatus Amadeus Martin Putranto
205314043_Delvin Wang
205314062_Fransiskus Jremiegi Saputra
205314063_Moses Amor Deo Wuryanto

*/

public class MasyarakatSekitar extends Penduduk{
    
    private String nomor;
    
    
    public MasyarakatSekitar(String nomor, String nama, String tanggalLahir) {
        super(nama, tanggalLahir);
        this.nomor = nomor;
    }
    
    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    @Override
    public double hitungIuran() {
        return Double.parseDouble(getNomor()) * 100;
    }
}
