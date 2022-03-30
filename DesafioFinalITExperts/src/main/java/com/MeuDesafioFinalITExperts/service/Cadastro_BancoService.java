package com.MeuDesafioFinalITExperts.service;


import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.MeuDesafioFinalITExperts.model.Cadastro_Banco;
import com.MeuDesafioFinalITExperts.repository.Cadastro_BancoRepository;

@Service
public class Cadastro_BancoService { 
	@Autowired
	private Cadastro_BancoRepository cadastro_BancoRepository;
		
	public Cadastro_BancoService(Cadastro_BancoRepository cadastro_BancoRepository) {
		this.cadastro_BancoRepository = cadastro_BancoRepository;
	} 
	
	//lista
	
	public Page<Cadastro_Banco> findAll(Pageable pageable	){
		Page<Cadastro_Banco> list = cadastro_BancoRepository.findAll(pageable);
		return list;
	}
	
	public Cadastro_Banco getById(Long ID) { 
		Optional<Cadastro_Banco> cadastro_Banco = cadastro_BancoRepository.findById(ID);
		Cadastro_Banco CB = cadastro_Banco.orElseThrow(() -> new RuntimeException("Cadastro não Encontrado"));
		return  CB;
	}

	public Cadastro_Banco create (Cadastro_Banco cadastro_Banco) {
		Cadastro_Banco CB = new Cadastro_Banco();
		CB.setNome(cadastro_Banco.getNome());
		//CB.setSobrenome(cadastro_Banco.getSobrenome());
		CB.setAgenciacode(cadastro_Banco.getAgenciacode());
		CB.setNumeroconta(cadastro_Banco.getNumeroconta());
		CB.setDigito(cadastro_Banco.getDigito());
		CB.setIdregistro(cadastro_Banco.getIdregistro());

		
		cadastro_BancoRepository.save(CB);
		
		return CB; 
	}
		@Transactional
		public Cadastro_Banco update(Cadastro_Banco cadastro_Banco, Long ID) {
			//try { 
				Optional<Cadastro_Banco> CB = cadastro_BancoRepository.findById(ID);
				CB.get().setNome(cadastro_Banco.getNome());
				//CB.get().setSobrenome(cadastro_Banco.getSobrenome());
				CB.get().setAgenciacode(cadastro_Banco.getAgenciacode());
				CB.get().setNumeroconta(cadastro_Banco.getNumeroconta());
				CB.get().setDigito(cadastro_Banco.getDigito());
				CB.get().setIdregistro(cadastro_Banco.getIdregistro());
				
				cadastro_BancoRepository.save(CB.get());
				return CB.get();
		
			//} catch (EntityNotFoundException e ) {
			//	throw new RecursoNaoEncontradoException("ID : " + ID+ "não foi encontrado" );
		
			
		} 	  

		@Transactional
		public void delete(Long ID) throws Exception {
			try {
				cadastro_BancoRepository.deleteById(ID);
		
			} catch (EmptyResultDataAccessException e) {
				throw new Exception("ID : " + ID+ "não foi encontrado" );
			} catch (DataIntegrityViolationException e ) {
				throw new Exception("não fizo cadastro de erros");
	}
}


}



