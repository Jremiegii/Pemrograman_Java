//Nama = Fransiskus Jremiegi Saputra
//NIM = 205314062
//Prodi = Informatika

package UTS;

public class Pegawai implements Comparable{
    
    private String Nama;
    private int NIP;
    
    
   Pegawai(String Name, int nip){
       
       this.Nama = Name;
       this.NIP = nip;
       
   }
   
   Pegawai(int nip){
       
       this.NIP = nip;
       
   }

    public String getNama() {
        return Nama;
    }

    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    public int getNIP() {
        return NIP;
    }

    public void setNIP(int NIP) {
        this.NIP = NIP;
    }

    @Override
    public String toString() {
        return "NIP = " + NIP + ", Nama = " + Nama;
    }
    
    @Override
    public int compareTo(Object o) {
        
        if(NIP == ((Pegawai)o).getNIP()){
            return 0;
        } else if(NIP > ((Pegawai)o).getNIP()){
            return 1;
        } else {
            return -1;
        }
    }
}
