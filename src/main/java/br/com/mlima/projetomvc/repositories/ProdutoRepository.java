package br.com.mlima.projetomvc.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.mlima.projetomvc.domain.Produto;

@Repository
public interface  ProdutoRepository  extends JpaRepository<Produto, Integer>{

}

