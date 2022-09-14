package sdl_tugas2;

public class Larik {
    
    
    public static void Cetak(int[] data){
        System.out.print("Data Array = ");
        for(int i = 0; i < data.length; i++){
            System.out.print(data[i] + " ");
        }
    }
    
     public static void Mahasiswa(Object[] Pelajar){
        System.out.println("Data Mahasiswa");
        for(int i = 0; i < Pelajar.length; i++){
            System.out.println(Pelajar[i] + " ");
        }
    }
}

