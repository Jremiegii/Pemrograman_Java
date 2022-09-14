package UTS_205314062;

public class Dosen {
    private int NIP;
    private String Nama;
    private String Alamat;
    
    public Dosen(int NIP, String Nama, String Alamat){
        this.NIP = NIP;
        this.Nama = Nama;
        this.Alamat = Alamat;
    }
    
    public int getNIP() {
        return NIP;
    }

    public void setNIP(int NIP) {
        this.NIP = NIP;
    }
    
    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String Alamat) {
        this.Alamat = Alamat;
    }
}
