package br.com.esig.teste.tarefa;

import javax.annotation.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.springframework.beans.factory.annotation.Autowired;

@ManagedBean
@ViewScoped
public class TarefaController {
	
	@Autowired
	private TarefaRepository tarefaRepository;
	
	private Tarefa novaTarefa = new Tarefa();
	
	public void salvar() {
		tarefaRepository.save(novaTarefa);
	}

	public Tarefa getNovaTarefa() {
		return novaTarefa;
	}

	public void setNovaTarefa(Tarefa novaTarefa) {
		this.novaTarefa = novaTarefa;
	}
	
	
}
