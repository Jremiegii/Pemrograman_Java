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
    
    public void depth(int Data) {
        
        int i = 0;
        int Kedalaman = depthHelper(root, Data, i);
        System.out.println("Kedalaman Simpul " + Data + " = " + Kedalaman);
        
    }
    
    public void height(int Data) {
        
        int i = 0;
        int Ketinggian = depthHelper(root, Data, i);
        int Tinggi = -1;
        if(Ketinggian != -1) {
            int KetinggianMax = heigthHelper(root);
            Tinggi = KetinggianMax - Ketinggian;
        }
        System.out.println("Ketinggian Simpul " + Data + " = " + Tinggi);
        
    }
    
    public void leaf() {
        int Daun = leafHelper(root);
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
    
    public int depthHelper(TreeNode Data, int Simpul, int i) {
        
        if(Data == null) {
            i = -1;
        } else if(Simpul == Data.getData()) {
            return i;
        } else if(Simpul < Data.getData()) {
            Data = Data.getLeftNode();
            i = depthHelper(Data, Simpul, i);
            if(i != -1) {
                i++;
            }
        } else {
            Data = Data.getRightNode();
            i = depthHelper(Data, Simpul, i);
            if(i != -1) {
                i++;
            }
        }
        return i;
    }
    
    public int heigthHelper(TreeNode Data) {
        
        if(Data == null) {
            return 0;
        } else {
            int LeftNode = heigthHelper(Data.getLeftNode());
            int RightNode = heigthHelper(Data.getRightNode());
            if(LeftNode > RightNode) {
                return LeftNode + 1;
            }
            return RightNode + 1;
        }
        
    }
    
    public int leafHelper(TreeNode Data) {
        
        if(Data == null) {
            return 0;
        }
        if(Data.getLeftNode() == null && Data.getRightNode() == null) {
            return 1;
        } else {
            return leafHelper(Data.getLeftNode()) + leafHelper(Data.getRightNode());
        }
        
    }
    
    public void descendant(int Data) {
        
        TreeNode Bantu = search(Data);
        
        if(Bantu == null) {
            System.out.println("Tidak Ditemukan!");
        } else {
            System.out.print("Descendent " + Bantu.getData() + " = ");
            inorderHelper(Bantu.getLeftNode());
            inorderHelper(Bantu.getRightNode());
        }
    }
    
    public boolean delete(int Data) {
        
        TreeNode Node = search(Data);
        TreeNode Parent = Node.getParent();
        TreeNode successor = Successor(Node);
        boolean Cek = false;
        
        if(Node != null) {
            if(Node.getLeftNode() == null && Node.getRightNode() == null) {
                if(Parent.getLeftNode() == Node) {
                    Parent.setLeftNode(null);
                    Node.setParent(null);
                } else {
                    Parent.setRightNode(null);
                    Node.setParent(null);
                }
            } else if(Node.getLeftNode() == null || Node.getRightNode() == null) {
                if (Parent.getLeftNode() == Node) {
                    if (Node.getLeftNode() == null) {
                        Parent.setLeftNode(Node.getRightNode());
                        Node.getRightNode().setParent(Parent);
                        Node.setRightNode(null);
                        Node.setParent(null);
                    } else {
                        Parent.setLeftNode(Node.getLeftNode());
                        Node.getLeftNode().setParent(Parent);
                        Node.setLeftNode(null);
                        Node.setParent(null);
                    }
                    return true;
                } else {
                    if (Node.getLeftNode() == null) {
                        Parent.setRightNode(Node.getLeftNode());
                        Node.getRightNode().setParent(Parent);
                        Node.setRightNode(null);
                        Node.setParent(null);
                    } else {
                        Parent.setRightNode(Node.getLeftNode());
                        Node.getLeftNode().setParent(Parent);
                        Node.setLeftNode(null);
                        Node.setParent(null);
                    }
                }
                return true;
            } else {
                if(successor != null) {
                    if(successor.getRightNode() == null) {
                        if(successor.getParent() == Node) {
                            successor.setLeftNode(Node.getLeftNode());
                        } else {
                            successor.setLeftNode(Node.getLeftNode());
                            successor.getParent().setLeftNode(null);
                            successor.setRightNode(Node.getRightNode());
                            successor.getRightNode().setParent(successor);
                        }
                        successor.getLeftNode().setParent(successor);
                    } else {
                        if(successor.getParent() == Node) {
                            successor.setLeftNode(Node.getLeftNode());
                        } else {
                            successor.getParent().setLeftNode(successor.getRightNode());
                            successor.getRightNode().setParent(successor.getParent());
                            successor.setLeftNode(Node.getLeftNode());
                            successor.setRightNode(Node.getRightNode());
                        }
                        successor.getLeftNode().setParent(successor);
                        successor.getRightNode().setParent(successor);
                    }
                    if(Parent == null) {
                        successor.setParent(null);
                        setRoot(successor);
                    } else {
                        successor.setParent(Parent);
                        if(Node == Parent.getRightNode()) {
                            Parent.setRightNode(successor);
                        } else {
                            Parent.setLeftNode(successor);
                        }
                    }
                    Node.setLeftNode(null);
                    Node.setRightNode(null);
                    Node.setParent(null);
                    return true;
                } else {
                    return false;
                }
            }
        }
        return Cek;
    }
    
    public TreeNode Successor(TreeNode Data) {
        
        if(Data != null) {
            Data = Data.getRightNode();
            while(Data.getLeftNode() != null) {
                Data = Data.getLeftNode();
            }
        }
        return Data;
    }
}
