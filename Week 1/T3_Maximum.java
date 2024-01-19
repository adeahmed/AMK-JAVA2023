import java.util.Scanner;
import java.util.ArrayList;

public class T3_Maximum {
    public static void main(String[] args) {
        Scanner lukija = new Scanner(System.in);
        ArrayList<Integer> taulukko = new ArrayList<>();
        int maxSum = Integer.MIN_VALUE;
        int starttiIndex = 0;
        int endIndex = 0;

        System.out.print("Syötä taulukon kokonaislukujen lukumäärä: ");
        int n = lukija.nextInt();

        System.out.println("Syötä kokonaisluvut taulukkoon:");

        for (int i = 0; i < n; i++) {
            taulukko.add(lukija.nextInt());// -> Suoraan taulu...

        }

        for (int i = 0; i < n; i++) {
            int currentSum = 0;
            for (int j = i; j < n; j++) {
                currentSum += taulukko.get(j);
                if (currentSum > maxSum) {
                    maxSum = currentSum;
                    starttiIndex = i;
                    endIndex = j;
                }
            }
        }
        System.out.println(taulukko); // alkiot
        System.out.println("Suurin summa: " + maxSum);
        System.out.println("Alitaulukon indeksit: " + (starttiIndex + 1) + " - " + (endIndex + 1));


    }
}

