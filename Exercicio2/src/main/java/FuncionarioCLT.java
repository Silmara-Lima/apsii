
public class FuncionarioCLT extends Funcionario{
	
	protected int valeTransporte;
	
	protected int valeAlimentacao;
	
	public FuncionarioCLT (String nome, String matricula, double salarioBase, 
			String dataAdmissao, int valeTransporte, int valeAlimentacao) {
		super (nome, matricula, salarioBase, dataAdmissao);
		this.valeTransporte = valeTransporte;
		this.valeAlimentacao = valeAlimentacao;			
	}	
	
	Funcionario f1 = new Funcionario("Ana Costa", "F001", 2500.0, "01/03/2020");
    String nomeDoFuncionario = f1.getNome();
    String matriculaDoFuncionario = f1.getMatricula();
	 
	
	@Override	
	public String toString() { double
		liquido = calcularSalario() - calcularDesconto() + 50.00 + valeTransporte + valeAlimentacao;
		return String.format( "%s [%s] - Salário: R$ %.2f | Desconto: R$ %.2f | Líquido: R$ %.2f", nomeDoFuncionario, matriculaDoFuncionario,
			calcularSalario(), calcularDesconto(), liquido );
			}

}
