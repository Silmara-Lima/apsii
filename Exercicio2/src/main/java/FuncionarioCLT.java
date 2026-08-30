
public class FuncionarioCLT extends Funcionario{
	
	protected double valeTransporte;
	
	protected double valeAlimentacao;
	
	public FuncionarioCLT (String nome, String matricula, double salarioBase, String dataAdmissao, 
			int valeTransporte, int valeAlimentacao) {
		super (nome, matricula, salarioBase, dataAdmissao);
		this.valeTransporte = valeTransporte;
		this.valeAlimentacao = valeAlimentacao;			
	}	 
	
	@Override	
	public String toString() { 
		double liquido = calcularSalario() - calcularDesconto() + 50.00 + valeTransporte + valeAlimentacao;
		return String.format( 
				"%s [%s] - Salário: R$ %.2f | Desconto: R$ %.2f  | Líquido: R$ %.2f | VA: R$%.2f | VT: R$%.2f ", 
				getNome(), getMatricula(), calcularSalario(), calcularDesconto(), 
				liquido, valeAlimentacao, valeTransporte);
			}

}
