package PratikumSDL;

public class Main {
    
    public static void main(String[] args) {
        
        LinkedList senarai = new LinkedList();
        
        senarai.addFirst(8);
        senarai.print();
        senarai.addFirst(15);
        senarai.print();
        senarai.addLast(26);
        senarai.print();
        senarai.addLast(14);
        senarai.print();
        senarai.removeLast();
        senarai.print();
        senarai.removeLast();
        senarai.print();
        senarai.revomeFirst();
        senarai.print();
        senarai.revomeFirst();
        senarai.print();
        
    }
}
