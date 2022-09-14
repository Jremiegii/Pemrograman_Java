package Latihan;

public class MainPegawai {

    public static void main(String[] agrs) {
        
        Jabatan Egi = new Jabatan();

        System.out.println("===== Data Pegawai =====");
        System.out.println("Jenis Golongan Anda = " + Egi.getGolongan());
        System.out.println("Gaji Pokok Anda Rp. " + Egi.getGajiPokok());
        System.out.println("Jumlah Waktu Kerja = " + Egi.getJamKerja());
        System.out.println("Gaji Lembur Anda Rp. " + Egi.getGajiLembur());
        System.out.println("Jumlah Anak Anda = " + Egi.getTunjanganAnak());
        System.out.println("Jumlah Tunjangan = " + Egi.getTunjanganJabatan());
        System.out.println("Jumlah Tunjangan Transportasi " + Egi.getTunjanganTransport());
        System.out.println("Bonus Yang Diperoleh = " + Egi.getBonus());
        Egi.TotalGaji();
        System.out.println("============================");
    }
}
