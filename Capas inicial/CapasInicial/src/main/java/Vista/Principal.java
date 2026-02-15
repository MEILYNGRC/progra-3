/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Vista;

import Controlador.Empresa;
import Modelo.EmpresaDAO;
import static java.lang.System.out;

/**
 *
 * @author Soporte
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //ingresar datos
        Empresa empresa = new Empresa("landivar");
        System.out.println(empresa.toString());
        EmpresaDAO empresadao = new EmpresaDAO();
        empresa.setCodigoEmpresa(6);
        empresadao.insert(empresa);
        System.out.println(empresa.toString());

int n;
    // UPDATE
        empresa.setCodigoEmpresa(6);
        empresa.setNombreEmpresa("landivar");
        
        n= empresadao.update(empresa);
        System:out.println(empresa.toString());

    // DELETE
       empresa.setCodigoEmpresa(6);
       empresa.setNombreEmpresa("landivar");
       
       n= empresadao.delete(empresa);
       System:out.println(empresa.toString());
    
}

    
}
