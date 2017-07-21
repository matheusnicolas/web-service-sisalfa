package org.ufpb.sisalfa.service;

import java.util.List;

import org.ufpb.sisalfa.database.DesafioDAO;
import org.ufpb.sisalfa.model.Desafio;

public class DesafioService {
	private static DesafioDAO dao = new DesafioDAO();
	
	public void addDesafio(Desafio desafio){
		dao.save(desafio);
	}
	public List<Desafio> getAllDesafio(){
		return dao.findAll();
	}
	
}
