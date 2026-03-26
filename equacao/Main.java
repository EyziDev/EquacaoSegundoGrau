package programas.novas.equacao;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);

        System.out.print("Digite o valor de a: ");
        double a = leitor.nextDouble();

        if (a == 0) {
            System.out.println("Nao e uma equacao de segundo grau.");
        } else {
            System.out.print("Digite o valor de b: ");
            double b = leitor.nextDouble();
            System.out.print("Digite o valor de c: ");
            double c = leitor.nextDouble();

            Equacao eq = new Equacao(a, b, c);
            double delta = eq.calcularDelta();

            System.out.println("Delta: " + delta);

            if (delta < 0) {
                System.out.println("Nao existem raizes reais.");
            } else if (delta == 0) {
                System.out.println("Raiz unica: " + eq.getRaiz1());
            } else {
                System.out.println("x1: " + eq.getRaiz1());
                System.out.println("x2: " + eq.getRaiz2());
            }
        }
    }
}
