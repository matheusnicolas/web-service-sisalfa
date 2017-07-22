package org.ufpb.sisalfa.service;

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
	
}
