package PratikumSDL;

public class Main {
    
    public static void main(String[] args) {
        
        LinkedList senarai = new LinkedList();
        
        senarai.addFirst(8);
        System.out.print(senarai.toString());
        senarai.addFirst(15);
        System.out.println(senarai.toString());
        senarai.addLast(26);
        System.out.println(senarai.toString());
        senarai.addLast(14);
        System.out.println(senarai.toString());
        
//        ListNode cari = senarai.search(27);
//        if(cari != null){
//            System.out.println("Data Ditemukan");
//        } else {
//            System.out.println("Data Tidak Ditemukan");
//        }
        
        ListNode cari = senarai.search(26);
        if(cari != null){
            System.out.println("Data Ditemukan");
        } else {
            System.out.println("Data Tidak Ditemukan");
        }
        
        senarai.removeLast();
        System.out.println(senarai.toString());
        senarai.removeLast();
        System.out.println(senarai.toString());
        senarai.removeFirst();
        System.out.println(senarai.toString());
        senarai.removeFirst();
        System.out.println(senarai.toString());
        
    }
}
