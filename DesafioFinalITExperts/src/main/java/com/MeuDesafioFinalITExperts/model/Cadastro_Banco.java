	package com.MeuDesafioFinalITExperts.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "tabelacadastro")

public class Cadastro_Banco implements Serializable {

	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long ID;
	@NotEmpty
	@Column(name = "nome", length = 50)
	private String nome;
	
	//@Column(name = "sobrenome", length = 30)
	//private String Sobrenome;
	
	@Size(max=4)
	@Column(name = "agenciacode", length = 4)
	private String agenciacode;
	
	@Size(max=8)
	@Column(name = "numeroconta", length = 8)	
	private String numeroconta;
	
	@Column(name = "digito", length = 3)
	private String digito;
	
	@Column(name = "Idregistro", length = 20)
	private String Idregistro;
	
	
	public Cadastro_Banco() {
	}

	
	
	public Cadastro_Banco(Long iD, String nome, /*String sobrenome,*/ String agenciacode, String numeroconta, String digito, String Idregistro) {
		ID = iD;
		this.nome = nome;
		//this.Sobrenome = sobrenome;
		this.agenciacode = agenciacode;
		this.numeroconta = numeroconta;
		this.digito = digito;
		this.Idregistro = Idregistro;
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

	/*public String getSobrenome() {
		return Sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		Sobrenome = sobrenome;
	}

	*/
	public String getAgenciacode() {
		return agenciacode;
	}

	public void setAgenciacode(String agenciacode) {
		this.agenciacode = agenciacode;
	}

	public String getNumeroconta() {
		return numeroconta;
	}

	public void setNumeroconta(String numeroconta) {
		this.numeroconta = numeroconta;
	}

	public String getDigito() {
		return digito;
	}

	public void setDigito(String digito) {
		this.digito = digito;
	}

	public String getIdregistro() {
		return Idregistro;
	}

	public void setIdregistro(String idregistro) {
		Idregistro = idregistro;
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
