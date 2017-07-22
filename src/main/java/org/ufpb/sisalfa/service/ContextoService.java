package org.ufpb.sisalfa.service;

import java.util.List;

import org.ufpb.sisalfa.database.ContextoDAO;
import org.ufpb.sisalfa.database.UsuarioDAO;
import org.ufpb.sisalfa.model.Contexto;

public class ContextoService {
	
	private static ContextoDAO dao = new ContextoDAO();
	
	public List<Contexto> getAllContextos(){
		return dao.findAll();
	}
	
	public Contexto getContexto(long id){
		return dao.getById(id);
	}
	
	public void addContexto(Contexto contexto){
		UsuarioDAO udao = new UsuarioDAO();
		contexto.setUsuario(udao.getById(contexto.getIdUsuario()));
		dao.save(contexto);
	}
	
	public void updateContexto(Contexto contexto){
		dao.update(contexto);
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