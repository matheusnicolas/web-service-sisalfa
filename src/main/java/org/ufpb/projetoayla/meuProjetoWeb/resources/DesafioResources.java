package org.ufpb.projetoayla.meuProjetoWeb.resources;

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

import org.ufpb.projetoayla.meuProjetoWeb.database.ContextoDAO;
import org.ufpb.projetoayla.meuProjetoWeb.database.UsuarioDAO;
import org.ufpb.projetoayla.meuProjetoWeb.model.Desafio;
import org.ufpb.projetoayla.meuProjetoWeb.service.DesafioService;

import com.google.gson.Gson;
@Path("/desafios")
public class DesafioResources {
	private DesafioService desafioService = new DesafioService();
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addContexto(Desafio desafio, @Context UriInfo uriInfo) throws URISyntaxException{
		//contexto e usuarios default
		ContextoDAO dao = new ContextoDAO();
		UsuarioDAO dao2 = new UsuarioDAO();
		desafio.setContexto(dao.getById(1L));
		desafio.setUsuario(dao2.getById(1L));
		//
		Desafio newDesafio = desafioService.addDesafio(desafio);
		String newId = String.valueOf(newDesafio.getId());
		URI uri = uriInfo.getAbsolutePathBuilder().path(newId).build();
		return Response.created(uri).entity(newDesafio).build();
		
	}
	
	@GET
	@Path("getAll")
	@Produces(MediaType.APPLICATION_JSON)
	public String retornaDesafios(){
		Gson g = new Gson();
		String lista = g.toJson(desafioService.getAllDesafio());
		return lista;
	}
	

}
