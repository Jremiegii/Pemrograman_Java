package ProjectKelompok;

public class LinkedList<E> {

    private ListNode head;
    private int size;

    public LinkedList() {
        
        head = new ListNode();
        head.next = head;
        head.prev= head;
        size = 0;
        
    }

    public void addBefore(E x, ListNode Bantu) {
        
        ListNode baru = new ListNode(x);
        baru.next = Bantu;
        baru.prev = Bantu.prev;
        Bantu.prev.next = baru;
        Bantu.prev = baru;
        size++;
        
    }

    public E remove(ListNode Bantu) {
        
        Bantu.prev.next = Bantu.next;
        Bantu.next.prev = Bantu.prev;
        size--;
        return (E)Bantu.getElemen();
        
    }

    public void addFirst(E x) {
        
        addBefore(x, head.next);
        
    }

    public void addLast(E x) {
        
        addBefore(x, head);
        
    }

    public E removeFirst() {
        
        return remove(head.next);
        
    }

    public E removeLast() {
        
        return remove(head.prev);
        
    }

    public boolean isEmpty() {
        
        if (head == head.next) {
            return true;
        } else {
            return false;
        }
    }
    
    public ListNode search(E Cari){
        
        ListNode Bantu = head.next;
        
        while(Bantu != head){
            if(((Comparable)Cari).compareTo(Bantu.elemen) == 0){
                return Bantu;
            }
            Bantu = Bantu.next;
        }
        return null;
    }
    
    public int size(){
        
        return size;
        
    }
    
    @Override
    public String toString() {
        
        String temp = " ";
        
        ListNode Bantu = head.next;
        while (Bantu != head) {
            temp = temp + Bantu.elemen + " ";
            Bantu = Bantu.next;
        }
        return temp;
    }
}
