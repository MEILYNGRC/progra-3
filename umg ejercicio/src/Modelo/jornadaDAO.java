/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Modelo.jornada;
/**
 *
 * @author meilyn garcia
 */
public class jornadaDAO {
    conexion cn = new conexion();
    Connection con;
    PreparedStatement ps;
    ResultSet rs;
    public void insertarJornada(jornada j){

    String sql = "INSERT INTO jornadas (JorNombre) VALUES (?)";

    try{
        con = conexion.getConnection();
        ps = con.prepareStatement(sql);

        ps.setString(1, j.getJorNombre());

        ps.executeUpdate();

        System.out.println("Jornada insertada");

    }catch(Exception e){
        e.printStackTrace();
    }
}
    public void mostrarJornadas() {

        String sql = "SELECT * FROM jornadas";

        try {
            con = cn.getConnection();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();

            while (rs.next()) {
                System.out.println(rs.getInt("JorCodigo") + " "
                        + rs.getString("JorNombre"));
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public void eliminarJornada(int id){

    String sql = "DELETE FROM jornadas WHERE JorCodigo=?";

    try{
        con = conexion.getConnection();
        ps = con.prepareStatement(sql);

        ps.setInt(1, id);

        ps.executeUpdate();

        System.out.println("Jornada eliminada");

    }catch(Exception e){
        e.printStackTrace();
    }
}
}
