/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package belajar.java.fundamental;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author anggi
 */
public class Datasource {
    
    public static final String jdbcDriver = "com.mysql.jdbc.Driver";
    public static final String databaseUrl = "jdbc:mysql://localhost/latihan";
    public static final String databaseUsername = "root";
    public static final String databasePassword = "admin";
    
    public static Connection getConnection() {
        try {
            Connection conn = null;
            Class.forName(jdbcDriver);
            conn = DriverManager.getConnection(databaseUrl, databaseUsername, databasePassword);
            System.out.println("Koneksi Berhasil !!");
            return conn;
        } catch (ClassNotFoundException | SQLException ex) {
            System.out.println("Koneksi gagal");
            ex.printStackTrace();
        }
        return null;
    }
    
}
