/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces;

import java.util.List;
import co.edu.uniandes.csw.mueblesdelosalpes.dto.RegistroVenta;

/**
 *
 * @author USUARIO
 */
public interface IServicioOfertaMockLocal {
    
    public List<RegistroVenta> obtenerOfertas();
    
   
    //Devuelve el cantidad total de las ofertas
    public int getTotalOfertas();
    
    
   // public void agregarOferta(Oferta oferta);
}
