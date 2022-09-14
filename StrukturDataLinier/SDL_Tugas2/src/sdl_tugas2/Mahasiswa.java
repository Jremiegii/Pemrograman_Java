package sdl_tugas2;

public class Mahasiswa {
    
    private String Nama;
    private String NIM;
    private String AsalDaerah;
    
    
    Mahasiswa(String nama, String nim, String DaerahAsal){
        this.Nama = nama;
        this.NIM = nim;
        this.AsalDaerah = DaerahAsal;
    }

    public String getNama() {
        return Nama;
    }

    public String getNIM() {
        return NIM;
    }

    public String getAsalDaerah() {
        return AsalDaerah;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" + "Nama = " + Nama + ", NIM = " + NIM + ", AsalDaerah = " + AsalDaerah + '}';
    }
}
