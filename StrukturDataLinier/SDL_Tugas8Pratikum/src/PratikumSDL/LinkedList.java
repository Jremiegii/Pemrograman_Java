package PratikumSDL;

public class LinkedList {
    
    private ListNode firstNode;
    private ListNode lastNode;
    private String nama;
    
    
    LinkedList(){
        
        
        
    }
    
    LinkedList(String Nama){
        
        this.nama = Nama;
        
    }
    
    public void addFirst(int x){
        
        ListNode Baru;
        
        if(isEmpty()){
            Baru = new ListNode(x);
            firstNode = Baru;
            lastNode = Baru;
        } else {
            Baru = new ListNode(x);
            Baru.setNext(firstNode);
            firstNode = Baru;
        }
    }
    
    public void addLast(int x){
        
        ListNode Baru;
        
        if(isEmpty()){
            Baru = new ListNode(x);
            firstNode = Baru;
            lastNode = Baru;
        } else{
            Baru = new ListNode(x);
            lastNode.setNext(Baru);
            lastNode = Baru;
        }
    }
    
    public ListNode revomeFirst(){
        
        ListNode Bantu;
        
        if(!isEmpty()){
            if(firstNode == lastNode){
                Bantu = firstNode;
                lastNode = firstNode = null;
                return Bantu;
            } else {
                Bantu = firstNode;
                firstNode = firstNode.getNext();
                return Bantu;
            }
        } else {
            return null;
        }
    }
    
    public ListNode removeLast(){
        
        ListNode Bantu;
        
        if(!isEmpty()){
            if(firstNode == lastNode){
                Bantu = firstNode;
                lastNode = firstNode = null;
                return Bantu;
            } else {
                Bantu = firstNode;
                while(Bantu.getNext() != lastNode){
                    Bantu = Bantu.getNext();
                }
                lastNode = Bantu;
                Bantu = Bantu.getNext();
                lastNode.setNext(null);
                return Bantu;
            }
        } else {
            return null;
        }
    }
    
    public boolean isEmpty(){
        
        if(firstNode ==  null){
            return true;
        } else {
            return false;
        }
    }

    @Override
    public String toString() {
        return "LinkedList{" + "firstNode=" + firstNode + ", lastNode=" + lastNode + ", nama=" + nama + '}';
    }
    
    public void print(){
        
        ListNode Bantu = firstNode;
        
        while(Bantu != null){
            System.out.print(Bantu.getData() + " ");
            Bantu = Bantu.getNext();
        }
        System.out.println(" ");
    }
}
