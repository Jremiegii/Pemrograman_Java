package stack;

import java.util.NoSuchElementException;

public class StackStatis {

    int[] elemen;
    int front = -1;
    int size = 0;

    StackStatis() {

    }

    StackStatis(int ukuran) {

        elemen = new int[ukuran];

    }

    public boolean push(int x) {

        if (size < elemen.length) {
            front++;
            elemen[front] = x;
            size++;
            return true;
        } else {
            return false;
        }
    }

    public int pop() {

        if (!isEmpty()) {
            int hapus = elemen[front];
            front--;
            size--;
            return hapus;
        } else {
            throw new NoSuchElementException();
        }
    }
    
    public int size(){
        
        return size;
        
    }

    public boolean isEmpty() {

        if (front == -1) {
            return true;
        } else {
            return false;
        }
    }
    
    public void Cetak(){
        
        for (int i = 0; i < size; i++) {
            System.out.println(elemen[i]);
        }
        
    }
}
