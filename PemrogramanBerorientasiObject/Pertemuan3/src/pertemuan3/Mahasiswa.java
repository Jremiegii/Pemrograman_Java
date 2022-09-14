package pertemuan3;

public class Mahasiswa {
    
    String Nama;
    String NIM;
    String Jurusan;
    String WaktuMasuk;
    
    public void setNama(String Name) {
        this.Nama = Name;
    }
    
    public String getNama () {
        return Nama;
    }
    
    public void setNIM (String Nim) {
        this.NIM = Nim;
    }
    
    public String getNIM () {
        return NIM;
    }
    
    public void setProdi(String Prodi) {
        this.Jurusan = Prodi;
    }
    
    public String getProdi() {
        return Jurusan;
    }
    
    public void setTahunMasuk(String Tahun) {
        this.WaktuMasuk = Tahun;
    }
    
    public String getTahunMasuk () {
        return WaktuMasuk;
    }  
}
