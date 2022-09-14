package ObjectDinamis;

public class Queue {
    
    LinkedList antrian;
    
    
    Queue(){
        
        antrian = new LinkedList();
        
    }
    
    public void enqueue(Object elemen){
        
        antrian.addLast(elemen);
        
    }
    
    public Object dequeue(){
        
        return antrian.removeFirst();
        
    }
    
    public Object size(){
        
        return antrian.size();
        
    }
    
    public boolean isEmpty(){
        
        return antrian.isEmpty();
        
    }
    
}
