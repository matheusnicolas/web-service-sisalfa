package org.ufpb.projetoayla.meuProjetoWeb.resources;

import java.util.List;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.ufpb.projetoayla.meuProjetoWeb.model.Palavra;
import org.ufpb.projetoayla.meuProjetoWeb.service.PalavraService;

@Path("/palavras")
public class PalavraResources {

	PalavraService palavraService = new PalavraService();
	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public List<Palavra> getPalavras(){
		return palavraService.getAllPalavras();
	}
	
	@POST
	@Consumes(MediaType.APPLICATION_JSON)
	@Produces(MediaType.APPLICATION_JSON)
	public Palavra addPalavra(Palavra palavra){
		return palavraService.addPalavra(palavra);
	}
	
	@GET
	@Path("/{palavraId}")
	@Produces(MediaType.APPLICATION_JSON)
	public Palavra getMessage(@PathParam("palavraId") long id){
		
		return palavraService.getMessage(id);
	}
}
