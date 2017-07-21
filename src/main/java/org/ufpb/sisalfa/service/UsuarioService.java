package org.ufpb.sisalfa.service;

import java.util.List;

import org.ufpb.sisalfa.database.UsuarioDAO;
import org.ufpb.sisalfa.model.Usuario;

public class UsuarioService {
	private static UsuarioDAO dao = new UsuarioDAO();
	
	public void addUsuario(Usuario usuario){
		dao.save(usuario);
	}
	public List<Usuario> getAllUsuarios(){
		return dao.findAll();
	}
	public Usuario getUsuario(long id){
		return dao.getById(id);
	}
	public void deleteUser(long id){
		dao.delete(dao.getById(id));
	}
}
