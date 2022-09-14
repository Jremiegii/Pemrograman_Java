package ProjectKelompok;

public class Queue<E> {
    
    LinkedList antrian;
    
    
    Queue(){
        
        antrian = new LinkedList();
        
    }
    
    public void enqueue(E elemen){
        
        antrian.addLast(elemen);
        
    }
    
    public E dequeue(){
        
        return (E)antrian.removeFirst();
        
    }
    
    public int size(){
        
        return antrian.size();
        
    }
    
    public boolean isEmpty(){
        
        return antrian.isEmpty();
        
    }
    
    public ListNode Search(E e){
        
        return antrian.search(e);
        
    }
    
    public String toString(){
        
        return antrian.toString();
        
    }
}
