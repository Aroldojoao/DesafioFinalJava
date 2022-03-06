	package com.MeuDesafioFinalITExperts.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.print.attribute.standard.MediaSize.Other;

import org.hibernate.loader.custom.Return;

@Entity
@Table(name = "TabelaCadastro")

public class Cadastro_Banco implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	@Column(length = 30)
	private String nome;
	@Column(length = 40)
	private String Sobrenome;
	//@Column(length = 4)
	private int agenciacode;
	//@Column(length = 8)
	private int numeroconta;
	//@Column(length = 3)
	private char digito;
	
	public Cadastro_Banco() {
	}

	
	
	public Cadastro_Banco(Long iD, String nome, String sobrenome, int agenciacode, int numeroconta, char digito) {
		super();
		ID = iD;
		this.nome = nome;
		Sobrenome = sobrenome;
		this.agenciacode = agenciacode;
		this.numeroconta = numeroconta;
		this.digito = digito;
	}
	
	
	public Long getID() {
		return ID;
	}
	
	public void setID(Long iD) {
		ID = iD;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return Sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}

	
	public int getAgenciacode() {
		return agenciacode;
	}

	public void setAgenciacode(int agenciacode) {
		this.agenciacode = agenciacode;
	}

	public int getNumeroconta() {
		return numeroconta;
	}

	public void setNumeroconta(int numeroconta) {
		this.numeroconta = numeroconta;
	}

	public char getDigito() {
		return digito;
	}

	public void setDigito(char digito) {
		this.digito = digito;
	}



	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;		
		result = prime * result + ((ID == null) ? 0 : ID.hashCode());
		return result;
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cadastro_Banco other = (Cadastro_Banco) obj;
		if (ID == null) {
			if (other.ID != null) {
				return false; 
		} else if (!ID.equals(other.ID))
			return false;
					return true;		
		}
		
		
		return Objects.equals(ID, other.ID);
	}

	


	
	
	
	
	
	
	/*
	@Override
	public int hashCode() {
		return Objects.hash(ID);
	}


	
	

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cadastro_Banco other = (Cadastro_Banco) obj;
		return ID == other.ID;
	}
*/	
	
	
	
	
}
