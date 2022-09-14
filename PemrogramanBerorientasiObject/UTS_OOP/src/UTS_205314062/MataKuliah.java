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
public class MataKuliah {
 
    
    private int kodeMtk;
    private String namaMtk;
    private int SKS;
    private String namaDos;
    
    public MataKuliah(int kodeMtk, String namaMtk, int SKS, String namaDos){
        this.kodeMtk = kodeMtk;
        this.namaMtk = namaMtk;
        this.SKS = SKS;
        this.namaDos = namaDos;
    }

    /**
     * @return the kodeMtk
     */
    public int getKodeMtk() {
        return kodeMtk;
    }

    /**
     * @param kodeMtk the kodeMtk to set
     */
    public void setKodeMtk(int kodeMtk) {
        this.kodeMtk = kodeMtk;
    }

    /**
     * @return the namaMtk
     */
    public String getNamaMtk() {
        return namaMtk;
    }

    /**
     * @param namaMtk the namaMtk to set
     */
    public void setNamaMtk(String namaMtk) {
        this.namaMtk = namaMtk;
    }

    /**
     * @return the SKS
     */
    public int getSKS() {
        return SKS;
    }

    /**
     * @param SKS the SKS to set
     */
    public void setSKS(int SKS) {
        this.SKS = SKS;
    }

    /**
     * @return the namaDos
     */
    public String getNamaDos() {
        return namaDos;
    }

    /**
     * @param namaDos the namaDos to set
     */
    public void setNamaDos(String namaDos) {
        this.namaDos = namaDos;
    }
}
