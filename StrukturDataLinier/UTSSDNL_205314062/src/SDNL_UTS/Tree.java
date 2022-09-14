package SDNL_UTS;

public class Tree {
    
    private TreeNode root;
    
    
    Tree(){
        
        
        
    }
    
    Tree(TreeNode root){
        
        this.root = root;
        
    }
    
    public void insert(int Data){
        
        TreeNode Baru = new TreeNode(Data);
        
        if(root == null){
            root = Baru;
        } else {
            TreeNode Bantu = root;
            while(true) {
                if(Bantu.getData() <= Data) {
                    if(Bantu.getRightNode() == null) {
                        Bantu.setRightNode(Baru);
                        Baru.setParent(Bantu);
                        System.out.println("Berhasil Menambahkan Data " + Baru.getData());
                        return;
                    } else {
                        Bantu = Bantu.getRightNode();
                    }
                } else {
                    if(Bantu.getLeftNode() == null) {
                        Bantu.setLeftNode(Baru);
                        Baru.setParent(Bantu);
                        System.out.println("Berhasil Menambahkan Data " + Baru.getData());
                        return;
                    } else {
                        Bantu = Bantu.getLeftNode();
                    }
                }
            }
        }
    }
    
    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
    
    public void preorderTraversal() {
        
        System.out.print("Pre-order = ");
        preorderHelper(root);
        
    }
    
    public void inorderTraversal() {
        
        System.out.print("In-order = ");
        inorderHelper(root);
        
    }
    
    public void postorderTraversal() {
        
        System.out.print("Post-order = ");
        postorderHelper(root);
        
    }
    
    public void leaf() {
        int Daun = leafHelper(root);
        System.out.println("\t");
        System.out.println("Jumlah Leaf Dari Pohon = " + Daun);
    }
    
    public void preorderHelper(TreeNode Data) {
        
        if(Data != null) {
            System.out.print(Data.getData() + " ");
            preorderHelper(Data.getLeftNode());
            preorderHelper(Data.getRightNode());
        }
    }
    
    public void inorderHelper(TreeNode Data) {
        
        if (Data != null) {
            inorderHelper(Data.getLeftNode());
            System.out.print(Data.getData() + " ");
            inorderHelper(Data.getRightNode());
        }
    }
    
    public void postorderHelper(TreeNode Data) {
        
        if(Data != null) {
            postorderHelper(Data.getLeftNode());
            postorderHelper(Data.getRightNode());
            System.out.print(Data.getData() + " ");
        }
    }
    
    public int leafHelper(TreeNode Data) {
        
        if (Data == null) {
            return 0;
        }
        if (Data.getLeftNode() == null && Data.getRightNode() == null) {
            System.out.print(Data.getData() + " ");
            return 1;
        } else {
            return leafHelper(Data.getLeftNode()) + leafHelper(Data.getRightNode());
        }
    }
}
