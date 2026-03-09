/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author usuario
 */
public class jornada {
    
    private int JorCodigo;
    private String JorNombre;

    public int getJorCodigo() {
        return JorCodigo;
    }

    public void setJorCodigo(int JorCodigo) {
        this.JorCodigo = JorCodigo;
    }

    public String getJorNombre() {
        return JorNombre;
    }

    public void setJorNombre(String JorNombre) {
        this.JorNombre = JorNombre;
    }
     @Override
    public String toString() {
        return "jornada{" +
                "Codigo=" + JorCodigo +
                ", nombre=" + JorNombre +
                '}';
    }
}
