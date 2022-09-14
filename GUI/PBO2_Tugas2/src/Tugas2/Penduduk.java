package Tugas2;

public abstract class Penduduk {
    
    protected String nama;
    protected String tanggalLahir;
    
    
    Penduduk(String nama, String tanggalLahir){
        
       this.nama = nama;
       this.tanggalLahir = tanggalLahir;
        
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getTanggalLahir() {
        return tanggalLahir;
    }

    public void setTanggalLahir(String tanggalLahir) {
        this.tanggalLahir = tanggalLahir;
    }
    
    public double hitungIuran(){
        return 0;
    }
}
