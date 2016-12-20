package org.ufpb.projetoayla.meuProjetoWeb.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.ufpb.projetoayla.meuProjetoWeb.model.Contexto;
import org.ufpb.projetoayla.meuProjetoWeb.service.ContextoService;

@Path("/contextos")
public class ContextoResources {

	ContextoService contextoService = new ContextoService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Contexto> getContextos(){
		return contextoService.getAllContextos();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Contexto addContexto(Contexto palavra){
		return contextoService.addContexto(palavra);
	}
	
	@GET
	@Path("/{contextoID}")
	@Produces(MediaType.APPLICATION_JSON)
	public Contexto getContexto(@PathParam("contextoID") long id){
		return contextoService.getContexto(id);
	}
}
