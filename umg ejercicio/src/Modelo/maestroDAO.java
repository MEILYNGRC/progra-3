/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author MEILYN
 */
public class maestroDAO {

    private static final String SQL_SELECT =
            "SELECT mae_codigo, mae_nombre, mae_direccion, mae_estatus FROM maestros";

    private static final String SQL_INSERT =
            "INSERT INTO maestros(mae_nombre, mae_direccion, mae_estatus) VALUES(?,?,?)";

    private static final String SQL_UPDATE =
            "UPDATE maestros SET mae_nombre=?, mae_direccion=?, mae_estatus=? WHERE mae_codigo=?";

    private static final String SQL_DELETE =
            "DELETE FROM maestros WHERE mae_codigo=?";

    public List<maestro> select() {

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;
        maestro maestro = null;
        List<maestro> maestros = new ArrayList<>();

        try {

            conn = conexion.getConnection();
            stmt = conn.prepareStatement(SQL_SELECT);
            rs = stmt.executeQuery();

            while (rs.next()) {

                int mae_codigo = rs.getInt("mae_codigo");
                String mae_nombre = rs.getString("mae_nombre");
                String mae_direccion = rs.getString("mae_direccion");
                String mae_estatus = rs.getString("mae_estatus");

                maestro = new maestro();
                maestro.setmae_codigo(mae_codigo);
                maestro.setmae_nombre(mae_nombre);
                maestro.setmae_direccion(mae_direccion);
                maestro.setmae_estatus(mae_estatus);

                maestros.add(maestro);
            }

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            conexion.close(rs);
            conexion.close(stmt);
            conexion.close(conn);
        }

        return maestros;
    }

    public int insert(maestro maestro) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {

            conn = conexion.getConnection();
            stmt = conn.prepareStatement(SQL_INSERT);

            stmt.setString(1, maestro.getmae_nombre());
            stmt.setString(2, maestro.getmae_direccion());
            stmt.setString(3, maestro.getmae_estatus());

            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            conexion.close(stmt);
            conexion.close(conn);
        }

        return rows;
    }

    public int update(maestro maestro) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {

            conn = conexion.getConnection();
            stmt = conn.prepareStatement(SQL_UPDATE);

            stmt.setString(1, maestro.getmae_nombre());
            stmt.setString(2, maestro.getmae_direccion());
            stmt.setString(3, maestro.getmae_estatus());
            stmt.setInt(4, maestro.getmae_codigo());

            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            conexion.close(stmt);
            conexion.close(conn);
        }

        return rows;
    }

    public int delete(maestro maestro) {

        Connection conn = null;
        PreparedStatement stmt = null;
        int rows = 0;

        try {

            conn = conexion.getConnection();
            stmt = conn.prepareStatement(SQL_DELETE);

            stmt.setInt(1, maestro.getmae_codigo());

            rows = stmt.executeUpdate();

        } catch (SQLException ex) {
            ex.printStackTrace(System.out);
        } finally {
            conexion.close(stmt);
            conexion.close(conn);
        }

        return rows;
    }
}