package org.ufpb.projetoayla.meuProjetoWeb.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.ufpb.projetoayla.meuProjetoWeb.database.DatabaseClass;
import org.ufpb.projetoayla.meuProjetoWeb.model.Palavra;

public class PalavraService {
	
	private Map<Long, Palavra> palavras = DatabaseClass.getMessages();
	
	public PalavraService(){
		palavras.put(1L, new Palavra(1, "Instituto", "Médio", "João"));
		palavras.put(2L, new Palavra(2, "Brasil", "Fácil", "Maria"));
		palavras.put(3L, new Palavra(3, "Urbanização", "Dificíl", "Felipe"));
		palavras.put(4L, new Palavra(4, "Programar", "Médio", "Ayla"));
		palavras.put(5L, new Palavra(5, "Mundo", "Fácil", "Manoel"));
	}

	public List<Palavra> getAllPalavras(){
		return new ArrayList<Palavra>(palavras.values());
	}
	
	public Palavra getMessage(long id){
		return palavras.get(id);
	}
	
	public Palavra addMessage(Palavra palavra){
		palavra.setId(palavras.size() + 1);
		palavras.put(palavra.getId(), palavra);
		return palavra;
	}
	
	public Palavra updateMessage(Palavra palavra){
		if(palavra.getId() <= 0){
			return null;
		}
		palavras.put(palavra.getId(), palavra);
		return palavra;
	}
	
	public Palavra removeMessage(long id){
		return palavras.remove("id");
	}
}