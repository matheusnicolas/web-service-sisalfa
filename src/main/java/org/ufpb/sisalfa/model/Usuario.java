package org.ufpb.sisalfa.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
@Entity
@XmlRootElement
@Table(name = "usuario") 
public class Usuario extends AbstractEntity {
	@Column(nullable = false)
	private String nome;
	@Column(name="data_entrada",nullable=false)
	private Date dataEntrada;
	@Column(nullable = false)
	private boolean status;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Date getDataEntrada() {
		return dataEntrada;
	}
	public void setDataEntrada(Date dataEntrada) {
		this.dataEntrada = dataEntrada;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	
}
