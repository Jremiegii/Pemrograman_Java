package latihan3;

import java.util.Scanner;

public class MenghitungResistor {
    
    public static void main(String[] args){
        
        Scanner Resistor = new Scanner(System.in);
                
        double Resistor1;
        double Resistor2;
        double Resistor3;
        double ResistorTotal;
        
        System.out.print("Resistor 1 = ");
        Resistor1 = Resistor.nextDouble();
        System.out.print("Resistor 2 = ");
        Resistor2 = Resistor.nextDouble();
        System.out.print("Resistor 3 = ");
        Resistor3 = Resistor.nextDouble();
        
        ResistorTotal = 1/(1/Resistor1+1/Resistor2+1/Resistor3);
        
        System.out.println("Resistor Total = " + ResistorTotal);
    }
}
