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
        // “Primero creo un objeto Empresa y le asigno valores.
        //Luego utilizo la clase EmpresaDAO que es la encargada de conectarse a la base de datos.
        //Después realizo las operaciones básicas CRUD: insertar, actualizar y eliminar registros.”


        //ingresar datos
        Empresa empresa = new Empresa("umg"); //crea e incerta
        //se crea un objeto en la clase empresa
        System.out.println(empresa.toString());//Un método que imprime el objeto en consola.
        //sirve: Para mostrar los datos actuales del objeto antes de guardarlo en la base de datos.
        EmpresaDAO empresadao = new EmpresaDAO();//Se crea un objeto de la clase EmpresaDAO.
        //El DAO (Data Access Object) es la clase que se encarga de comunicarse con la base de datos.
        //Sin el DAO no podríamos insertar, actualizar ni eliminar datos.
        
        empresadao.insert(empresa);//Se llama al método insert() del DAO.
        //Para guardar el objeto empresa en la base de datos.
        System.out.println(empresa.toString());//Para mostrar nuevamente el objeto después de insertarlo.

int n;
    // UPDATE
        empresa.setCodigoEmpresa(9);
        //Se indica qué empresa se va a modificar (la que tiene código 4).
        empresa.setNombreEmpresa("regional");
        //Se cambia el nombre de la empresa.
        
        n= empresadao.update(empresa);//Para actualizar en la base de datos la empresa con código 4.
        System.out.println(empresa.toString());//Se imprime el objeto actualizado.

    // DELETE
       empresa.setCodigoEmpresa(11);
       empresa.setNombreEmpresa("");//Se especifica qué empresa se va a eliminar.
       
       n= empresadao.delete(empresa);//Guarda en n cuántos registros fueron eliminados.
       System.out.println(empresa.toString());
       //Se imprime el objeto (aunque ya fue eliminado en la base de datos).
}

    
}
