package pertemuan2;

import javax.swing.JOptionPane;

public class PersegiMain {
    
    public static void main(String[] args) {
        
        Persegi objPersegi = new Persegi();
        
        objPersegi.setPanj(Integer.parseInt(JOptionPane.showInputDialog("Masukkan Panjang")));
        objPersegi.setLebar(Integer.parseInt(JOptionPane.showInputDialog("Masukkan Lebar")));
        JOptionPane.showMessageDialog(null, "Luas dari persegi dengan panjang= " + objPersegi.getPanj() + " dan lebar = " + objPersegi.getLebar() + " adalah " + objPersegi.luas());
    }
}
