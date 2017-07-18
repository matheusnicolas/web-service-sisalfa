package org.ufpb.sisalfa.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;

@Entity
@XmlRootElement
@Table(name = "desafio") 
public class Desafio extends AbstractEntity {
	@Column(nullable = false)
	private String palavra;
	@Column(nullable = false)
	private String imagem;
	@Column(nullable = false)
	private String som;
	@Column(nullable = false)
	private String video;
	
	@JoinColumn(nullable=false)
	@OneToOne(cascade={CascadeType.PERSIST},fetch=FetchType.LAZY)
	private Usuario usuario;
	
	@JoinColumn(nullable=false)
	@ManyToOne(cascade={CascadeType.ALL},fetch=FetchType.LAZY)
	private Contexto contexto;
	
	public String getPalavra() {
		return palavra;
	}
	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	public String getImagem() {
		return imagem;
	}
	public void setImagem(String imagem) {
		this.imagem = imagem;
	}
	public String getSom() {
		return som;
	}
	public void setSom(String som) {
		this.som = som;
	}
	public String getVideo() {
		return video;
	}
	public void setVideo(String video) {
		this.video = video;
	}
	public Usuario getUsuario() {
		return usuario;
	}
	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}
	public Contexto getContexto() {
		return contexto;
	}
	public void setContexto(Contexto contexto) {
		this.contexto = contexto;
	}
	
	
}
