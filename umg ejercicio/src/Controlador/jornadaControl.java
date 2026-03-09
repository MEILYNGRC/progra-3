/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author meilyn
 */
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import Modelo.conexion;

public class jornadaControl {

    public void insertarJornada(String nombre){

        String sql = "INSERT INTO jornadas (JorNombre) VALUES (?)";

        try{

            Connection con = conexion.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, nombre);

            ps.executeUpdate();

            System.out.println("Jornada insertada");

        }catch(Exception e){

            System.out.println("Error al insertar jornada: " + e);

        }
    }

    public void actualizarJornada(int id, String nombre){

        String sql = "UPDATE jornadas SET JorNombre = ? WHERE JorCodigo = ?";

        try{

            Connection con = conexion.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setString(1, nombre);
            ps.setInt(2, id);

            ps.executeUpdate();

            System.out.println("Jornada actualizada");

        }catch(Exception e){

            System.out.println("Error al actualizar jornada: " + e);

        }
    }

    public void mostrarJornadas() {

        String sql = "SELECT * FROM jornadas";

        try {

            Connection con = conexion.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();

            while(rs.next()){
                System.out.println(
                    rs.getInt("") + "JorCodigo" +
                    rs.getString("nombre_jornada")
                );
            }

        } catch (Exception e) {
            System.out.println("Error al mostrar jornadas: " + e);
        }
    }

    public void eliminarJornada(int id){

        String sql = "DELETE FROM jornadas WHERE JorCodigo = ?";

        try{

            Connection con = conexion.getConnection();
            PreparedStatement ps = con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.executeUpdate();

            System.out.println("Jornada eliminada");

        }catch(Exception e){
            System.out.println("Error al eliminar: " + e);
        }
    }
}