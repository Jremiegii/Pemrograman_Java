package Stack;

public class ListNode {
    
    char elemen;
    ListNode next;
    ListNode prev;
    
    
    ListNode(){
        
        
        
    }
    
    ListNode(char Elemen){
        
        this.elemen = Elemen;
        
    }
    
    ListNode(char Elemen, ListNode Next, ListNode Prev){
        
        this.elemen = Elemen;
        this.next = Next;
        this.prev = Prev;
        
    }

    public void setElemen(char elemen) {
        this.elemen = elemen;
    }
    
    public char getElemen() {
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
