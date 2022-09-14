package ProjectKelompok;

public class Identitas implements Comparable{
    
    private int Antrian = 0;
    private String Nama;
    private String Golongan;
    
    Identitas(int Antrian, String Nama, String Golongan){
        
        this.Antrian = Antrian;
        this.Nama = Nama;
        this.Golongan = Golongan;
        
    }

    public int getAntrian() {
        return Antrian;
    }

    public void setAntrian(int Antrian) {
        this.Antrian = Antrian;
    }
    
    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public String getGolongan() {
        return Golongan;
    }

    public void setGolongan(String Golongan) {
        this.Golongan = Golongan;
    }

    @Override
    public String toString() {
        return "No Antrian = " + Antrian + " Nama = " + Nama + " Golongan = " + Golongan + "\n";
    }
    
    @Override
    public int compareTo(Object o) {
        
        return Nama.compareTo(((Identitas)o).getNama());
        
    }
}
