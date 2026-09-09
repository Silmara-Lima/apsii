
public class Triangulo implements FiguraGeometrica{
	
	private double base;
	private double altura;
	
	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	public Triangulo (double base, double altura) {
		this.base = base;
		this.altura = altura;
		}
	
	public double calculaArea(){
		return (this.base*this.altura/2);
	}
	
	public String getNomeFigura(){
		return "Triângulo";
	}
	
	@Override
	public String toString() { double
		area = calculaArea();
		return String.format( "A área do triângulo é: ", area);
			}

}
