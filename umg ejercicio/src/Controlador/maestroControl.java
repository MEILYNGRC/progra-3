/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

import Modelo.maestroDAO;
import Modelo.maestro;
import java.util.List;
/**
 *
 * @author meilyn
 */


public class maestroControl {

    maestroDAO maestrodao = new maestroDAO();

    public void insertarMaestro(String nombre,String direccion,String estatus){

        maestro m = new maestro(nombre,direccion,estatus);
        maestrodao.insert(m);

        System.out.println("Insertado");
    }

    public void mostrarMaestros(){

        List<maestro> lista = maestrodao.select();

        for(maestro m : lista){
            System.out.println(m);
        }
    }

    public void actualizarMaestro(int codigo,String nombre,String direccion,String estatus){

        maestro m = new maestro(nombre,direccion,estatus);
        m.setmae_codigo(codigo);

        maestrodao.update(m);
    }

    public void eliminarMaestro(int codigo){

        maestro m = new maestro();
        m.setmae_codigo(codigo);

        maestrodao.delete(m);
    }

}
