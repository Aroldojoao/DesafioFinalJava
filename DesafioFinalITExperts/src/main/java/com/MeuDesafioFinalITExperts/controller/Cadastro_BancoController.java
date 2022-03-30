package com.MeuDesafioFinalITExperts.controller;

import java.net.URI;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.MeuDesafioFinalITExperts.model.Cadastro_Banco;
import com.MeuDesafioFinalITExperts.service.Cadastro_BancoService;

@RestController
@RequestMapping("api/v1/aroBancos")

public class Cadastro_BancoController {
	
	private final Cadastro_BancoService cadastro_BancoService;
	
	public Cadastro_BancoController(Cadastro_BancoService cadastro_BancoService) {
		this.cadastro_BancoService = cadastro_BancoService;
	}
	
	@GetMapping
	public ResponseEntity<Page<Cadastro_Banco>> getAll(Pageable pageable){
		Page<Cadastro_Banco> listaCadastro_banco = cadastro_BancoService.findAll(pageable);
		return ResponseEntity.ok().body(listaCadastro_banco);
	}
	
	
	@GetMapping("/{ID}")
	public ResponseEntity<Cadastro_Banco> getById(@PathVariable Long ID) {
		Cadastro_Banco cadastro_Banco = cadastro_BancoService.getById(ID);
		return ResponseEntity.ok(cadastro_Banco);
		
	}
	
		
	@PostMapping
	
	public ResponseEntity<Cadastro_Banco> create(@RequestBody Cadastro_Banco cadastro_Banco){
		Cadastro_Banco CB = cadastro_BancoService.create(cadastro_Banco);
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{}")
				.buildAndExpand(CB.getID()).toUri();
		return ResponseEntity.created(location).body(CB);
	}
	
	@PutMapping("/{ID}")
	public ResponseEntity<Cadastro_Banco> update(@RequestBody Cadastro_Banco cadastro_Banco, @PathVariable Long ID){
		cadastro_Banco = cadastro_BancoService.update(cadastro_Banco, ID);
		//return ResponseEntity.noContent().build();
		return ResponseEntity.ok().body(cadastro_Banco);
	}
	
	@DeleteMapping("/{ID}")
	
	public ResponseEntity<Cadastro_Banco> delete(@PathVariable Long ID) throws Exception{
		cadastro_BancoService.delete(ID);
		return ResponseEntity.noContent().build();
	}
	
}
