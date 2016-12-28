package org.ufpb.projetoayla.meuProjetoWeb.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import org.ufpb.projetoayla.meuProjetoWeb.model.Contexto;
import org.ufpb.projetoayla.meuProjetoWeb.service.ContextoService;

@Path("/contextos")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ContextoResources {

	ContextoService contextoService = new ContextoService();

	@GET
	public List<Contexto> getContextos(@QueryParam("year") int year, @QueryParam("start") int start, @QueryParam("size") int size){
		if(year > 0){
			return contextoService.getAllContextosForYear(year);
		}
		if(start >= 0 && size > 0){
			return contextoService.getAllContextosPaginated(start, size);
		}
		return contextoService.getAllContextos();
	}
	
	@GET
	@Path("/{contextoId}")
	public Contexto getContexto(@PathParam("contextoId") long id){
		return contextoService.getContexto(id);
	}
	
	@POST
	public Contexto addContexto(Contexto palavra){
		return contextoService.addContexto(palavra);
	}
	
	@PUT
	@Path("/{contextoId}")
	public Contexto updateContexto(@PathParam("contextoId") long id, Contexto contexto){
		contexto.setId(id);
		return contextoService.updateContexto(contexto);
	}
	
	@DELETE
	@Path("/{contextoId}")
	public void deleteContexto(@PathParam("contextoId") long id){
		contextoService.removeContexto(id);
	}
	
	
	
	
}
