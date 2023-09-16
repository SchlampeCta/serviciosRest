/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.mueblesdelosalpes.logica.ejb;

import co.edu.uniandes.csw.mueblesdelosalpes.dto.RegistroVenta;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioOfertaMockLocal;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioPersistenciaMockLocal;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateless;


@Stateless
public class ServicioOfertaMock implements IServicioOfertaMockLocal {
    
   
//-----------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------
    
    /**
     * Interface con referencia al servicio de persistencia en el sistema
     */
    private IServicioPersistenciaMockLocal persistencia;

    //Constructor
    public ServicioOfertaMock (){
        
    }

    @Override
    public List<RegistroVenta> obtenerOfertas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int getTotalOfertas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }



}



