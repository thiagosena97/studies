import java.util.Scanner;

public class Uri1020 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int dias = s.nextInt();
        int ano = dias / 365;
        dias -= ano * 365;
        int mes = dias / 30;
        dias -= mes * 30;
        int dia = dias;
        System.out.println(String.format("%s ano(s)", ano));
        System.out.println(String.format("%s mes(es)", mes));
        System.out.println(String.format("%s dia(s)", dias));
    }
}
