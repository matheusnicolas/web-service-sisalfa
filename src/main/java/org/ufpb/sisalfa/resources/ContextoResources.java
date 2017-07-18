package org.ufpb.sisalfa.resources;

import java.net.URI;
import java.net.URISyntaxException;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.ufpb.sisalfa.database.UsuarioDAO;
import org.ufpb.sisalfa.model.Contexto;
import org.ufpb.sisalfa.service.ContextoService;

import com.google.gson.Gson;
@Path("/")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ContextoResources {
	private static ContextoService contextoService = new ContextoService();
	@GET
	@Path("getContexto/{idContexto}")
	@Produces(MediaType.TEXT_HTML)
	public String getContexto(@PathParam("contextoId") long id){
		String nome = contextoService.getContexto(id).getNome();
		return nome;
	}
	@GET
	@Path("getAllContext")
	@Produces(MediaType.APPLICATION_JSON)
	public String getAllContexto(){
		Gson g = new Gson();
		String lista = g.toJson(contextoService.getAllContextos());
		return lista;
	}
	
	@POST
	@Path("addContexto")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addContexto(Contexto contexto, @Context UriInfo uriInfo) throws URISyntaxException{
		UsuarioDAO dao = new UsuarioDAO();
		contexto.setUsuario(dao.getById(1L));
		contextoService.addContexto(contexto);
		String newId = String.valueOf(contexto.getId());
		URI uri = uriInfo.getAbsolutePathBuilder().path(newId).build();
		return Response.created(uri).entity(contexto).build();
	}
	/*
	@PUT
	@Path("/update/{contextoId}")
	public Contexto updateContexto(@PathParam("contextoId") long id, Contexto contexto){
		contexto.setId(id);
		return contextoService.updateContexto(contexto);
	}
	
	@DELETE
	@Path("/delete/{contextoId}")
	public void deleteContexto(@PathParam("contextoId") long id){
		contextoService.removeContexto(id);
	}

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
	
	
	*/
	
}
