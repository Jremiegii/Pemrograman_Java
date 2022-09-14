package pertemuan6;

public class Perusahaan {
    
    /* Membuat atribut bersifat private berupa KodePerusahaan,
    NamaPerusahaan dan kepalaPerusahaan*/
    private String KodePerusahaan;
    private String NamaPerusahaan;
    private String KepalaPerusahaan;
    private Pegawai[] Anggota;
    
    // Membuat constructor pada kelas Perusahaan dengan parameter berupa Nama dan Kode
    Perusahaan(String Nama, String Kode) {
        
        this.KodePerusahaan = Kode;
        this.NamaPerusahaan = Nama;
        
    }
    
    //Membuat setter dan getter pada method Kode, NamaPerusahaan dan KepalaPerusahaan
    public void setKode(String Perusahaan) {
        this.KodePerusahaan = Perusahaan;
    }
    
    public String getKode(){
        return KodePerusahaan;
    }
    
    public void setNamaPerusahaan(String Perusahaan) {
        this.NamaPerusahaan =  Perusahaan;
    }
    
    public String getNamaPerusahaan() {
        return NamaPerusahaan;
    }
    
    public void setKepalaPerusahaan(String Ketua) {
        this.KepalaPerusahaan = Ketua;
    }
    
    public String getKepalaPerusahaan() {
        return KepalaPerusahaan;
    }
    
    public void Pegawai(Pegawai[] Anggota) {
        this.Anggota = Anggota;
    }
    
    public Pegawai[] getPegawai() {
        return Anggota;
    }
}
