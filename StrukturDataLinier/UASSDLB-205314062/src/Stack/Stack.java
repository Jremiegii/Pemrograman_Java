package Stack;

public class Stack {
    
    LinkedList tumpukan;
    
    
    Stack(){
        
        tumpukan = new LinkedList();
        
    }
    
    public void push(char elemen){
        
        tumpukan.addFirst(elemen);
        
    }
    
    public char pop(){
        
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
