package org.ufpb.projetoayla.meuProjetoWeb.service;

import java.util.List;

import org.ufpb.projetoayla.meuProjetoWeb.database.DesafioDAO;
import org.ufpb.projetoayla.meuProjetoWeb.model.Desafio;

public class DesafioService {
	private static DesafioDAO dao = new DesafioDAO();
	
	public Desafio addDesafio(Desafio desafio){
		dao.save(desafio);
		return desafio;
	}
	public List<Desafio> getAllDesafio(){
		return dao.findAll();
	}
}
