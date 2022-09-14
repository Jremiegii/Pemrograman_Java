package Tugas2;

public class Mahasiswa extends Penduduk implements Peserta{
    
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

    @Override
    public String getJenisSertifikat() {
        return "Panitia";
        
    }

    @Override
    public String getFasilitas() {
        return "Block Note, Alat Tulis, Laptop";
        
    }

    @Override
    public String getKomsumsi() {
        return "Snack, Makan Siang, Dan Makan Malam";
        
    }
}
