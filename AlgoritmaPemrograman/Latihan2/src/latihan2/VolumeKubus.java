package latihan2;

import java.util.Scanner;

public class VolumeKubus {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int Sisi;
        int Volume;
        
        System.out.print("Sisi Kubus = ");
        Sisi = in.nextInt();
        
        Volume = Sisi*Sisi*Sisi;
        System.out.println("Volume Kubus = " + Volume) ;
    }
    
}
