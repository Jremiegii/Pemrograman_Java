package ujicoba2;

public class Bintang {
    
    public static void main(String[] args){
        
        // menulis bintang (*) memakali metode
        
        bintang (5); // bintang 5
        bintang (7); // bintang 7
        bintang (10); // bintang 10
    }
    static void bintang (int n) {
        System.out.println(n + " bintang :");
        for(int i = 1; i <= n; i++) System.out.print("*");
            System.out.println("");
    } 
}
