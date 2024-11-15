
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projekjsmne;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;


/**
 *
 * @author Ayu Dwi
 */

public class koneksi {
    private static final String URL = "jdbc:mysql://localhost:3306/tb_perpustakaan";
    private static final String USER = "root";
    private static final String PASS = "";

    public static java.sql.Connection getConnection() {
        java.sql.Connection conn = null;
        try {
            conn = DriverManager.getConnection(URL, USER, PASS);
            System.out.println("terkoneksi");
        } catch (SQLException e) {
            System.out.println("error : " + e.getMessage());
        }
        return conn;
    }
    
    public static void main(String[] args) {
        getConnection();
    }
}
 

