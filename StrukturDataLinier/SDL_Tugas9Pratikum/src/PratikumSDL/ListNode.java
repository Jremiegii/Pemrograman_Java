package PratikumSDL;

public class ListNode {
    
    int elemen;
    ListNode next;
    ListNode prev;
    
    
    ListNode(){
        
        
        
    }
    
    ListNode(int Elemen){
        
        this.elemen = Elemen;
        
    }
    
    ListNode(int Elemen, ListNode Next, ListNode Prev){
        
        this.elemen = Elemen;
        this.next = Next;
        this.prev = Prev;
        
    }

    public void setElemen(int elemen) {
        this.elemen = elemen;
    }
    
    public int getElemen() {
        return elemen;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    public ListNode getNext() {
        return next;
    }

    public void setPrev(ListNode prev) {
        this.prev = prev;
    }

    public ListNode getPrev() {
        return prev;
    }
}
