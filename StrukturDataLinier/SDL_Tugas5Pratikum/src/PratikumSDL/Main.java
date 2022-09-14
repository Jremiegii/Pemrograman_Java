package PratikumSDL;

public class Main {
    
    public static void main(String[] args) {
        
        int[] Data = {5, 8, 26, 15, 11, 31};
        
//         Mencetak method BubleSortAsc()
        System.out.println("Data Buble Sort Terkecil Ke Terbesar");
        Larik.Cetak(Data);
        Larik.BubleSortAsc(Data);
        System.out.println();
        System.out.println("Data Terurut : ");
        Larik.Cetak(Data);
        System.out.println();
        
//         Mencetak method BubleSortDesc()
        System.out.println("Data Buble Sort Terbesar Ke Terkecil");
        Larik.Cetak(Data);
        Larik.BubleSortDesc(Data);
        System.out.println();
        System.out.println("Data Terurut : ");
        Larik.Cetak(Data);
        System.out.println();
        
//         Mencetak method SelectionSortAsc()
        System.out.println("Data Selection Sort Terkecil Ke Terbesar");
        Larik.Cetak(Data);
        Larik.SelectionSortAsc(Data);
        System.out.println();
        System.out.println("Data Terurut : ");
        Larik.Cetak(Data);
        System.out.println();
        
//         Mencetak method SelectionSortDesc()
        System.out.println("Data Selection Sort Terbesar Ke Terkecil");
        Larik.Cetak(Data);
        Larik.SelectionSortDesc(Data);
        System.out.println();
        System.out.println("Data Terurut : ");
        Larik.Cetak(Data);
        System.out.println();
        
//         Mencetak method InsertionSortAsc()
        System.out.println("Data Insertion Sort Terkecil Ke Terbesar");
        Larik.Cetak(Data);
        Larik.InsertionSortAsc(Data);
        System.out.println();
        System.out.println("Data Terurut : ");
        Larik.Cetak(Data);
        System.out.println();
        
//         Mencetak method InsertionSortDesc()
        System.out.println("Data Insertion Sort Terbesar Ke Terkecil");
        Larik.Cetak(Data);
        Larik.InsertionSortDesc(Data);
        System.out.println();
        System.out.println("Data Terurut : ");
        Larik.Cetak(Data);
        System.out.println();
        
        System.out.println();
        
        int N = 10000;
        int[] DataAcak = new int[N];
        
        for(int i = 0; i < DataAcak.length; i++){
            DataAcak[i] = (int)(Math.random()*100);
        }
        
//         sebelum pengurutan
        long x = System.nanoTime();
        System.out.println(x);
        
//        sesudah pengurutan
        Larik.InsertionSortDesc(DataAcak);
        long y = System.nanoTime();
        System.out.println(y);
        
        
        long Banding = y-x;
        System.out.println("Waktu = "+ Banding);
        
    }
}
