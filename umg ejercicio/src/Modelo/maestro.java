/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author meilyn
 */
public class maestro {

    private int mae_codigo;
    private String mae_nombre;
    private String mae_direccion;
    private String mae_estatus;

    public maestro() {
    }

    public maestro(String mae_nombre, String mae_direccion, String mae_estatus) {
        this.mae_nombre = mae_nombre;
        this.mae_direccion = mae_direccion;
        this.mae_estatus = mae_estatus;
    }

    public int getmae_codigo() {
        return mae_codigo;
    }

    public void setmae_codigo(int mae_codigo) {
        this.mae_codigo = mae_codigo;
    }

    public String getmae_nombre() {
        return mae_nombre;
    }

    public void setmae_nombre(String mae_nombre) {
        this.mae_nombre = mae_nombre;
    }

    public String getmae_direccion() {
        return mae_direccion;
    }

    public void setmae_direccion(String mae_direccion) {
        this.mae_direccion = mae_direccion;
    }

    public String getmae_estatus() {
        return mae_estatus;
    }

    public void setmae_estatus(String mae_estatus) {
        this.mae_estatus = mae_estatus;
    }

    @Override
    public String toString() {
        return "maestro{" +
                "codigo=" + mae_codigo +
                ", nombre=" + mae_nombre +
                ", direccion=" + mae_direccion +
                ", estatus=" + mae_estatus +
                '}';
    }
}
