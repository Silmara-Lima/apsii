package listaexercicio1;

public class Aniversariante {
	
	private String nome;
	private DataAniversario dataAniversario;
	
	
	public Aniversariante (String nome, int dia, int mes) {
		this.setNome(nome);
		this.setDataAniversario(new DataAniversario (dia, mes));
	}
	
	public Aniversariante (String nome, DataAniversario dataAniversario) {
		this.setNome(nome);
		this.setDataAniversario(dataAniversario);
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public DataAniversario getDataAniversario() {
		return dataAniversario;
	}

	public void setDataAniversario(DataAniversario dataAniversario) {
		this.dataAniversario = dataAniversario;
	}

	public boolean eAniversarianteDoDia (int dia, int mes) {
		return this.dataAniversario.getDia() == dia
				&& this.dataAniversario.getMes() == mes;
	}
	
	
	@Override	
	public boolean equals (Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null || getClass() != obj.getClass()) {
			return false;
		}
		Aniversariante outro = (Aniversariante) obj;
		return this.nome.equals(outro.nome)
				&& this.dataAniversario.equals(outro.dataAniversario);
	}
	
	@Override  //ao invés de procurar linha por linha do equals, o hashCode vai na "prateleira" (encontra e organiza rápido)
	public int hashCode() {
		return 31 * nome.hashCode() + dataAniversario.hashCode();
	}		
}
