package org.ufpb.sisalfa.resources;

import java.net.URISyntaxException;
import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.UriInfo;

import org.ufpb.sisalfa.model.Usuario;
import org.ufpb.sisalfa.service.UsuarioService;

import com.google.gson.Gson;

@Path("/")
public class UsuarioResources {
	private static UsuarioService usuarioService = new UsuarioService();
	private static final String SUCCESS_RESULT="<result>success</result>";
	@POST
	@Path("addUser")
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_XML)
	public String addUsuario(Usuario usuario, @Context UriInfo uriInfo) throws URISyntaxException{
		usuario.setDataEntrada(new Date());
		usuario.setStatus(true);
		usuarioService.addUsuario(usuario);
		return SUCCESS_RESULT;
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("getAllUsers")
	public String getAllUsuarios(){
		Gson g = new Gson();
		String lista = g.toJson(usuarioService.getAllUsuarios());
		return lista;
	}
}
