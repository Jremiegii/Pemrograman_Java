package BST;

public class DataGuru implements Comparable {

    private String NIP;
    private String Nama;
    private String Umur;
    private String JenisKelamin;
    private String Mengajar;

    public DataGuru(String NIP) {
        this.NIP = NIP;
    }

    public DataGuru(String Nama, String Umur, String JenisKelamin, String Mengajar) {
        this.Nama = Nama;
        this.Umur = Umur;
        this.JenisKelamin = JenisKelamin;
        this.Mengajar = Mengajar;
    }

    public DataGuru(String NIP, String Nama, String Umur, String JenisKelamin, String Mengajar) {
        this.NIP = NIP;
        this.Nama = Nama;
        this.Umur = Umur;
        this.JenisKelamin = JenisKelamin;
        this.Mengajar = Mengajar;

    }

    public String getNIP() {
        return NIP;
    }

    public String getNama() {
        return Nama;
    }

    public String getUmur() {
        return Umur;
    }

    public String getJenisKelamin() {
        return JenisKelamin;
    }

    public String getMengajar() {
        return Mengajar;
    }

    @Override
    public String toString() {
        return NIP + " | " + Nama + " | " + Umur + " | " + JenisKelamin + " | " + Mengajar + "\n";
    }

    public int compareTo(Object o) {
       return NIP.compareTo(((DataGuru)o).getNIP());
//        if (NIP == ((DataGuru) o).getNIP()) {
//            return 0;
//        } else if (NIP > ((DataGuru) o).getNIP()) {
//            return 1;
//        } else {
//            return -1;
//        }
    }

    public void setNIP(String NIP) {
        this.NIP = NIP;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public void setUmur(String Umur) {
        this.Umur = Umur;
    }

    public void setJenisKelamin(String JenisKelamin) {
        this.JenisKelamin = JenisKelamin;
    }

    public void setMengajar(String Mengajar) {
        this.Mengajar = Mengajar;
    }

}
