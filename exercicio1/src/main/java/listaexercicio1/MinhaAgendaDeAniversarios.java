package listaexercicio1;

import java.util.ArrayList;

public class MinhaAgendaDeAniversarios implements AgendaDeAniversarios {
	
	private ArrayList<Aniversariante> aniversariantes;
	
	public MinhaAgendaDeAniversarios() {
		this.aniversariantes = new ArrayList<Aniversariante>();
	}
	
	@Override
	public void adicionarAniversariante(String nome, int dia, int mes) {
		Aniversariante novoAniversariante = new Aniversariante (nome, dia, mes);
		this.aniversariantes.add(novoAniversariante);
	}
	
	@Override
	public ArrayList<String> obterAniversariantesDoDia(int dia, int mes) {
		ArrayList<String> resultado = new ArrayList<String>();
		for (Aniversariante aniversariante : this.aniversariantes) {
			if (aniversariante.eAniversarianteDoDia(dia, mes)) {
				resultado.add(aniversariante.getNome());
			}
		}
		return resultado;
	}
	
	@Override
	public void editarDataAniversario(String nome, int novoDia, int novoMes) {
		for (Aniversariante aniversariante : this.aniversariantes) {
			if(aniversariante.getNome().equals(nome)) {
				aniversariante.setDataAniversario(new DataAniversario(novoDia, novoMes));
			}
		}
	}

	@Override
	public void removerAniversariante(String nome) {
		for (int i = this.aniversariantes.size() - 1; i>= 0; i--) {
			if(this.aniversariantes.get(i).getNome().equals(nome)) {
				this.aniversariantes.remove(i);
			}
		}
		
	}
}
