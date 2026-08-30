
public class Gerente extends FuncionarioCLT {
	
	public int tamanhoEquipe;
	private double percentualBonus;
	
	public Gerente (String nome, String matricula, double salarioBase, String dataAdmissao,
			int valeTransporte, int valeAlimentacao, 
			int tamanhoEquipe, double percentualBonus) {
		super (nome, matricula, salarioBase, dataAdmissao, valeTransporte, valeAlimentacao);
		this.tamanhoEquipe = tamanhoEquipe;
		this.percentualBonus = percentualBonus;	
	}	
		
	public double calcularBonus() {
		return getSalarioBase() * percentualBonus;
	}
	
	@Override	
	public double calcularSalario() {		
		return super.calcularSalario() + calcularBonus();
	}
	
	@Override
	public double calcularDesconto() {
		double desconto = super.calcularDesconto();
		if (tamanhoEquipe  > 10) {
			desconto += 100.00;
		}
		return desconto;
	}
	
	public double getPercentualBonus() {
		return percentualBonus;
	}

	public void setPercentualBonus(double percentualBonus) {
		this.percentualBonus = percentualBonus;
	}

	@Override
	public String toString() {		
		return super.toString() + String.format(" | Tamanho da Equipe: %d | Bônus: R$ %.2f",
	            tamanhoEquipe, calcularBonus());
	}
	
}
