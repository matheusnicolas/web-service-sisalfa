package org.ufpb.projetoayla.meuProjetoWeb.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Palavra {

	private long id;
	private String palavra;
	private String nivel;
	private Date created;
	private String author;
	
	public Palavra(long id, String palavra, String nivel, String author){
		this.id = id;
		this.palavra = palavra;
		this.nivel = nivel;
		this.author = author;
		this.created = new Date();
	}
	
	public Palavra(){
		
	}
	
	public long getId() {
		return id;
	}
	
	public void setId(long id) {
		this.id = id;
	}
	
	public String getPalavra() {
		return palavra;
	}
	
	public void setPalavra(String palavra) {
		this.palavra = palavra;
	}
	
	public String getNivel(){
		return nivel;
	}
	
	public void setNivel(String nivel){
		this.nivel = nivel;
	}
	
	public Date getCreated() {
		return created;
	}
	
	public void setCreated(Date created) {
		this.created = created;
	}
	
	public String getAuthor() {
		return author;
	}
	
	public void setAuthor(String author) {
		this.author = author;
	}
}
