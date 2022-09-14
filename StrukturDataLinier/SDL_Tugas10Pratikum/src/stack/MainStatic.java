package stack;

public class MainStatic {
    
    public static void main(String[] args) {
        
        StackStatis tumpukan = new StackStatis(7);
        
        tumpukan.push(26);
        tumpukan.push(15);
        tumpukan.push(8);
        tumpukan.push(14);
        System.out.println(tumpukan.pop());
        System.out.println(tumpukan.pop());
        
        tumpukan.Cetak();
        
    }
}
