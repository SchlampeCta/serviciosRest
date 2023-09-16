/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package co.edu.uniandes.csw.mueblesdelosalpes.servicios;

import co.edu.uniandes.csw.mueblesdelosalpes.dto.Mueble;
import co.edu.uniandes.csw.mueblesdelosalpes.dto.Vendedor;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioVendedoresMockRemote;
import co.edu.uniandes.csw.mueblesdelosalpes.logica.interfaces.IServicioVendedoresMockLocal;
import java.util.List;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

/**
 *
 * @author USUARIO
 */
@Path("/Vendedores")
@Stateless //crear un bean de sesión sin estado.
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ServicioVendedores {

    
    @EJB
    private IServicioVendedoresMockLocal vendedoresEjb;

   
    @GET
    @Path("vendedores/")
    //@Produces(MediaType.APPLICATION_JSON)
    public List<Vendedor> getTodosLosVendedores() {
        return vendedoresEjb.getVendedores();
        
    }

    @POST
    @Path("agregarvendedores/")
    //@Produces(MediaType.APPLICATION_JSON)
    public List<Vendedor> agregarVendedor (List<Vendedor> nuevoVendedor){
        for (Vendedor vendedor : nuevoVendedor) {
            vendedoresEjb.agregarVendedor(vendedor);
        }
        return nuevoVendedor;
    }
/*
    @PUT
    @Path("{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    public void actualizarVendedor(@PathParam("id") ){
        ServicioVendedoresLogicService.
    }
*/
    
    @DELETE
    @Path("eliminar/")
    public void eliminarVendedor(List<Vendedor> ev) {
        for (Vendedor vendedor : ev){
            vendedoresEjb.eliminarVendedor(vendedor.getIdentificacion());
        }
    }

}
