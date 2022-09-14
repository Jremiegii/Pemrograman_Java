package Parkir;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class KoneksiData {
    
    public static void main(String[] args) {
        
        System.out.println("PROGRAM LATIHAN JDBC");
        System.out.println("=====================");
        
        System.out.println("Mencoba membuat koneksi ke database...");
        KoneksiData p = new KoneksiData();
        Connection conn = p.getConnection();
        
        try{
            conn.close();
        } catch(SQLException ex){
            System.out.println(ex.getMessage());
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
}
