package ProjectKelompok;

public class ListNode<E> {
    
    E elemen;
    ListNode next;
    ListNode prev;
    
    
    ListNode(){
        
        
        
    }
    
    ListNode(E Elemen){
        
        this.elemen = Elemen;
        
    }
    
    ListNode(E Elemen, ListNode Next, ListNode Prev){
        
        this.elemen = Elemen;
        this.next = Next;
        this.prev = Prev;
        
    }

    public void setElemen(E elemen) {
        this.elemen = elemen;
    }
    
    public E getElemen() {
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
