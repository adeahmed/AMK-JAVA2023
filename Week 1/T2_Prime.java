
import java.util.Scanner;

public class T2_Prime {

    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        System.out.println("Syötä alku:");
        int start = lukija.nextInt();
        System.out.println("Syötä loppu:");
        int end = lukija.nextInt();
        if (start >= end) {
            System.out.println("Error: Alku tulee olla pienempi kuin loppu ");
        } else if (start <= 1) {
            System.out.println("Error Alku < 1!  ");
        } else {
            for (int i = start; i <= end; i++) {
                boolean isPrime = true;
                for (int j = 2; j <= i - 1; j++) {
                    if (i % j == 0) {
                        isPrime = false;

                    }
                }
                if (isPrime) {
                    System.out.println(i);
                 // System.out.printf("%02d", i); testi forma tulostus 
                }
            }

        }

    }
}