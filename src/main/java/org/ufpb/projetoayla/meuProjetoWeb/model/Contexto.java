package org.ufpb.projetoayla.meuProjetoWeb.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Contexto {

	private long id;
	private String palavra;
	private String imagem;
	private String audio;
	private String id_usuario;
	private Date created;
	
	public Contexto(long id, String palavra, String imagem, String audio, String id_usuario){
		this.id = id;
		this.palavra = palavra;
		this.imagem = imagem;
		this.audio = audio;
		this.id_usuario = id_usuario;
	}
	
	public Contexto(){
		
	}

	public long getId() {
		return this.id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getPalavra() {
		return this.palavra;
	}

	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}

	public String getImagem() {
		return this.imagem;
	}

	public void setImagem(String imagem) {
		this.imagem = imagem;
	}

	public String getAudio() {
		return this.audio;
	}

	public void setAudio(String audio) {
		this.audio = audio;
	}

	public String getId_usuario() {
		return this.id_usuario;
	}

	public void setId_usuario(String id_usuario) {
		this.id_usuario = id_usuario;
	}

	public Date getCreated() {
		return this.created;
	}

	public void setCreated(Date created) {
		this.created = created;
	}
}
