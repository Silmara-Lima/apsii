
public class Estagiario extends Funcionario {
	
	private double valorBolsaAuxilio;
	public int cargaHorariaSemanal;
	
	public Estagiario (String nome, String matricula, double salarioBase, String dataAdmissao, 
			int valorBolsaAuxilio, int cargaHorariaSemanal) {
		super (nome, matricula, salarioBase, dataAdmissao);
		this.valorBolsaAuxilio = valorBolsaAuxilio;
		this.cargaHorariaSemanal = cargaHorariaSemanal;		
	}
	
	@Override	
	public double calcularSalario() {
		return valorBolsaAuxilio;
	}	
	
	@Override
	public double calcularDesconto() {
		return 0.0;
	}	

}
