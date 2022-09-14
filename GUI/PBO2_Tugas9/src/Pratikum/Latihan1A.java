package Pratikum;

import java.io.File;

public class Latihan1A {

    public static void main(String[] args) {

        File file = new File("sample.txt");
        if (!file.exists()) {
            System.out.println("Maaf file tidak ditemukan");
        } else {
            System.out.println("File ditemukan");
        }

    }
}
