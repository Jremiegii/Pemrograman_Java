package pertemuan5;

public class Perusahaan {
    
    /* Membuat atribut bersifat private berupa KodePerusahaan,
    NamaPerusahaan dan kepalaPerusahaan*/
    private String KodePerusahaan;
    private String NamaPerusahaan;
    private String KepalaPerusahaan;
    
    // Membuat constructor pada kelas Perusahaan dengan parameter berupa Nama dan Kode
    Perusahaan(String Nama, String Kode) {
        
        this.KodePerusahaan = Kode;
        this.NamaPerusahaan = Nama;
        
    }
    
    //Membuat setter dan getter pada method Kode, NamaPerusahaan dan KepalaPerusahaan
    void setKode(String Perusahaan) {
        Perusahaan = "FJ391020102";
        this.KodePerusahaan = Perusahaan;
    }
    
    String getKode(){
        return KodePerusahaan;
    }
    
    void setNamaPerusahaan(String Perusahaan) {
        Perusahaan = "PT Kopi Nusantara Negeri Pertiwi";
        this.NamaPerusahaan =  Perusahaan;
    }
    
    String getNamaPerusahaan() {
        return NamaPerusahaan;
    }
    
    void setKepalaPerusahaan(String Ketua) {
        this.KepalaPerusahaan = Ketua;
    }
    
    String getKepalaPerusahaan() {
        return KepalaPerusahaan;
    }
}
