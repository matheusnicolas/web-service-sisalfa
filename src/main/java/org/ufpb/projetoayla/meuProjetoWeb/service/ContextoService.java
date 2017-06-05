package org.ufpb.projetoayla.meuProjetoWeb.service;

import java.util.List;

import org.ufpb.projetoayla.meuProjetoWeb.database.ContextoDAO;
import org.ufpb.projetoayla.meuProjetoWeb.model.Contexto;

public class ContextoService {
	
	private static ContextoDAO dao = new ContextoDAO();
	
	public ContextoService(){
		//contextos.put(1L, new Contexto(1, "Instituto", "IMAGEM.PNG" ,"(DESCRIÇÃO ÁUDIO)", "João"));
		//contextos.put(2L, new Contexto(2, "Brasil", "país.jpeg", "(DESCRIÇÃO ÁUDIO)", "Maria"));
		//contextos.put(3L, new Contexto(3, "Urbanização", "RUA.PNG", "(DESCRIÇÃO ÁUDIO)" , "Felipe"));
	}

	public List<Contexto> getAllContextos(){
		return dao.findAll();
	}
	
	public Contexto getContexto(long id){
		return dao.getById(id);
	}
	
	public Contexto addContexto(Contexto contexto){
		dao.save(contexto);
		return contexto;
	}
	
	public Contexto updateContexto(Contexto contexto){
		if(contexto.getId() <= 0){
			return null;
		}
		dao.update(contexto);
		return contexto;
	}
	
	public void removeContexto(long id){
		dao.delete(dao.getById(id));
	}
	

	/*public List<Contexto> getAllContextosForYear(int year){
		List <Contexto> contextosForYear = new ArrayList<>();
		Calendar calendario = Calendar.getInstance();
		for(Contexto contexto: contextos.values()){
			calendario.setTime(contexto.getCreated());
			if(calendario.get(Calendar.YEAR) == year){
				contextosForYear.add(contexto);
			}
		}
		return contextosForYear;
	}*/
	
	/*public List<Contexto> getAllContextosPaginated(int start, int size){
		ArrayList<Contexto> list = new ArrayList<Contexto>(contextos.values());
		if((start + size) > list.size()){
			return new ArrayList<Contexto>();
		}
		return list.subList(start, start + size);
	}*/
}