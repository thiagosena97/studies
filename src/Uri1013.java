import java.util.Scanner;

/**
 * Faça um programa que leia três valores e apresente o maior dos três valores lidos seguido da mensagem “eh o maior”. Utilize a fórmula:
 *
 * Obs.: a fórmula apenas calcula o maior entre os dois primeiros (a e b). Um segundo passo, portanto é necessário para chegar no resultado esperado.
 *
 * Entrada
 * O arquivo de entrada contém três valores inteiros.
 *
 * Saída
 * Imprima o maior dos três valores seguido por um espaço e a mensagem "eh o maior".
 *
 * Exemplos de Entrada	Exemplos de Saída
 * 7 14 106
 *
 * 106 eh o maior
 */
public class Uri1013 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int valorA = scanner.nextInt();

        final int valorB = scanner.nextInt();

        final int valorC = scanner.nextInt();

       if(valorA > valorB && valorA > valorC) {

           printarResultado(valorA);

       } else if(valorB > valorC) {

           printarResultado(valorB);

       }else {

           printarResultado(valorC);

       }

    }

    private static void printarResultado(final int valor) {

        System.out.println(String.format("%s eh o maior", valor));

    }

}
