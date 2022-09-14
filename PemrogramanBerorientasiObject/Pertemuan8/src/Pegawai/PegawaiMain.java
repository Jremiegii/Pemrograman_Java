package Pegawai;

import java.util.Scanner;

public class PegawaiMain {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        
        String nama;
        int jumAnk, jamkerja, golongan, status, banyak, bonus, transport, tunjanganjbt, 
                Manager = 0, Marketing = 0, Umum = 0;

        System.out.print("Masukan Total Jumlah Pegawai = ");
        banyak = in.nextInt();
        Pegawai[] Anggota = new Pegawai[banyak];
        for (int i = 0; i < Anggota.length; i++) {
            System.out.println("\nJenis Status Posisi Anda : ");
            System.out.println("1. Manager");
            System.out.println("2. Marketing");
            System.out.println("3. Umum");
            System.out.print("Masukan Jawaban Anda = ");
            status = in.nextInt();
            System.out.print("Masukkan Nama Pegawai Anda = ");
            nama = in.next();
            System.out.print("Masukkan Jumlah Anak Anda = ");
            jumAnk = in.nextInt();
            System.out.print("Masukkan Jam Kerja Anda = ");
            jamkerja = in.nextInt();
            System.out.print("Masukkan Jenis Golongan Anda = ");
            golongan = in.nextInt();
            while (golongan > 3 || golongan == 0) {
                System.out.println("Maaf, Jawaban Anda Salah !");
                System.out.print("Masukan Kembali Jawaban Anda = ");
                golongan = in.nextInt();
            }
            if (status == 1) {
                Anggota[i] = new Manager();
                Anggota[i].setNama(nama);
                Anggota[i].setJumlahAnak(jumAnk);
                Anggota[i].setGolongan(golongan);
                Anggota[i].setJamKerja(jamkerja);
                System.out.print("Masukkan Tunjangan Jabatan = ");
                tunjanganjbt = in.nextInt();
                ((Manager) Anggota[i]).setTunjanganJabatan(tunjanganjbt);
            } else if (status == 2) {
                Anggota[i] = new Marketing();
                Anggota[i].setNama(nama);
                Anggota[i].setJumlahAnak(jumAnk);
                Anggota[i].setGolongan(golongan);
                Anggota[i].setJamKerja(jamkerja);
                System.out.print("Masukkan Bonus = ");
                bonus = in.nextInt();
                ((Marketing) Anggota[i]).setBonus(bonus);
                Marketing++;
            } else if (status == 3) {
                Anggota[i] = new Umum();
                Anggota[i].setNama(nama);
                Anggota[i].setJumlahAnak(jumAnk);
                Anggota[i].setGolongan(golongan);
                Anggota[i].setJamKerja(jamkerja);

                System.out.print("Masukkan Tunjangan Transport = ");
                transport = in.nextInt();
                ((Umum) Anggota[i]).setTunjanganTransport(transport);

            }
        }
        
        System.out.println("==============================================");
        System.out.println("---------------- Data Pegawai ----------------");
        System.out.println("==============================================");
        for (int i = 0; i < Anggota.length; i++) {
            System.out.println("\n================ Slip Gaji ================");
            System.out.println("Pegawai Ke-" + (i + 1));
            System.out.println("Nama = " + Anggota[i].getNama());
            System.out.println("Status = " + Anggota[i].getClass().getSimpleName());
            System.out.println("Gaji Pokok Rp. " + Anggota[i].getGajipokok());
            System.out.println("Gaji Lembur Rp. " + Anggota[i].getGajilembur());
            System.out.println("Tunjangan Anak Rp. " + Anggota[i].getTunjKelu());
            if (Anggota[i] instanceof Manager) {
                System.out.println("Tunjangan Jabatan Rp. " + ((Manager) Anggota[i]).getTunjanganJabatan());
            } else if (Anggota[i] instanceof Marketing) {
                System.out.println("Bonus Rp. " + ((Marketing) Anggota[i]).getBonus());
            } else if (Anggota[i] instanceof Umum) {
                System.out.println("Tunjangan Transportasi3"
                        + " Rp. " + ((Umum) Anggota[i]).getTunjanganTransport());
            }
            System.out.println("------------------------------------------ +");
            System.out.println("Total Gaji Keselurugan Rp. " + (Anggota[i]).getGajitotal());
        }
    }
}
