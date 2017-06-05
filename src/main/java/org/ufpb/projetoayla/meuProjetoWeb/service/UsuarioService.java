package org.ufpb.projetoayla.meuProjetoWeb.service;

import java.util.List;

import org.ufpb.projetoayla.meuProjetoWeb.database.UsuarioDAO;
import org.ufpb.projetoayla.meuProjetoWeb.model.Usuario;

public class UsuarioService {
	private static UsuarioDAO dao = new UsuarioDAO();
	
	public Usuario addUsuario(Usuario usuario){
		dao.save(usuario);
		return dao.findAll().get(dao.findAll().size()-1);
	}
	public List<Usuario> getAllUsuarios(){
		return dao.findAll();
	}
}
