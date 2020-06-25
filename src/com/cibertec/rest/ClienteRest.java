package com.cibertec.rest;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import com.cibertec.dao.ClienteDAOImpl;
import com.cibertec.entidad.Cliente;

@Path("/cliente")
public class ClienteRest {
	private ClienteDAOImpl dao;
	
	public  ClienteRest() {
		dao = new ClienteDAOImpl();
	}
	
	@GET
	@Path("/consulta/{edad1}/{edad2}")
	@Produces(MediaType.APPLICATION_JSON)
	public Response listaCliente(@PathParam("edad1") int e1,@PathParam("edad2") int e2){
		return  Response.ok(dao.listAllClienteXEdad(e1, e2)).build();
	}
	
	@POST
	@Path("/registrar")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public int registrarCliente(Cliente bean) {
		return dao.saveCliente(bean);
	}

}
