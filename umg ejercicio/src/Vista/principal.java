/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vista;

import Controlador.maestroControl;
import Controlador.jornadaControl;

/**
 *
 * @author usuario
 */
public class principal {

    public static void main(String[] args) {

        maestroControl maestro = new maestroControl();
        jornadaControl jornada = new jornadaControl();

        maestro.insertarMaestro("Ana García","zona 17","0");

       // maestro.mostrarMaestros();
       // maestro.actualizarMaestro(2, "karen", "Zona 18", "0");
        
        //maestro.eliminarMaestro();
//______________________________________________________________________________________
        
        //jornada.insertarJornada("Matutina");
        //jornada.insertarJornada("Vespertina");

        //jornada.mostrarJornadas();

        //jornada.actualizarJornada(1, "VESPERTINA");
        //jornada.eliminarJornada(3);
    }
}
