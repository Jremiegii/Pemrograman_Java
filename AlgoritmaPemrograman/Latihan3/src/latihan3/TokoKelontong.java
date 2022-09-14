package latihan3;

public class TokoKelontong {
    
    public static void main(String[] args){
        
        // Harga diskon 20% dari totoal harga belanja
        int HargaBarang = 5000;
        int JumlahBarang = 2; 
        double Diskon =  2000;
        
        double HargaSebelumDiskon = HargaBarang*JumlahBarang;
        double HargaSetelahDiskon = HargaBarang*JumlahBarang-Diskon;
        
        System.out.println("Harga Barang = " + HargaBarang);
        System.out.println("Jumlah Barang =  " + JumlahBarang);
        System.out.println("Harga sebelum Diskon = " + HargaSebelumDiskon);
        System.out.println("Diskon = " + Diskon);
        System.out.println("Harga Setelah Diskon = " + HargaSetelahDiskon);
        
    }
}
