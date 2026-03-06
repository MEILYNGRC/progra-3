/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.*;

/**
 *
 * @author meilyn
 */
public class conexion {

    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/umg";
    private static final String JDBC_USER = "root";
    private static final String JDBC_PASS = "9045";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(JDBC_URL, JDBC_USER, JDBC_PASS);
    }

    public static void close(ResultSet rs){
        try{
            if(rs!=null){
                rs.close();
            }
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }

    public static void close(PreparedStatement stmt){
        try{
            if(stmt!=null){
                stmt.close();
            }
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }

    public static void close(Connection conn){
        try{
            if(conn!=null){
                conn.close();
            }
        }catch(SQLException ex){
            ex.printStackTrace(System.out);
        }
    }
}
