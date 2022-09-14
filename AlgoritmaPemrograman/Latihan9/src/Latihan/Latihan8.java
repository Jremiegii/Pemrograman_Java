package Latihan;

public class Latihan8 {
    
    public static void main(String[] args) {
        int[] A = {2, 7, 3, 9, 4, 1, 34, 25, 76, 80, 90, 54, 21, 78};
        int i, indeks;
        for (i = 0; i <= A.length; i++) {
            indeks = A[i]; 
            if (indeks == 34) {
                System.out.println("Berada Pada Indeks Ke " + i);
                break;
            }
        }
    }
}
