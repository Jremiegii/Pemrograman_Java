package UAS;

public class Tree {

    private TreeNode root;

    public Tree() {
    }

    public Tree(TreeNode root) {
        this.root = root;
    }

    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }

    public boolean isEmpty() {
        if (getRoot() == null) {
            return true;
        } else {
            return false;
        }
    }

    public void insert(int x) {
        if (isEmpty()) {
            setRoot(new TreeNode(x));
            return;
        } else {
            TreeNode bantu = getRoot();
            while (true) {
                if (x < bantu.getData()) {
                    if (bantu.getLeftNode() == null) {
                        bantu.setLeftNode(new TreeNode(x));
                        return;
                    } else {
                        bantu = bantu.getLeftNode();
                    }
                } else {
                    if (bantu.getRightNode() == null) {
                        bantu.setRightNode(new TreeNode(x));
                        return;
                    } else {
                        bantu = bantu.getRightNode();
                    }
                }
            }
        }
    }

    public TreeNode getNode(int x) {
        TreeNode bantu = root;
        while (bantu != null) {
            if (x == bantu.getData()) {
                return bantu;
            } else {
                if (x < bantu.getData()) {
                    bantu = bantu.getLeftNode();
                } else {
                    bantu = bantu.getRightNode();
                }
            }
        }
        return bantu;
    }

    public void preorderTranversal() {
        preOrderHelper(root);
    }

    public void InorderTranversal() {
        inOrderHelper(root);
    }

    public void postorderTranversal() {
        postOrderHelper(root);
    }

    private void preOrderHelper(TreeNode localRoot) {
        if (localRoot != null) {
            System.out.print(localRoot.getData() + " ");
            preOrderHelper(localRoot.getLeftNode());
            preOrderHelper(localRoot.getRightNode());
        }
    }

    private void inOrderHelper(TreeNode localRoot) {
        if (localRoot != null) {
            inOrderHelper(localRoot.getLeftNode());
            System.out.print(localRoot.getData() + " ");
            inOrderHelper(localRoot.getRightNode());
        }
    }

    private void postOrderHelper(TreeNode localRoot) {
        if (localRoot != null) {
            postOrderHelper(localRoot.getLeftNode());
            postOrderHelper(localRoot.getRightNode());
            System.out.print(localRoot.getData() + " ");
        }
    }

    public TreeNode getParent(int key) {
        TreeNode bantu = root;
        TreeNode parent = null;
        while (bantu != null) {
            if (key == bantu.getData()) {
                return parent;

            } else {
                if (key < bantu.getData()) {
                    parent = bantu;
                    bantu = bantu.getLeftNode();
                } else {
                    parent = bantu;
                    bantu = bantu.getRightNode();
                }
            }
        }
        return bantu;
    }

    // Membuat Method Depth untuk mengtahui simpul berada di kedalaman berapa?
    public int getDepth(int x) {
        int dept = 0;
        TreeNode bantu = root;
        while (bantu != null) {
            if (x == bantu.getData()) {
                return dept;

            } else {
                if (x < bantu.getData()) {
                    dept++;
                    bantu = bantu.getLeftNode();
                } else {
                    dept++;
                    bantu = bantu.getRightNode();
                }
            }
        }
        return dept;
    }

    public boolean delete(int key) {
        TreeNode bantu = getNode(key);
        TreeNode parentPredecessor = null;
        TreeNode predecessor;
        if (bantu == null) {
            return false;
        } else {
            if (bantu.getData() == root.data) {
                if (bantu.isLeaf()) {
                    root = null;
                } else if (bantu.RightNode == null) {
                    root = bantu.leftNode;
                } else if (bantu.leftNode == null) {
                    root = bantu.RightNode;
                } else {
                    predecessor = getPredecessor(bantu);
                    parentPredecessor = getParent(predecessor.data);
                    bantu.setData(predecessor.data);
                    if (parentPredecessor != bantu) {
                        if (predecessor.leftNode != null) {
                            parentPredecessor.RightNode = predecessor.leftNode;
                        } else {
                            parentPredecessor.RightNode = null;
                        }
                    } else {
                        bantu.leftNode = predecessor.leftNode;
                    }
                }
                return true;
            } else {
                TreeNode parent = getParent(key);
                if (key < parent.data) {
                    if (bantu.isLeaf()) {
                        parent.leftNode = null;
                    } else if (bantu.RightNode == null) {
                        parent.leftNode = bantu.leftNode;
                    } else if (bantu.leftNode == null) {
                        parent.leftNode = bantu.RightNode;
                    } else {
                        predecessor = getPredecessor(bantu);
                        parentPredecessor = getParent(predecessor.data);
                        bantu.setData(predecessor.data);
                        if (parentPredecessor != bantu) {
                            if (predecessor.leftNode != null) {
                                parentPredecessor.RightNode = predecessor.leftNode;
                            } else {
                                parentPredecessor.RightNode = null;
                            }
                        } else {
                            bantu.leftNode = predecessor.leftNode;

                        }
                    }
                } else {
                    if (bantu.isLeaf()) {
                        parent.RightNode = null;
                    } else if (bantu.RightNode == null) {
                        parent.RightNode = bantu.leftNode;
                    } else if (bantu.leftNode == null) {
                        parent.RightNode = bantu.RightNode;
                    } else {
                        predecessor = getPredecessor(bantu);
                        parentPredecessor = getParent(predecessor.data);
                        bantu.setData(predecessor.data);
                        if (parentPredecessor != bantu) {
                            if (predecessor.leftNode != null) {
                                parentPredecessor.RightNode = predecessor.leftNode;
                            } else {
                                parentPredecessor.RightNode = null;
                            }
                        } else {
                            bantu.leftNode = predecessor.leftNode;
                        }
                    }
                }
                return true;
            }
        }
    }

    public TreeNode getPredecessor(TreeNode node) {
        TreeNode bantu = node.leftNode;
//        bantu = bantu.leftNode;
        while (bantu.RightNode != null) {
            bantu = bantu.RightNode;
        }
        return bantu;
    }
}
