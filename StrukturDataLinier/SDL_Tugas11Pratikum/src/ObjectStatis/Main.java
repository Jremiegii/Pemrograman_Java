package ObjectStatis;

public class Main {
    
    public static void main(String[] agrs){
        
        Queue tumpukan = new Queue(7);
        Mahasiswa Data;
        
        Data = new Mahasiswa("Egi", 205314062, "Informatika", "Kalbar");
        tumpukan.enqueue(Data);
        Data = new Mahasiswa("Junai", 205314051, "Informatika", "Kalteng");
        tumpukan.enqueue(Data);
        Data = new Mahasiswa("Jeje", 205314059, "Informatika", "Jepara");
        tumpukan.enqueue(Data);
        Data = new Mahasiswa("Cahya", 205314064, "Informatika", "Susel");
        tumpukan.enqueue(Data);
        Data = new Mahasiswa("Tian", 205314058, "Informatika", "Kalbar");
        tumpukan.enqueue(Data);
        
        System.out.println(tumpukan.dequeue());
        System.out.println(tumpukan.dequeue());
        System.out.println(tumpukan.dequeue());
        System.out.println(tumpukan.dequeue());
        System.out.println(tumpukan.dequeue());
        
    }
}
