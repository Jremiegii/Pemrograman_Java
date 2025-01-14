package Pratikum;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class Latihan2 {
    
    public static void main(String[] agrs){
        
        System.out.println("PROGRAM LATIHAN JDBC");
        System.out.println("=====================");
        
        System.out.println("Mencoba membuat koneksi ke database...");
        Latihan2 p = new Latihan2();
        Connection conn = p.getConnection();
        
        try{
            conn.close();
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
        }
        
        System.out.println("Menu:");
        System.out.println("1. Lihat Isi Tabel");
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
}
