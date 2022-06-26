import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        final Double A = scan.nextDouble();

        final Double B = scan.nextDouble();

        final Double C = scan.nextDouble();

        System.out.println(String.format("TRIANGULO: %.3f", calculoAreaTriangulo(A, C)).replace(",","."));

        System.out.println(String.format("CIRCULO: %.3f", calculoAreaCirculo(C)).replace(",","."));

        System.out.println(String.format("TRAPEZIO: %.3f", calculoAreaTrapezio(A, B, C)).replace(",","."));

        System.out.println(String.format("QUADRADO: %.3f", calcularAreaQuadrado(B)).replace(",","."));

        System.out.println(String.format("RETNGULO: %.3f", calcularAreaRetangulo(A,B)).replace(",","."));
    }

    private static Double calcularAreaQuadrado(final Double lado) {

        return lado * lado;

    }

    private static Double calcularAreaRetangulo(final Double base, final Double altura) {

        return base * altura;

    }
    public static Double calculoAreaTriangulo(final Double base, final Double altura) {

        return (base * altura) / 2;

    }

    public static Double calculoAreaCirculo(final Double raio) {

        return 3.14159 * (raio * raio);

    }

    public static Double calculoAreaTrapezio(final Double baseMaior, final Double baseMenor, final Double altura) {

        return ((baseMaior + baseMenor) * altura) / 2;
    }
}
