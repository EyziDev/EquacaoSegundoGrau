package programas.novas.equacao;

public class Equacao {
    private double a;
    private double b;
    private double c;

    public Equacao(double a, double b, double c) {
        if (a == 0) {
            throw new IllegalArgumentException("O coeficiente 'a' não pode ser zero.");
        }
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public double calcularDelta() {
        return Math.pow(b, 2) - (4 * a * c);
    }

    public double getRaiz1() {
        double delta = calcularDelta();
        if (delta < 0) return Double.NaN;
        return (-b + Math.sqrt(delta)) / (2 * a);
    }

    public double getRaiz2() {
        double delta = calcularDelta();
        if (delta < 0) return Double.NaN;
        return (-b - Math.sqrt(delta)) / (2 * a);
    }

    public double getA() { return a; }
    public double getB() { return b; }
    public double getC() { return c; }
}