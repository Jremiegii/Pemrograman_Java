package Pratikum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Latihan3 {
    
    public static void main(String[] agrs){
        
        System.out.println("PROGRAM LATIHAN JDBC");
        System.out.println("=====================");
        
        System.out.println("Mencoba membuat koneksi ke database...");
        Latihan3 p = new Latihan3();
        Connection conn = p.getConnection();
        
        try{
            conn.close();
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        
        System.out.println("Menu:");
        System.out.println("1. Lihat Isi Tabel");
        System.out.println("2. Tambah Data");
        System.out.println("5. Keluar");
        int input = 0;
        while(input != 5){
            System.out.print("Pilih Menu? ");
            Scanner sc = new Scanner(System.in);
            input = sc.nextInt();
            switch(input){
                case 1:
                    p.showData();
                    break;
                case 2:
                    p.inputData();
                    break;
                default:
                    break;
            }
        }
    }
    
    public Connection getConnection(){
        
        String host = "localhost";
        String port = "1521";
        String db = "xe";
        String usr = "hr";
        String pwd = "Jremi391";
        // Load driver class
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
        } catch (ClassNotFoundException ex){
            System.out.println("Maaf driver class tidak ditemukan");
            System.out.println(ex.getMessage());
        }
        // Hubungkan sumber data
        Connection conn = null;
        try{
            conn = DriverManager.getConnection("jdbc:oracle:thin:@"+host+":"+port+":"+db, usr, pwd);
        } catch (SQLException ex) {
            System.out.println("Maaf, koneksi tidak berhasil");
            System.out.println(ex.getMessage());
        }
        if(conn != null){
            System.out.println("Koneksi ke database berhasil terbentuk");
        } else {
            System.out.println("Maaf, koneksi ke database gagal terbentuk");
        }
        return conn;
    }
    
    public void showData(){
        
        Connection conn = null;
        Statement st = null;
        ResultSet rs = null;
        
        conn = this.getConnection();
        try{
            st = conn.createStatement();
            rs = st.executeQuery("select * from mahasiswa");
            
            System.out.println("NAMA\t\tNIM\t\t\tIPK");
            while(rs.next()){
                System.out.println(rs.getString(1)+" " + "\t\t"+rs.getString(2)+"\t\t"+rs.getString(3));
            }
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        } finally {
            try{
                rs.close();
                st.close();
                conn.close();
            } catch (SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
    
    public void inputData(){
        
        Connection conn = null;
        PreparedStatement ps = null;
        
        conn = this.getConnection();
        
        Scanner sc  = new Scanner(System.in);
        System.out.println("INPUT DATA");
        System.out.print("Masukan NAMA:");
        String nama = sc.next();
        System.out.print("Masukan NIM:");
        String nim = sc.next();
        System.out.print("Masukan IPK:");
        double ipk = sc.nextDouble();
        
        try{
            ps = conn.prepareStatement("insert into mahasiswa values(?,?,?)");
            ps.setString(1, nama);
            ps.setString(2, nim);
            ps.setDouble(3, ipk);
            ps.executeUpdate();
            conn.commit();
            System.out.println("Data sudah ditambahkan");
        } catch (SQLException ex){
            System.out.println(ex.getMessage());
        } finally {
            try{
                ps.close();
                conn.close();
            } catch(SQLException ex){
                System.out.println(ex.getMessage());
            }
        }
    }
}
