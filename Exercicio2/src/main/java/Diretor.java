
public class Diretor extends Gerente {
	
	private double participacaoLucros;
	
	public Diretor (String nome, String matricula, double salarioBase, String dataAdmissao,
			int valeTransporte, int valeAlimentacao, 
			int tamanhoEquipe, double percentualBonus,
			double participacaoLucros) {
		super (nome, matricula, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao,
				tamanhoEquipe, percentualBonus);
		this.participacaoLucros = participacaoLucros;
	}
	
	public double getParticipacaoLucros() {
		return participacaoLucros;
	}

	public void setParticipacaoLucros(double participacaoLucros) {
		this.participacaoLucros = participacaoLucros;
	}

	@Override
	public double calcularSalario() {
		return super.calcularSalario() + participacaoLucros;
	}
	
	@Override
	public String toString() {		
		return super.toString() + String.format(" | Participação dos lucros: %.2f",
				participacaoLucros);
	}
	

}
