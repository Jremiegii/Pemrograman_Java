package PratikumSDL;

public class ListNode {
    
    private int data;
    private ListNode next;
    
    
    ListNode(int data){
        
        this.data = data;
        
    }
    
    ListNode(int data, ListNode next){
        
        this.data = data;
        this.next = next;
        
    }
    
    public void setData(int Data){
        
        this.data = Data;
        
    }
    
    public int getData(){
        
        return data;
        
    }
    
    public void setNext(ListNode Next){
        
        this.next = Next;
        
    }
    
    public ListNode getNext(){
        
        return next;
        
    }
}
