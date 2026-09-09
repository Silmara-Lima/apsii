import java.util.ArrayList;
import java.util.List;

public class GerenteDeFiguras {

	private List<FiguraGeometrica> figuras;

	public GerenteDeFiguras() {
		figuras = new ArrayList<FiguraGeometrica>();
	}

	public void adicionaFigura(FiguraGeometrica figura) {
		this.figuras.add(figura);
	}

	public double calculaAreaTotalDeFiguras() {
		double areaTotal = 0;
		for (FiguraGeometrica figura : this.figuras) {
			areaTotal += figura.calculaArea();
		}
		return areaTotal;
	}

	public List<FiguraGeometrica> getFiguras() {
		return this.figuras;
	}

	public void imprimeFiguras() {
		for (FiguraGeometrica figura : this.figuras) {
			System.out.println(figura);
		}
	}

	public double getMaiorAreaDeFigura() {
		double maiorArea = 0;
		for (FiguraGeometrica figura : this.figuras) {
			if (figura.calculaArea() > maiorArea) {
				maiorArea = figura.calculaArea();
			}
		}
		return maiorArea;		
	
	}
}