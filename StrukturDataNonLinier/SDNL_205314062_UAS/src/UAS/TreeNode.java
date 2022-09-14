package UAS;

public class TreeNode {

    int data;
    TreeNode leftNode;
    TreeNode RightNode;

    public TreeNode() {
    }

    public TreeNode(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return RightNode;
    }

    public void setRightNode(TreeNode RightNode) {
        this.RightNode = RightNode;
    }

    public boolean isLeaf() {

        if (getLeftNode() == null && getRightNode() == null) {
            return true;
        } else {
            return false;
        }
    }
}
