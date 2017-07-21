package org.ufpb.sisalfa.resources;

import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.ufpb.sisalfa.model.Usuario;
import org.ufpb.sisalfa.service.UsuarioService;

import com.google.gson.Gson;

@Path("/")
public class UsuarioResources {
	private static UsuarioService userService = new UsuarioService();
	
	@POST
	@Path("addUser")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addUsuario(Usuario usuario){
		usuario.setDataEntrada(new Date());
		usuario.setStatus(true);
		userService.addUsuario(usuario);
		return Response.ok(usuario.getId()).build();
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("getAllUsers")
	public String getAllUsuarios(){
		Gson g = new Gson();
		String lista = g.toJson(userService.getAllUsuarios());
		return lista;
	}
	@GET
	@Path("getUser/{idUser}")
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String getUser(@PathParam("idUser") long idUser){
		Usuario usuario = userService.getUsuario(idUser);
		Gson gson = new Gson();
		String userJson = gson.toJson(usuario);
		return userJson;
	}
	@DELETE
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.TEXT_HTML)
	@Path("deleteUser/{idUser}")
	public String deleteUser(@PathParam("idUser") long id){
		userService.deleteUser(id);
		return ("Feito");
	}
}
