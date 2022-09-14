package Pratikum;

public class TreeNode {
    
    private int Data;
    private TreeNode leftNode;
    private TreeNode rightNode;
    
    
    TreeNode(int Data){
        
        this.Data = Data;
        
    }

    public int getData() {
        return Data;
    }

    public void setData(int Data) {
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
}
