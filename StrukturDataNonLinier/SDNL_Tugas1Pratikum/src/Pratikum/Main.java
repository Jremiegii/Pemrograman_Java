package Pratikum;

public class Main {
    
    public static void main(String[] args) {
        
        TreeNode Akar = new TreeNode(42);
        Tree Pohon = new Tree(Akar);
        
        Pohon.insert(21);
        Pohon.insert(38);
        Pohon.insert(27);
        Pohon.insert(71);
        Pohon.insert(82);
        Pohon.insert(55);
        Pohon.insert(63);
        Pohon.insert(6);
        Pohon.insert(2);
        Pohon.insert(40);
        Pohon.insert(12);
        
        TreeNode Mencari = Pohon.search(102);
        
        if(Mencari != null) {
            System.out.println("Data " + Mencari.getData() + " Ditemukan");
        } else {
            System.out.println("Data Tidak Ditemukan");
        }
    }
}
