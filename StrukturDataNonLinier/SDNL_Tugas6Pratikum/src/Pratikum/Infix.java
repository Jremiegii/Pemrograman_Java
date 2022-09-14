package Pratikum;

public class Infix {

    char ung[];
    KonstantaInfix karInfix = new KonstantaInfix();
    StackTree opr;
    StackTree opd;

    public Infix(char in[]) {
        ung = in;
    }

    public int valensi(char in) {
        if (in == '^') {
            return 3;
        } else if ((in == '*') || (in == '/')) {
            return 2;
        } else if ((in == '+') || (in == '-')) {
            return 1;
        } else if (in == '(') {
            return 0;
        } else {
            return -1;
        }
    }

    public TreeNode gabung() {
        TreeNode pohon = opr.pop();
        pohon.rightNode = opd.pop();
        pohon.leftNode = opd.pop();
        return pohon;
    }

    public TreeNode buatPohon() {
        char kar;
        TreeNode treeKar;
        TreeNode cek;
        opr = new StackTree();
        opd = new StackTree();
        for (int i = 0; i < ung.length; i++) {
            kar = ung[i];
            karInfix.setData(kar);
            if (kar != ' ') {
                treeKar = new TreeNode(kar);
                if (kar == '(') {
                    opr.push(treeKar);
                } else if (kar == ')') {
                    cek = opr.pop();
                    opr.push(cek);
                    while (cek.data != '(') {
                        opd.push(gabung());
                        cek = opr.pop();
                        opr.push(cek);
                    }
                    opr.pop();
                } else if (karInfix.isOperator()) {
                    cek = opr.pop();
                    opr.push(cek);
                    while ((cek != null) && (valensi(kar) <= valensi(cek.data))) {
                        opd.push(gabung());
                        cek = opr.pop();
                        opr.push(cek);
                    }
                    opr.push(treeKar);
                } else if (karInfix.isOperand()) {
                    opd.push(treeKar);
                } else {
                    return null;
                }
            }
        }
        cek = opr.pop();
        opr.push(cek); 
        while (cek != null) {
            opd.push(gabung());
            cek = opr.pop();
            opr.push(cek);
        }
        cek = opd.pop();
        opr = null;
        opd = null;
        return cek;

    }
}
