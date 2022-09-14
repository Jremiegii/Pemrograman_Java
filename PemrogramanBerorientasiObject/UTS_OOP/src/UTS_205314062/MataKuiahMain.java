package UTS_205314062;

public class MataKuiahMain {

    public static void main(String[] args) {
        
        Mahasiswa[] data1;
        MataKuliah Baru = new MataKuliah(672409, "Rekayasa Perangkat Lunak", 5, "Stev");
        MataKuliah Baru1 = new MataKuliah(239487, "Basis Data", 5, "John");
        MataKuliah Baru2 = new MataKuliah(123456, "Kalkulus", 3, "Marry");
        MataKuliah Baru3 = new MataKuliah(456789, "Bahasa Inggris", 2, "Welly");
        MataKuliah Baru4 = new MataKuliah(234566, "Bahasa Indonesia", 2, "Morrata");
        MataKuliah Baru5 = new MataKuliah(985745, "Pendidikan Teologi", 2, "Viera");
        
        
        Mahasiswa mahasiswa1 = new Mahasiswa(205314062, "Fransiskus Jremiegi Saputra");
        Mahasiswa mahasiswa2 = new Mahasiswa(205320002, "Mickeal");
        
         
        System.out.println("===========================");
        System.out.println("     DATA MAHASISWA 1      \n");
        System.out.println("NIM  : "+mahasiswa1.getNIM());
        System.out.println("Nama : "+mahasiswa1.getNama());
        System.out.println();
        System.out.println("===========================");
        System.out.println("     DATA MAHASISWA 2      \n");
        System.out.println("NIM  : "+mahasiswa2.getNIM());
        System.out.println("Nama : "+mahasiswa2.getNama());
        System.out.println();
        System.out.println("MAHASISWA 1 MENGAMBIL : ");
        System.out.println("Kode Mata Kuliah : "+Baru.getKodeMtk());
        System.out.println("Nama Mata Kuliah : "+Baru.getNamaMtk());
        System.out.println("Jumlah SKS       : "+Baru.getSKS());
        System.out.println("Dosen            : "+Baru.getNamaDos());
        System.out.println("Kode Mata Kuliah : "+Baru1.getKodeMtk());
        System.out.println("Nama Mata Kuliah : "+Baru1.getNamaMtk());
        System.out.println("Jumlah SKS       : "+Baru1.getSKS());
        System.out.println("Dosen            : "+Baru1.getNamaDos());
        System.out.println("Kode Mata Kuliah : "+Baru2.getKodeMtk());
        System.out.println("Nama Mata Kuliah : "+Baru2.getNamaMtk());
        System.out.println("Jumlah SKS       : "+Baru2.getSKS());
        System.out.println("Dosen            : "+Baru2.getNamaDos());
        System.out.println();
        System.out.println("MAHASISWA 2 MENGAMBIL : ");
        System.out.println("Kode Mata Kuliah : "+Baru3.getKodeMtk());
        System.out.println("Nama Mata Kuliah : "+Baru3.getNamaMtk());
        System.out.println("Jumlah SKS       : "+Baru3.getSKS());
        System.out.println("Dosen            : "+Baru3.getNamaDos());
        System.out.println("Kode Mata Kuliah : "+Baru4.getKodeMtk());
        System.out.println("Nama Mata Kuliah : "+Baru4.getNamaMtk());
        System.out.println("Jumlah SKS       : "+Baru4.getSKS());
        System.out.println("Dosen            : "+Baru4.getNamaDos());
        System.out.println("Kode Mata Kuliah : "+Baru5.getKodeMtk());
        System.out.println("Nama Mata Kuliah : "+Baru5.getNamaMtk());
        System.out.println("Jumlah SKS       : "+Baru5.getSKS());
        System.out.println("Dosen            : "+Baru5.getNamaDos());
    }
    
}
