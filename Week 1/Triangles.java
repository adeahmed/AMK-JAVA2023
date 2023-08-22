import java.util.Scanner;

public class Triangles {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("ANNA NUMERO ");
        int a = scanner.nextInt();
        System.out.println("ANNA NUMERO ");
        int b = scanner.nextInt();
        double c;
        c = Math.sqrt(a * a + b * b);
        System.out.printf(" %.2f Hypotenuusa on ", c);

    }
}