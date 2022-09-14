package stack;

public class MainDinamis {
    
    public static void main(String[] agrs){
        
        StackDinamis tumpukan = new StackDinamis();

        tumpukan.push(26);
        tumpukan.push(15);
        tumpukan.push(8);
        tumpukan.push(14);
        System.out.println(tumpukan.pop());
        System.out.println(tumpukan.pop());

        tumpukan.Cetak();
        
    }
}
