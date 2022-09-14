package SDNL_UTS;

public class Main {
    
    public static void main(String[] args) {
        
        TreeNode Akar = new TreeNode(35);
        Tree Pohon = new Tree(Akar);
        
        Pohon.insert(96);
        Pohon.insert(57);
        Pohon.insert(64);
        Pohon.insert(65);
        Pohon.insert(96);
        Pohon.insert(16);
        Pohon.insert(19);
        System.out.println("\n");
        
        Pohon.preorderTraversal();
        System.out.println("\n");
        Pohon.inorderTraversal();
        System.out.println("\n");
        Pohon.postorderTraversal();
        System.out.println("\n");
        
        System.out.print("Data = ");
        Pohon.leaf();
        System.out.println("\n"); 
    }
}
