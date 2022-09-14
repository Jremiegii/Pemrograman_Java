package QueueDinamis;

public class Main {
    
    public static void main(String[] agrs){
        
        Queue tumpukan = new Queue();
        
        
        tumpukan.enqueue(26);
        tumpukan.enqueue(15);
        tumpukan.enqueue(8);
        tumpukan.enqueue(14);
        System.out.println(tumpukan.dequeue());
        System.out.println(tumpukan.dequeue());
        System.out.println(tumpukan.dequeue());
        System.out.println(tumpukan.dequeue());
        
    }
}
