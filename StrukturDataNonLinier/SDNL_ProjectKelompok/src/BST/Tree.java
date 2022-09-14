package BST;

import java.util.ArrayList;

public class Tree {

    private TreeNode root;
    StringBuffer cetak = new StringBuffer();

    public Tree(TreeNode root) {
        this.root = root;
    }

    public void insertNode(DataGuru data) {
        TreeNode baru = new TreeNode(data);
        if (root == null) {
            root = baru;
        } else {
            TreeNode bantu = root;
            while (true) {
                if (((Comparable) bantu.getData()).compareTo(data) <= 0) {
                    if (bantu.getRightNode() == null) {
                        bantu.setRightNode(baru);
                        baru.setParent(bantu);
//                        System.out.println("Berhasil Menginputkan Data " + baru.getData());
                        return;
                    } else {
                        bantu = bantu.getRightNode();
                    }

                } else {
                    if (bantu.getLeftNode() == null) {
                        bantu.setLeftNode(baru);
                        baru.setParent(bantu);
//                        System.out.println("Berhasil Menginputkan Data " + baru.getData());
                        return;
                    } else {
                        bantu = bantu.getLeftNode();
                    }
                }
            }
        }
    }

    public TreeNode search(DataGuru search) {
        TreeNode cari = root;
        while (cari != null) {
            if (((Comparable) search).compareTo(cari.getData()) == 0) {
                return cari;
            } else if (((Comparable) cari.getData()).compareTo(search) <= 0) {
                cari = cari.getRightNode();

            } else {
                cari = cari.getLeftNode();
            }
        }
        return null;
    }

    public String print() {        
        printHelper(root);     
        StringBuffer temp = new StringBuffer();
        temp.append(cetak);
        cetak.setLength(0);
        return temp.toString();
    }

    private void printHelper(TreeNode data) {
        if (data == null) {
            return;
        }
        printHelper(data.getLeftNode());
        cetak.append(data.getData().toString());
        printHelper(data.getRightNode());
    }

    public boolean delete012(DataGuru data) {
        TreeNode node = search(data);
        TreeNode parent = node.getParent();
//        TreeNode current = root;
        boolean cek = false;
        if (node != null) {
            if (node.getLeftNode() == null && node.getRightNode() == null) {
                if (parent.getLeftNode() == node) {
                    parent.setLeftNode(null);
                    node.setParent(null);
                } else {
                    parent.setRightNode(null);
                    node.setParent(null);
                }
                cek = true;
            } else if (node.getLeftNode() == null || node.getRightNode() == null) {
                if (parent == null) {
                    if (node.getLeftNode() == null) {
                        setRoot(node.getRightNode());
                        getRoot().setLeftNode(node.getLeftNode());
                    } else {
                        setRoot(node.getLeftNode());
                        getRoot().setRightNode(node.getRightNode());
                    }
                    getRoot().setParent(null);
                }
                else if (parent.getLeftNode() == node) {
                    if (node.getLeftNode() == null) {
                        parent.setLeftNode(node.getRightNode());
                        node.getRightNode().setParent(parent);
                        node.setRightNode(null);
                        node.setParent(null);
                    } else {
                        parent.setLeftNode(node.getLeftNode());
                        node.getLeftNode().setParent(parent);
                        node.setLeftNode(null);
                        node.setParent(null);
                    }
                    cek = true;
                } else {
                    if (parent.getRightNode() == node) {
                        if (node.getRightNode() == null) {
                            parent.setRightNode(node.getLeftNode());
                            node.getLeftNode().setParent(parent);
                            node.setRightNode(null);
                            node.setParent(null);
                        } else {
                            parent.setRightNode(node.getRightNode());
                            node.getRightNode().setParent(parent);
                            node.setLeftNode(null);
                            node.setParent(null);
                        }
                        cek = true;
                    }
                }

            } else {
//                TreeNode parent = node.getParent();
                TreeNode sucessor = getSucessor(node);
                DataGuru temp;
                if (sucessor != null) {// cek Sucessor
                    if (sucessor.getRightNode() == null) {
                        if (sucessor.getParent() != node) {
                            sucessor.getParent().setLeftNode(null);
                        } else {
                            node.setRightNode(null);
                        }
                    } else {
                        if (sucessor.getParent() != node) {
                            sucessor.getParent().setLeftNode(sucessor.getRightNode());
                            sucessor.getRightNode().setParent(sucessor.getParent());
                        }
                    }
                    temp = sucessor.getData();
                    sucessor = node;
                    sucessor.setData(temp);
                    return true;
                } else {
                    return false;
                }
            }

        }
        return cek;

    }

    public TreeNode getSucessor(TreeNode data) {
        TreeNode bantu = data.getRightNode();
        while (bantu.getLeftNode() != null) {
            bantu = bantu.getLeftNode();
        }
        return bantu;
    }
    
    public TreeNode getRoot() {
        return root;
    }

    public void setRoot(TreeNode root) {
        this.root = root;
    }
}
