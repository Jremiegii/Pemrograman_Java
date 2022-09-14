package BST;

public class TreeNode {
    private DataGuru Data;
    private TreeNode leftNode;
    private TreeNode rightNode;
    private TreeNode parent;

   public TreeNode(){}
    public TreeNode(DataGuru Data){
    this.Data = Data;
}

    public DataGuru getData() {
        return Data;
    }

    public void setData(DataGuru Data) {
        this.Data = Data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
    
     public TreeNode getParent() {
        return parent;
    }

    public void setParent(TreeNode parent) {
        this.parent = parent;
    }
}
