package QueueDinamis;

public class Queue {
    
    LinkedList antrian;
    
    
    Queue(){
        
        antrian = new LinkedList();
        
    }
    
    public void enqueue(int elemen){
        
        antrian.addLast(elemen);
        
    }
    
    public int dequeue(){
        
        return antrian.removeFirst();
        
    }
    
    public int size(){
        
        return antrian.size();
        
    }
    
    public boolean isEmpty(){
        
        return antrian.isEmpty();
        
    }
    
}
