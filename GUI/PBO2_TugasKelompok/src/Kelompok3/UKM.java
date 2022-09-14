package Kelompok3;

/*

205314038_Refokatus Amadeus Martin Putranto
205314043_Delvin Wang
205314062_Fransiskus Jremiegi Saputra
205314063_Moses Amor Deo Wuryanto

*/

public class UKM {
    
    private String namaUnit;
    private Mahasiswa ketua;
    private Mahasiswa sekretaris;
    private Penduduk[] anggota;
    
    
    UKM(String NamaUnit){
        
        this.namaUnit = NamaUnit;
        
    }

    public String getNamaUnit() {
        return namaUnit;
    }

    public void setNamaUnit(String namaUnit) {
        this.namaUnit = namaUnit;
    }

    public Mahasiswa getKetua() {
        return ketua;
    }

    public void setKetua(Mahasiswa ketua) {
        this.ketua = ketua;
    }

    public Mahasiswa getSekretaris() {
        return sekretaris;
    }

    public void setSekretaris(Mahasiswa sekretaris) {
        this.sekretaris = sekretaris;
    }

    public Penduduk[] getAnggota() {
        return anggota;
    }

    public void setAnggota(Penduduk[] anggota) {
        this.anggota = anggota;
    }
}
