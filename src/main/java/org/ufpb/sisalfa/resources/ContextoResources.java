package org.ufpb.sisalfa.resources;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.ufpb.sisalfa.database.UsuarioDAO;
import org.ufpb.sisalfa.model.Contexto;
import org.ufpb.sisalfa.service.ContextoService;

import com.google.gson.Gson;
@Path("/")
public class ContextoResources {
	private static ContextoService contextoService = new ContextoService();
	@POST
	@Path("addContext")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addContexto(Contexto contexto){
		UsuarioDAO dao = new UsuarioDAO();
		contexto.setUsuario(dao.getById(contexto.getIdUsuario()));
		contextoService.addContexto(contexto);
		return Response.ok(contexto.getId()).build();																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																																			
	}
	
	@GET
	@Path("getAllContext")
	@Produces(MediaType.APPLICATION_JSON)
	public String getAllContexto(){
		Gson g = new Gson();
		String lista = g.toJson(contextoService.getAllContextos());
		return lista;
	}
	
	@GET
	@Path("getContext/{idContext}")
	@Produces(MediaType.APPLICATION_JSON)
	public String getContexto(@PathParam("idContext") long id){
		Gson gson = new Gson();
		List<Contexto> lista =  new ArrayList<Contexto>();
		lista.add(contextoService.getContexto(id));
		String contextJson = gson.toJson(lista);
		return contextJson;
	}
	@PUT
	@Path("updateContext/{contextoId}")
	public void updateContexto(@PathParam("contextoId") long id, Contexto contexto){
		contexto.setId(id);
		contextoService.updateContexto(contexto);
	}
	
	@DELETE
	@Path("deleteContext/{contextoId}")
	public void deleteContexto(@PathParam("contextoId") long id){
		contextoService.removeContexto(id);
	}


	
	
	
	
}
