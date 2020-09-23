function mostrartarefasAFazer(){
	tarefasFeitas('');
	tarefasAFazer('none');
}

function mostrartarefasFeitas(){
	tarefasFeitas('none');
	tarefasAFazer('');
}
function mostrarTodas(){
	tarefasFeitas('');
	tarefasAFazer('');
}


//Função que esconde todos os lementos que não foram feitos
function tarefasFeitas(display){
	var tarefasNFeitas = document.querySelectorAll('.checkTarefa:not(:checked)');

	for (var i = 0; i < tarefasNFeitas.length; i++) {
		tarefasNFeitas[i].parentElement.parentElement.style.display =display;
	}
}

//Função que esconde todos os lementos que foram feitos
function tarefasAFazer(display){
	var tarefasFeitas = document.querySelectorAll('.checkTarefa:checked');

	for (var i = 0; i < tarefasFeitas.length; i++) {
		tarefasFeitas[i].parentElement.parentElement.style.display =display;
	}
}

