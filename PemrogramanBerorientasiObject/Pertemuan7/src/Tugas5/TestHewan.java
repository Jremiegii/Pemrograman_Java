package Tugas5;

public class TestHewan {
    
    public static void main(String[] agrs){
        
        Hewan h1 = new Hewan(4, "Apapun");
        Karnivora h2 = new Karnivora(4, "Daging");
        
        System.out.println("Hewan 1 berkaki " + h1.kaki + " memakan " + h1.makanan);
        System.out.println("Hewan 2 berkaki " + h2.kaki + " memakan " + h2.makanan);
    }
}
