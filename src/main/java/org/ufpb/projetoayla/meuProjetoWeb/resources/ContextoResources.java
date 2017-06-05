package org.ufpb.projetoayla.meuProjetoWeb.resources;

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

import org.ufpb.projetoayla.meuProjetoWeb.database.UsuarioDAO;
import org.ufpb.projetoayla.meuProjetoWeb.model.Contexto;
import org.ufpb.projetoayla.meuProjetoWeb.service.ContextoService;

import com.google.gson.Gson;

@Path("/contextos")
@Consumes(MediaType.APPLICATION_JSON)
@Produces(MediaType.APPLICATION_JSON)
public class ContextoResources {
	
	private static ContextoService contextoService = new ContextoService();
	/*private static final String SUCCESS_RESULT="<result>success</result>";
	private static final String FAILURE_RESULT="<result>failure</result>";
	*/
	@GET
	@Path("{contextoId}")
	@Produces(MediaType.TEXT_HTML)
	public String getContexto(@PathParam("contextoId") long id){
		String nome = contextoService.getContexto(id).getNome();
		return nome;
	}
	@GET
	@Path("getAll")
	@Produces(MediaType.APPLICATION_JSON)
	public String getAllContexto(){
		Gson g = new Gson();
		String lista = g.toJson(contextoService.getAllContextos());
		return lista;
	}
	
	@POST
	@Path("add")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addContexto(Contexto contexto, @Context UriInfo uriInfo) throws URISyntaxException{
		UsuarioDAO dao = new UsuarioDAO();
		contexto.setUsuario(dao.getById(1L));
		Contexto newContexto=contextoService.addContexto(contexto);
		
		String newId = String.valueOf(newContexto.getId());
		URI uri = uriInfo.getAbsolutePathBuilder().path(newId).build();
		return Response.created(uri).entity(newContexto).build();
		
	}
	
/*	@PUT
	@Path("/{contextoId}")
	public Contexto updateContexto(@PathParam("contextoId") long id, Contexto contexto){
		contexto.setId(id);
		return contextoService.updateContexto(contexto);
	}
	
	@DELETE
	@Path("/{contextoId}")
	public void deleteContexto(@PathParam("contextoId") long id){
		contextoService.removeContexto(id);
	}*/

	/*@GET
	public List<Contexto> getContextos(@BeanParam ContextoFilterBean filterBean){
		if(filterBean.getYear() > 0){
			return contextoService.getAllContextosForYear(filterBean.getYear());
		}
		if(filterBean.getStart() >= 0 && filterBean.getSize() > 0){
			return contextoService.getAllContextosPaginated(filterBean.getStart(), filterBean.getSize());
		}
		return contextoService.getAllContextos();
	}*/
	
	
	
	
}
