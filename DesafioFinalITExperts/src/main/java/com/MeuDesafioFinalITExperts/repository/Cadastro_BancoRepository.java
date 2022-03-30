package com.MeuDesafioFinalITExperts.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.MeuDesafioFinalITExperts.model.Cadastro_Banco;

@Repository
public interface Cadastro_BancoRepository extends JpaRepository<Cadastro_Banco, Long>{


//public interface Cadastro_BancoRepository extends JpaRepository<Cadastro_Banco, Long>{

}
