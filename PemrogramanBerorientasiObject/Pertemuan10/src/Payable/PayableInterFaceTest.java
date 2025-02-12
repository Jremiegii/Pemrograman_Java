package Payable;

public class PayableInterFaceTest {

    public static void main(String args[]) {
        
        // create four-element Payable array
        Payable payableObjects[] = new Payable[4];
        
        // populate array with objects that implement Payable
        payableObjects[0] = new Invoice("01234", "seat", 2, 375.00);
        payableObjects[1] = new Invoice("56789", "tire", 4, 79.95);
        payableObjects[2]
                = new SalariedEmployee("John", "Smith", "111-11-1111", 800.00);
        payableObjects[3]
                = new SalariedEmployee("Lisa", "Barnes", "888-88-8888", 1200.00);
        System.out.println(
                "Invoices and Employees processed polymorphically:\n");
        
        // generically process each element in array payableObjects
        for (int i = 0; i < payableObjects.length; i++) {
            System.out.printf("%s \n%s: $%,.2f\n\n", payableObjects[i].toString(),
                    "payment due", payableObjects[i].getPaymentAmount());
        } // end for
    } // end main
}
