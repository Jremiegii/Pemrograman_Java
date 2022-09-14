package PratikumSDL;

public class Main {
    
    public static void main(String[] args) {
        
        int[] Data = {5, 8, 26, 15, 11, 31, 7, 40, 23, 25};
        
        System.out.println("Data Sebelum Diurutkan");
        Larik.Cetak(Data);
        System.out.println("\n");
        System.out.println("Data Setelah Diurutkan");
        Larik.SortQiuck(Data);
        Larik.Cetak(Data);
        System.out.println("\n");
        
        Mahasiswa[] USD =  new Mahasiswa[5];
        USD[0] = new Mahasiswa("Egi", 205314062);
        USD[1] = new Mahasiswa("Leon", 20531448);
        USD[2] = new Mahasiswa("Tian", 205314058);
        USD[3] = new Mahasiswa("Junai", 205314051);
        USD[4] = new Mahasiswa("Jeje", 205314068);
        
        System.out.println("Data Sebelum Diurutkan");
        Larik.Cetak(USD);
        Larik.SortQiuck(USD);
        System.out.println("\n");
        Larik.Cetak(USD);
    }
}
