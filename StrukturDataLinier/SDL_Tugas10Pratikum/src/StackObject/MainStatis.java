package StackObject;

public class MainStatis {
    
    public static void main(String[] agrs){
        
        StackStatis Tumpukan = new StackStatis(7);
        Mahasiswa Data;
        
        Data = new Mahasiswa("Egi", 205314062, "Informatika", "Kalbar");
        Tumpukan.push(Data);
        Data = new Mahasiswa("Junai", 205314051, "Informatika", "Kalteng");
        Tumpukan.push(Data);
        Data = new Mahasiswa("Jeje", 205314059, "Informatika", "Jepara");
        Tumpukan.push(Data);
        Data = new Mahasiswa("Cahya", 205314064, "Informatika", "Susel");
        Tumpukan.push(Data);
        Data = new Mahasiswa("Tian", 205314058, "Informatika", "Kalbar");
        Tumpukan.push(Data);
        
        System.out.println(Tumpukan.pop());
        System.out.println(Tumpukan.pop());
        System.out.println(Tumpukan.pop());
        
        Tumpukan.Cetak();
        
    }
}
