
import java.util.Scanner;

public class T1_Quadratic {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Anna nro a: ");
        double a = in.nextDouble();
        System.out.println("Anna nro b: ");
        double b = in.nextDouble();
        System.out.println("Anna nro c: ");
        double c = in.nextDouble();
        double d = b * b - 4.0 * a * c;
        System.out.println(d);
         if (d > 0.0) {
            double r1 = (-b + Math.pow(d, 0.5)) / (2.0 * a);
            double r2 = (-b - Math.pow(d, 0.5)) / (2.0 * a);
            System.out.println("Roots are " + r1 + " and " + r2);
        } else if (d == 0.0) {
            double r1 = -b / (2.0 * a);
            System.out.println("Root is " + r1);
        } else {
            System.out.println("Roots are not real.");
        }
        in.close();
    }
}


