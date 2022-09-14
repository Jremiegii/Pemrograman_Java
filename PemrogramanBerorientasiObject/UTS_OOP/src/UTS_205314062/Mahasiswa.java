/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UTS_205314062;

/**
 *
 * @author USER
 */
public class Mahasiswa {
    
    private int NIM;
        private String Nama;
        private MataKuliah[] mataKuliah = new MataKuliah[11];
               
        public Mahasiswa(int NIM, String Nama){
            this.NIM = NIM;
            this.Nama = Nama;
    }
      
    /**
     * @return the NIM
     */
    public int getNIM() {
        return NIM;
    }

    /**
     * @param NIM the NIM to set
     */
    public void setNIM(int NIM) {
        this.NIM = NIM;
    }

    /**
     * @return the Nama
     */
    public String getNama() {
        return Nama;
    }

    /**
     * @param Nama the Nama to set
     */
    public void setNama(String Nama) {
        this.Nama = Nama;
    }

    /**
     * @return the mataKuliah
     */
    public MataKuliah[] getMataKuliah() {
        return mataKuliah;
    }

    /**
     * @param mataKuliah the mataKuliah to set
     */
    public void setMataKuliah(MataKuliah[] mataKuliah) {
        this.mataKuliah = mataKuliah;
    }
    
}
