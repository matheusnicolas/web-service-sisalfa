package org.ufpb.sisalfa.service;

import java.util.ArrayList;
import java.util.List;

import org.ufpb.sisalfa.database.ContextoDAO;
import org.ufpb.sisalfa.database.DesafioDAO;
import org.ufpb.sisalfa.database.UsuarioDAO;
import org.ufpb.sisalfa.model.Desafio;

public class DesafioService {
	private static DesafioDAO dao = new DesafioDAO();
	
	public void addDesafio(Desafio desafio){
		UsuarioDAO udao = new UsuarioDAO();
		ContextoDAO cdao = new ContextoDAO();
		desafio.setUsuario(udao.getById(desafio.getIdUsuario()));
		desafio.setContexto(cdao.getById(desafio.getIdContexto()));
		dao.save(desafio);
	}
	public List<Desafio> getAllDesafio(){
		return dao.findAll();
	}
	public Desafio getDesafio(long id){
		return dao.getById(id);
	}
	public List<Desafio> getDesafioDoContexto(long idContexto){
		List<Desafio> desafios = getAllDesafio();
		List<Desafio> lista = new ArrayList<Desafio>();
		for (Desafio d : desafios){
			if (d.getContexto().getId()==idContexto){
				lista.add(d);
			}
		}
		//if (lista.size()==0) throw new ContextoVazioException("Não existem desafios para esse contexto!");
		return lista;
	}
}
