package ObjectStatis;

import java.util.NoSuchElementException;

public class Queue {
    
    Object[] elemen;
    int front = 0;
    int rear = 0;
    int size = 0;
    
    
    Queue() {
        
        
        
    }
    
    Queue(int ukuran){
        
        elemen = new Object[ukuran];
        
    }
    
    public Object enqueue(Object elemen){
        
        if(size < this.elemen.length){
            this.elemen[rear] = elemen;
            if(rear == this.elemen.length - 1){
                rear = 0;
            } else {
                rear++;
                size++;
            }
            return true;
        } else {
            return false;
        }
    }
    
    public Object dequeue(){
        
        if(!isEmpty()){
            Object hapus = elemen[front];
            if(front == elemen.length - 1){
                front = 0;
            } else {
                front++;
                size--;
                return hapus;
            }
        } else {
           throw new NoSuchElementException();
        }
        return 0;
    }
    
    public Object size(){
        
        return size;
        
    }
    
    public boolean isEmpty(){
        
        if(size == 0){
            return true;
        } else {
            return false;
        }
    }
}
