import java.util.Scanner;

public class Uri1019 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        final int segundos =  scan.nextInt();
        int horas = segundos / 3600;
        int minutosHora = (segundos - (horas * 3600)) / 60;
        int segundosHora = segundos - (horas * 3600) - (minutosHora * 60);
        System.out.println(String.format("%s:%s:%s", horas, minutosHora,segundosHora));
    }
}
