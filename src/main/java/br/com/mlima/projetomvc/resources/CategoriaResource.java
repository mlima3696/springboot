package br.com.mlima.projetomvc.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.mlima.projetomvc.domain.Categoria;
import br.com.mlima.projetomvc.services.CategoriaService;

@RestController
@RequestMapping(value="/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaService categoriaService;

@RequestMapping(value="/{id}",method=RequestMethod.GET)
	public  ResponseEntity<?> find(@PathVariable Integer id) {
	
	Categoria cat = categoriaService.buscar(id);
	
	Categoria cat1 = new Categoria(1,"Informatica");
	Categoria cat2 = new Categoria(2,"Escritotio");
	
	List<Categoria> lista = new ArrayList<Categoria>();
	lista.add(cat1);
	lista.add(cat2);
	
		return ResponseEntity.ok().body(cat);
	}
}
