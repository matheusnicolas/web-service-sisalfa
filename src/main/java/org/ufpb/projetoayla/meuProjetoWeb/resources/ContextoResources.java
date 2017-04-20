package org.ufpb.projetoayla.meuProjetoWeb.resources;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

import javax.ws.rs.BeanParam;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.ufpb.projetoayla.meuProjetoWeb.model.Contexto;
import org.ufpb.projetoayla.meuProjetoWeb.resources.beans.ContextoFilterBean;
import org.ufpb.projetoayla.meuProjetoWeb.service.ContextoService;

@Path("/contextos")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ContextoResources {

	ContextoService contextoService = new ContextoService();

	@GET
	public List<Contexto> getContextos(@BeanParam ContextoFilterBean filterBean){
		if(filterBean.getYear() > 0){
			return contextoService.getAllContextosForYear(filterBean.getYear());
		}
		if(filterBean.getStart() >= 0 && filterBean.getSize() > 0){
			return contextoService.getAllContextosPaginated(filterBean.getStart(), filterBean.getSize());
		}
		return contextoService.getAllContextos();
	}
	
	@GET
	@Path("/{contextoId}")
	public Contexto getContexto(@PathParam("contextoId") long id){
		return contextoService.getContexto(id);
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addContexto(Contexto palavra, @Context UriInfo uriInfo) throws URISyntaxException{
		
		Contexto newContexto = contextoService.addContexto(palavra);
		String newId = String.valueOf(newContexto.getId());
		URI uri = uriInfo.getAbsolutePathBuilder().path(newId).build();
		return Response.created(uri).entity(newContexto).build();
		
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
