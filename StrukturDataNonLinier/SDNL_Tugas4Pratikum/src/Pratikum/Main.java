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
        
        System.out.println("\n");
        
        TreeNode Mencari = Pohon.search(12);
        
        if(Mencari != null) {
            System.out.println("Data " + Mencari.getData() + " Ditemukan");
        } else {
            System.out.println("Data Tidak Ditemukan");
        }
        
        System.out.println("\n");
        
        Pohon.preorderTraversal();
        System.out.println("\n");
        Pohon.inorderTraversal();
        System.out.println("\n");
        Pohon.postorderTraversal();
        System.out.println("\n");
        
        Pohon.depth(12);
        Pohon.height(42);
        Pohon.leaf();
        Pohon.descendant(6);
        System.out.println("\n");
        
        Pohon.delete(12);
        Pohon.delete(27);
        Pohon.delete(6);
        Pohon.delete(55);
        
        //Untuk Memastikan Data Apakah Sudah Benar-Benar Tehapus
        Pohon.preorderTraversal();
        
    }
}
