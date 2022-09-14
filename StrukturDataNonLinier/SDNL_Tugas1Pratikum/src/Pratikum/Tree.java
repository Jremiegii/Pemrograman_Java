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
}
