package br.com.mlima.projetomvc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.mlima.projetomvc.domain.Categoria;
import br.com.mlima.projetomvc.repositories.CategoriaRepository;
import br.com.mlima.projetomvc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository categoriaRepository;
	
	public Categoria buscar(Integer id) {
		Optional<Categoria> categoria = categoriaRepository.findById(id);
		
		return categoria.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto nao encontrado! Id: " + id + ", Tipo: " + Categoria.class.getName()));
	}
}
