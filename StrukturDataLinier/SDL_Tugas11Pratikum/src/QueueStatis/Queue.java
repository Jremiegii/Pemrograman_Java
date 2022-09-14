package QueueStatis;

import java.util.NoSuchElementException;

public class Queue {
    
    int[] elemen;
    int front = 0;
    int rear = 0;
    int size = 0;
    
    
    Queue() {
        
        
        
    }
    
    Queue(int ukuran){
        
        elemen = new int[ukuran];
        
    }
    
    public boolean enqueue(int elemen){
        
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
    
    public int dequeue(){
        
        if(!isEmpty()){
            int hapus = elemen[front];
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
        return -1;
    }
    
    public int size(){
        
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
