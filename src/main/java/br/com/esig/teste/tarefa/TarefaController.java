package br.com.esig.teste.tarefa;

import java.util.List;

import javax.annotation.ManagedBean;
import javax.annotation.PostConstruct;
import javax.faces.bean.ViewScoped;

import org.hibernate.type.descriptor.sql.NVarcharTypeDescriptor;
import org.springframework.beans.factory.annotation.Autowired;

@ManagedBean
@ViewScoped
public class TarefaController {

	@Autowired
	private TarefaRepository tarefaRepository;

	private List<Tarefa> tarefas;

	private Tarefa novaTarefa = new Tarefa();

	@PostConstruct
	public void init() {
		setTarefas(tarefaRepository.buscarTodos());
	}

	public void salvar() {
		tarefaRepository.save(novaTarefa);
		novaTarefa = new Tarefa();
		
		tarefas.clear();
		setTarefas(tarefaRepository.buscarTodos());
	}

	public Tarefa getNovaTarefa() {
		return novaTarefa;
	}

	public void setNovaTarefa(Tarefa novaTarefa) {
		this.novaTarefa = novaTarefa;
	}

	public List<Tarefa> getTarefas() {
		return tarefas;
	}

	public void setTarefas(List<Tarefa> tarefas) {
		this.tarefas = tarefas;
	}

}
