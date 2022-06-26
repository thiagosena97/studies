import java.util.Scanner;

public class Uri1015 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        final Double x1 = scan.nextDouble();

        final Double y1 = scan.nextDouble();

        final Double x2 = scan.nextDouble();

        final Double y2 = scan.nextDouble();

        System.out.println(String.format("%.4f", Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2))));
    }
}
