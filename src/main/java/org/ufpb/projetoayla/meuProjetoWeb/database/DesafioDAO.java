package org.ufpb.projetoayla.meuProjetoWeb.database;

import org.ufpb.projetoayla.meuProjetoWeb.model.Desafio;

public class DesafioDAO extends GenericDAO <Desafio> {
	 
	public long retornaIdDesafio(){
		DesafioDAO dao = new DesafioDAO();
		int ultimo;
		if (dao.findAll().size()==0){
			ultimo= 0; 
		}else{
			ultimo  = dao.findAll().size()-1;
		}
		return ultimo;
	}
}
