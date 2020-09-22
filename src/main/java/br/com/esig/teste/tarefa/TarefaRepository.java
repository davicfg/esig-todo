package br.com.esig.teste.tarefa;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface TarefaRepository extends CrudRepository<Tarefa, Long>{
	
	@Query("select t from Tarefa t order by t.estado")
	public List<Tarefa> buscarTodos();
}
