package UAS;

public class MainTree {

    public static void main(String[] args) {

        Tree Pohon = new Tree();
        
        //Memasukan Data
        Pohon.insert(75);
        Pohon.insert(30);
        Pohon.insert(89);
        Pohon.insert(20);
        Pohon.insert(65);
        Pohon.insert(80);
        Pohon.insert(90);
        Pohon.insert(62);

        //Mengecek Data Menggunakan Preorder Bahwa Data Sukses DiInputkan
        System.out.print("Data = ");
        Pohon.preorderTranversal();
        System.out.println("\n");
        
        // Menghapus Data
        Pohon.delete(75);

        //Mengecek Data Menggunakan Preorder Bahwa Data Sukses DiInputkan
        System.out.print("Data setelah dihapus = ");
        Pohon.preorderTranversal();
        System.out.println("\n");
        
        //Mengecek Data Menggunakan Preorder
        System.out.print("PreOrder Tranversal = ");
        Pohon.preorderTranversal();
        System.out.println("\n");
        
        //Mengecek Data Menggunakan Inorder
        System.out.print("Inorder Tranversal = ");
        Pohon.InorderTranversal();
        System.out.println("\n");
        
        //Mengecek Data Menggunakan Postorder
        System.out.print("Postorder Tranversal = ");
        Pohon.postorderTranversal();
        System.out.println("\n");
    }
}
