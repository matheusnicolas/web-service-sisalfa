package org.ufpb.projetoayla.meuProjetoWeb.resources;

import java.net.URI;
import java.net.URISyntaxException;
import java.util.Date;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import org.ufpb.projetoayla.meuProjetoWeb.database.UsuarioDAO;
import org.ufpb.projetoayla.meuProjetoWeb.model.Usuario;
import org.ufpb.projetoayla.meuProjetoWeb.service.UsuarioService;

import com.google.gson.Gson;

@Path("/usuarios")
public class UsuarioResources {
	private static UsuarioService usuarioService = new UsuarioService();
	
	@POST
	@Path("add")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response addUsuario(Usuario usuario, @Context UriInfo uriInfo) throws URISyntaxException{
		usuario.setDataEntrada(new Date());
		usuario.setStatus(true);
		usuarioService.addUsuario(usuario);
		String newId = String.valueOf(usuario.getId());
		URI uri = uriInfo.getAbsolutePathBuilder().path(newId).build();
		return Response.created(uri).entity(usuario).build();
	}
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	@Path("getAll")
	public String getAllUsuarios(){
		Gson g = new Gson();
		String lista = g.toJson(usuarioService.getAllUsuarios());
		return lista;
	}
	@GET
	@Produces(MediaType.TEXT_HTML)
	@Path("teste")
	public String retornaTeste(){
		UsuarioDAO dao = new UsuarioDAO();
			return dao.findAll().get(2).getNome();
	}

}
