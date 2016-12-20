package org.ufpb.projetoayla.meuProjetoWeb.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.ufpb.projetoayla.meuProjetoWeb.database.DatabaseClass;
import org.ufpb.projetoayla.meuProjetoWeb.model.Contexto;

public class ContextoService {
	
	private Map<Long, Contexto> contextos = DatabaseClass.getMessages();
	
	public ContextoService(){
		contextos.put(1L, new Contexto(1, "Instituto", "IMAGEM.PNG" ,"(DESCRIÇÃO ÁUDIO)", "João"));
		contextos.put(2L, new Contexto(2, "Brasil", "país.jpeg", "(DESCRIÇÃO ÁUDIO)", "Maria"));
		contextos.put(3L, new Contexto(3, "Urbanização", "RUA.PNG", "(DESCRIÇÃO ÁUDIO)" , "Felipe"));
	}

	public List<Contexto> getAllContextos(){
		return new ArrayList<Contexto>(contextos.values());
	}
	
	public Contexto getContexto(long id){
		return contextos.get(id);
	}
	
	public Contexto addContexto(Contexto contexto){
		contexto.setId(contextos.size() + 1);
		contextos.put(contexto.getId(), contexto);
		return contexto;
	}
	
	public Contexto updateContexto(Contexto contexto){
		if(contexto.getId() <= 0){
			return null;
		}
		contextos.put(contexto.getId(), contexto);
		return contexto;
	}
	
	public Contexto removeContexto(long id){
		return contextos.remove("id");
	}
}