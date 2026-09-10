public class Losango implements FiguraGeometrica {

    private double diagonal1;
    private double diagonal2;

    public Losango(double diagonal1, double diagonal2) {
        this.diagonal1 = diagonal1;
        this.diagonal2 = diagonal2;
    }

    public double getDiagonal1() {
		return diagonal1;
	}

	public void setDiagonal1(double diagonal1) {
		this.diagonal1 = diagonal1;
	}

	public double getDiagonal2() {
		return diagonal2;
	}

	public void setDiagonal2(double diagonal2) {
		this.diagonal2 = diagonal2;
	}

	public double calculaArea() {
        return (this.diagonal1 * this.diagonal2) / 2;
    }

    public String getNomeFigura() {
        return "Losango";
    }

    @Override
    public String toString() {
        return String.format("A área do losango é: %.2f", calculaArea());
    }
}