
public class ProgramaDasFiguras {

	public static void main(String[] args) {
		GerenteDeFiguras gerente = new GerenteDeFiguras();
		Triangulo t1 = new Triangulo(2.0, 3.0);
		Losango l1 = new Losango (3.5, 1.8);
		Losango l2 = new Losango (2.6, 3.2);
		
		gerente.adicionaFigura(t1);
		gerente.adicionaFigura(l1);
		gerente.adicionaFigura(l2);
	
		double areaTotal = gerente.calculaAreaTotalDeFiguras();
		System.out.println("\nÁrea total de todas as figuras: " + areaTotal);
	}
}
