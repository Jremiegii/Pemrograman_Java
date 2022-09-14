package PratikumSDL;

public class Main {
    
    public static void main(String[] args) {
        
        Mahasiswa[] USD =  new Mahasiswa[5];
        
        USD[0] = new Mahasiswa("Egi", 205314062);
        USD[1] = new Mahasiswa("Leon", 20531448);
        USD[2] = new Mahasiswa("Tian", 205314058);
        USD[3] = new Mahasiswa("Junai", 205314051);
        USD[4] = new Mahasiswa("Jeje", 205314068);
        
        // Mencetak Data Array
        System.out.println("Data Array Yang Diperoleh : ");
        Larik.Cetak(USD);
        System.out.println();
        
        // Mencetak Method BubleSortAsc
        System.out.println("Data Buble Sort Terkecil Ke Terbesar");
        Larik.BubleSortAsc(USD);
        Larik.Cetak(USD);
        System.out.println();
        
        // Mencetak Method SelectionSortAsc
        System.out.println("Data Selection Sort Terkecil Ke Terbesar");
        Larik.SelectionSortAsc(USD);
        Larik.Cetak(USD);
        System.out.println();
        
        // Mencetak Method InsertionSortAsc
        System.out.println("Data Insertion Sort Terkecil Ke Terbesar");
        Larik.InsertionSortAsc(USD);
        Larik.Cetak(USD);
        System.out.println();
        
        // Mencetak Method BubleSortDesc
        System.out.println("Data Buble Sort Terbesar Ke Terkecil");
        Larik.BubleSortDesc(USD);
        Larik.Cetak(USD);
        System.out.println();
        
        // Mencetak Method SelectionSortDesc
        System.out.println("Data Selection Sort Terbesar Ke Terkecil");
        Larik.SelectionSortDesc(USD);
        Larik.Cetak(USD);
        System.out.println();
        
        // Mencetak Method InsertionSortDesc
        System.out.println("Data Insertion Sort Terbesar Ke Terkecil");
        Larik.InsertionSortDesc(USD);
        Larik.Cetak(USD);
        System.out.println();
        
    }
}
