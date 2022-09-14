package latihan3;

import java.util.Scanner;

public class KelilingDanLuasSembarangSegitiga {
    
    public static void main(String[] args){
        
        Scanner SembarangSegitiga = new Scanner(System.in);
        
        double X1, X2, X3;
        double Y1, Y2, Y3;
        double AB, BC, AC;
        double Keliling;
        double SetengahKeliling;
        double Luas;
        
        System.out.println("Memasukan Titik Kordinat A (X,Y)");
        System.out.print("Titik Kordinat X = ");
        X1 = SembarangSegitiga.nextDouble();
        System.out.print("Titik Kordinat Y = ");
        Y1 = SembarangSegitiga.nextDouble();
        
        System.out.println("Memasukan Titik Kordinat B (X,Y)");
        System.out.print("Titik Kordinat X = ");
        X2 = SembarangSegitiga.nextDouble();
        System.out.print("masukan Kordinat Y = ");
        Y2 = SembarangSegitiga.nextDouble();
        
        System.out.println("Memasukan Titik Kordinat C (X,Y)");
        System.out.print("Titik Kordinat X = ");
        X3 = SembarangSegitiga.nextDouble();
        System.out.print("Titik Kordinat Y = ");
        Y3 = SembarangSegitiga.nextDouble();
        
        AB = Math.sqrt(((X2-X1)*(X2-X1)+(Y2-Y1)*(Y2-Y1)));
        BC = Math.sqrt(((X3-X2)*(X3-X2)+(Y3-Y3)*(Y3-Y2)));
        AC = Math.sqrt(((X3-X1)*(X3-X1)+(Y3-Y1)*(Y3-Y1)));
        
        System.out.println("Jarak Titik AB = " + AB);
        System.out.println("Jarak Titik BC = " + BC);
        System.out.println("Jarak Titik AC = " + AC);
        
        Keliling = AB + BC + AC;
        System.out.println("Keliling Segitiga = " + Keliling);
        
        SetengahKeliling = Keliling*1/2;
        System.out.println("Kelilng Setengah segitiga = " + SetengahKeliling);
        
        Luas = Math.sqrt((SetengahKeliling*(SetengahKeliling-AB)*(SetengahKeliling-BC)*(SetengahKeliling*AC)));
        System.out.println("Luas Segitiga = " + Luas);
      
    }
}
