/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.maestroControl;

public class principal {

    public static void main(String[] args) {

        maestroControl controlador = new maestroControl();

      //controlador.insertarMaestro("angie","zona 2","0");

        controlador.mostrarMaestros();

        controlador.actualizarMaestro(10,"julia","Zona 17","1");

        //controlador.eliminarMaestro(12);

    }

}