package Tugas2;

public class MasyarakatSekitar extends Penduduk implements Peserta{
    
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

    @Override
    public String getJenisSertifikat() {
        return "Peserta";
        
    }

    @Override
    public String getFasilitas() {
        return "Block Note, Alat Tulis, Dan Modul Pelatihan"; 
        
    }

    @Override
    public String getKomsumsi() {
        return "Snack Dan Makan Siang";
        
    }
}
