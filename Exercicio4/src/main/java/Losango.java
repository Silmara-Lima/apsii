public class Losango implements FiguraGeometrica {

    private double diagonalMaior;
    private double diagonalMenor;

    public Losango(double diagonalMaior, double diagonalMenor) {
        this.diagonalMaior = diagonalMaior;
        this.diagonalMenor = diagonalMenor;
    }

    public double calculaArea() {
        return (this.diagonalMaior * this.diagonalMenor) / 2;
    }

    public String getNomeFigura() {
        return "Losango";
    }

    @Override
    public String toString() {
        return String.format("A área do losango é: %.2f", calculaArea());
    }
}