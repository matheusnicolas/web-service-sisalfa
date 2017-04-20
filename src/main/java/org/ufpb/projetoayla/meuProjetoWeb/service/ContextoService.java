package org.ufpb.projetoayla.meuProjetoWeb.service;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;
import java.util.Map;

import org.ufpb.projetoayla.meuProjetoWeb.database.DatabaseClass;
import org.ufpb.projetoayla.meuProjetoWeb.exception.DataNotFoundException;
import org.ufpb.projetoayla.meuProjetoWeb.model.Contexto;

public class ContextoService {
	
	private Map<Long, Contexto> contextos = DatabaseClass.getContextos();
	
	public ContextoService(){
		//contextos.put(1L, new Contexto(1, "Instituto", "IMAGEM.PNG" ,"(DESCRIÇÃO ÁUDIO)", "João"));
		//contextos.put(2L, new Contexto(2, "Brasil", "país.jpeg", "(DESCRIÇÃO ÁUDIO)", "Maria"));
		//contextos.put(3L, new Contexto(3, "Urbanização", "RUA.PNG", "(DESCRIÇÃO ÁUDIO)" , "Felipe"));
	}

	public List<Contexto> getAllContextos(){
		return new ArrayList<Contexto>(contextos.values());
	}
	
	public List<Contexto> getAllContextosForYear(int year){
		List <Contexto> contextosForYear = new ArrayList<>();
		Calendar calendario = Calendar.getInstance();
		for(Contexto contexto: contextos.values()){
			calendario.setTime(contexto.getCreated());
			if(calendario.get(Calendar.YEAR) == year){
				contextosForYear.add(contexto);
			}
		}
		return contextosForYear;
	}
	
	public List<Contexto> getAllContextosPaginated(int start, int size){
		ArrayList<Contexto> list = new ArrayList<Contexto>(contextos.values());
		if((start + size) > list.size()){
			return new ArrayList<Contexto>();
		}
		return list.subList(start, start + size);
	}
	
	public Contexto getContexto(long id){
		Contexto contexto = contextos.get(id);
		if(contexto == null){
			throw new DataNotFoundException("O contexto de id " + id + " nao foi encontrado");
		}
		return contexto;
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
		return contextos.remove(id);
	}
}