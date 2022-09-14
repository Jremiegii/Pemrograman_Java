package stack;

public class StackDinamis {
    
    LinkedList tumpukan;
    
    
    StackDinamis(){
        
        tumpukan = new LinkedList();
        
    }
    
    public void push(int elemen){
        
        tumpukan.addFirst(elemen);
        
    }
    
    public int pop(){
        
        return tumpukan.removeFirst();
        
    }
    
    public int size(){
        
        return tumpukan.size();
        
    }
    
    public boolean isEmpty(){
        
        return tumpukan.isEmpty();
        
    }
    
    public void Cetak(){
        
        System.out.println(tumpukan.toString());
        
    }
}
