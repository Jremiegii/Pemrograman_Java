package Stack;

public class Main {

    public static void main(String[] args) {

        Stack Data = new Stack();

        String aku = "Fransiskus Jremiegi Saputra";

        for (int i = 0; i < aku.length(); i++) {
            Data.push(aku.charAt(i));
        }

        System.out.println("Input = " + aku);
        System.out.print("Output = ");

        for (int i = 0; i < aku.length(); i++) {
            System.out.print(Data.pop());
        }

        System.out.println();

    }
}
