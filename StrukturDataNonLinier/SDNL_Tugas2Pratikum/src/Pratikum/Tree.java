package Pratikum;

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
                        System.out.println("Berhasil Menambahkan Data " + Baru.getData());
                        return;
                    } else {
                        Bantu = Bantu.getRightNode();
                    }
                } else {
                    if(Bantu.getLeftNode() == null) {
                        Bantu.setLeftNode(Baru);
                        System.out.println("Berhasil Menambahkan Data " + Baru.getData());
                        return;
                    } else {
                        Bantu = Bantu.getLeftNode();
                    }
                }
            }
        }
    }
    
    public TreeNode search(int Data){
        
        TreeNode Cari = root;
        
        while(Cari != null){
            if(Data == Cari.getData()){
                return Cari;
            } else if(Cari.getData() <= Data) {
                Cari = Cari.getRightNode();
            } else {
                Cari = Cari.getLeftNode();
            }
        }
        return null;
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
}
