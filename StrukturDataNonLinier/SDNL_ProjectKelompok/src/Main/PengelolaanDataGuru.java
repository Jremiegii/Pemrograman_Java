package Main;

import BST.DataGuru;
import BST.Tree;
import BST.TreeNode;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class PengelolaanDataGuru {

    public static void main(String[] args) throws ClassNotFoundException {
        Scanner input = new Scanner(System.in);

        String NIP = null, Nama, Umur = null, JenisKelamin, Mengajar, username, pass;
        int pilih = 0;

        boolean ulang = true;
        DataGuru data = new DataGuru("53074010", "Fransiskus Jremiegi", "34", "Laki - Laki", "Biologi");
        TreeNode node = new TreeNode(data);
        Tree pohon = new Tree(node);
        DataGuru data1 = new DataGuru("53074011", "Mahesa", "30", "Laki - Laki", "Fisika");
        pohon.insertNode(data1);
        DataGuru data2 = new DataGuru("53074019", "Lala Simanjuntak", "40", "Perempuan", "Matematika Wajib");
        pohon.insertNode(data2);

        do {
            System.out.println("------------------");
            System.out.println("Masukan Data Admin");
            System.out.println("------------------");
            System.out.print("Username : ");
            username = input.next();
            System.out.print("Password : ");
            pass = input.next();
            if (!username.equalsIgnoreCase("MarcelSali") && !pass.equalsIgnoreCase("205314042")) {
                System.out.println("Username dan Password Salah");
            } else {
                while (ulang) {
                    if (username.equalsIgnoreCase("MarcelSali") && pass.equalsIgnoreCase("205314042")) {
                        System.out.println("===============================");
                        System.out.println("     PENGELOLAAN DATA GURU     ");
                        System.out.println("===============================");
                        System.out.println(" Pilihlah Menu Yang Diinginkan ");
                        System.out.println(" 1. Tambah Data Guru      ");
                        System.out.println(" 2. Cari Data Guru        ");
                        System.out.println(" 3. Edit Data Guru        ");
                        System.out.println(" 4. Menampilkan Data Guru ");
                        System.out.println(" 5. Menghapus Data Guru   ");
                        System.out.println(" 6. Keluar Program        ");
                        System.out.println("-------------------------------");
                        System.out.print("Silahkan Masukan Pilihan Anda : ");
                        pilih = input.nextInt();
                        if (pilih == 1) {
                            while (ulang) {
                                try {
                                    System.out.print("NIP           : ");
                                    NIP = input.next();
                                    int NIP1 = Integer.parseInt(NIP);
                                    break;
                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(null, "NIP Yang Diinputkan Harus Angka", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                            System.out.print("Nama          : ");
                            Nama = input.next();
                            while (ulang) {
                                try {
                                    System.out.print("Umur          : ");
                                    Umur = input.next();
                                    int Umur1 = Integer.parseInt(Umur);
                                    break;
                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(null, "NIP Yang Diinputkan Harus Angka", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                            System.out.print("Jenis Kelamin : ");
                            JenisKelamin = input.next();
                            System.out.print("Mengajar      : ");
                            Mengajar = input.next();
                            pohon.insertNode(new DataGuru(NIP, Nama, Umur, JenisKelamin, Mengajar));
                            JOptionPane.showMessageDialog(null, "PEGAWAI DENGAN : \n\nNIP                     : " + NIP
                                    + "\nNama                : " + Nama
                                    + "\nUmur                 : " + Umur
                                    + "\nJenis Kelamin : " + JenisKelamin
                                    + "\nMengajar          : " + Mengajar
                                    + "\n\nTelah Dimasukan Kedalam Daftar Guru");

                            System.out.println("");
                        }

                        if (pilih == 2) {
                            while (ulang) {
                                try {
                                    System.out.print("NIP : ");
                                    NIP = input.next();
                                    int NIP1 = Integer.parseInt(NIP);
                                    break;
                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(null, "NIP Yang Diinputkan Harus Angka", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                            DataGuru guru1 = new DataGuru(NIP);
                            if (pohon.search(guru1) == null) {
                                JOptionPane.showMessageDialog(null, "Data Guru Tidak Terdaftar");
                            } else {
                                JOptionPane.showMessageDialog(null, "Data Guru Terdaftar");
                            }
                        }

                        if (pilih == 3) {
                            while (ulang) {
                                try {
                                    System.out.print("NIP : ");
                                    NIP = input.next();
                                    int NIP1 = Integer.parseInt(NIP);
                                    break;
                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(null, "NIP Yang Diinputkan Harus Angka", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                            DataGuru guru = new DataGuru(NIP);
                            TreeNode hasilPencarian = pohon.search(guru);
                            if (hasilPencarian == null) {
                                JOptionPane.showMessageDialog(null, "Data Guru Tidak Terdaftar");
                            } else {
                                System.out.print("Nama          : ");
                                Nama = input.next();
                                System.out.print("Umur          : ");
                                Umur = input.next();
                                System.out.print("Jenis Kelamin : ");
                                JenisKelamin = input.next();
                                System.out.print("Mengajar      : ");
                                Mengajar = input.next();
                                guru.setNama(Nama);
                                guru.setUmur(Umur);
                                guru.setJenisKelamin(JenisKelamin);
                                guru.setMengajar(Mengajar);
                                hasilPencarian.setData(guru);
                                JOptionPane.showMessageDialog(null, "Data Guru Berhasil Diupdate");
                            }
                        }

                        if (pilih == 4) {
                            System.out.println("===========================================");
                            System.out.println("              DATA PEGAWAI                 ");
                            System.out.println("===========================================");
                            System.out.println("NIP \t|Nama \t|Umur \t|JenisKelamin \t|Mengajar ");
                            System.out.println(pohon.print());
                            System.out.println("===========================================");
                            System.out.println("\n");
                        }

                        if (pilih == 5) {
                            while (ulang) {
                                try {
                                    System.out.print("NIP : ");
                                    NIP = input.next();
                                    int NIP1 = Integer.parseInt(NIP);
                                    break;
                                } catch (Exception e) {
                                    JOptionPane.showMessageDialog(null, "NIP Yang Diinputkan Harus Angka", "Error", JOptionPane.ERROR_MESSAGE);
                                }
                            }
                            DataGuru guru2 = new DataGuru(NIP);
                            if (pohon.search(guru2) == null) {
                                JOptionPane.showMessageDialog(null, "Data Guru Tidak Terdaftar");
                            } else {
                                boolean temp = pohon.delete012(guru2);
                                JOptionPane.showMessageDialog(null, "Data Guru Dengan NIP Yang Diinput Telah Dihapus");
                            }
                        }

                        if (pilih == 6) {
                            JOptionPane.showMessageDialog(null, "TerimaKasih Telah Menggunakan Sistem Ini");
                            JOptionPane.showMessageDialog(null, "Data Telah Tersimpan di Folder Sistem");
                            try {
                                PrintWriter print = new PrintWriter("DataGuru.txt");
                                print.write("------DATA GURU------\n");
                                print.println(pohon.print());
                                print.close();
                            } catch (IOException e) {
                                System.out.println("Error : " + e.getMessage());
                            }
                            ulang = false;
                        }

                    }
                }
            }
        } while (ulang);
    }

}
