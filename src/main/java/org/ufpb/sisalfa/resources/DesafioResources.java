package org.ufpb.sisalfa.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.ufpb.sisalfa.model.Desafio;
import org.ufpb.sisalfa.service.ContextoService;
import org.ufpb.sisalfa.service.DesafioService;
import org.ufpb.sisalfa.service.UsuarioService;

import com.google.gson.Gson;
@Path("/")
public class DesafioResources {
	private DesafioService desafioService = new DesafioService();
	private ContextoService contextoService = new ContextoService();
	private UsuarioService usuarioService =  new UsuarioService();
	@POST
	@Path("addChallenge")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addDesafio(Desafio desafio){
		desafio.setUsuario(usuarioService.getUsuario(desafio.getIdUsuario()));
		desafio.setContexto(contextoService.getContexto(desafio.getIdContexto()));
		desafioService.addDesafio(desafio);
		return Response.ok(desafio.getId()).build();
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
