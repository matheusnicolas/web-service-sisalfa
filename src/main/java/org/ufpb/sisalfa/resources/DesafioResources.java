package org.ufpb.sisalfa.resources;

import java.net.URI;
import java.net.URISyntaxException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.ufpb.sisalfa.database.ContextoDAO;
import org.ufpb.sisalfa.database.UsuarioDAO;
import org.ufpb.sisalfa.model.Desafio;
import org.ufpb.sisalfa.service.DesafioService;

import com.google.gson.Gson;
@Path("/")
public class DesafioResources {
	private DesafioService desafioService = new DesafioService();
	@POST
	@Path("addDesafio")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addDesafio(Desafio desafio, @Context UriInfo uriInfo) throws URISyntaxException{
		//contexto e usuarios default
		ContextoDAO dao = new ContextoDAO();
		UsuarioDAO dao2 = new UsuarioDAO();
		desafio.setContexto(dao.getById(1L));
		desafio.setUsuario(dao2.getById(1L));
		//
		desafioService.addDesafio(desafio);
		String newId = String.valueOf(desafio.getId());
		URI uri = uriInfo.getAbsolutePathBuilder().path(newId).build();
		return Response.created(uri).entity(desafio).build();
		
	}
	
	@GET
	@Path("getAllChallenge")
	@Produces(MediaType.APPLICATION_JSON)
	public String retornaDesafios(){
		Gson g = new Gson();
		String lista = g.toJson(desafioService.getAllDesafio());
		return lista;
	}
	

}
