
import java.util.Random;
import java.util.Scanner;

public class T2_Multiplication {
    public static void main(String[] lol) {
        Random random = new Random();
        Scanner lukija = new Scanner(System.in);
        int pisteet = 0;
        boolean uusPeli = true;

        while (uusPeli) {
            pisteet = 0;
            for (int KysymysNr = 1; KysymysNr <= 10; KysymysNr++) { // Muista ain määritellä for silmukassa mikä tyyppi
                                                                    // aluksi!!
                int luku1 = random.nextInt(10) + 1; // tähän perää voin kanssa laittaa
                int luku2 = random.nextInt(10) + 1;
                int oikeeVastaus = luku1 * luku2;
                System.out.println("Kysymys " + KysymysNr + ": Paljonko on " + luku1 + " * " + luku2 + "?");
                System.out.println(KysymysNr);
                int Vastaus = lukija.nextInt();
                if (Vastaus == oikeeVastaus) {
                    System.out.println("Oikein!");
                    pisteet++;
                } else {
                    System.out.println("Väärin!! Tsemii:D");
                }

            }
            System.out.println("Pisteet:" + pisteet + "/10");
            if (pisteet == 10 && pisteet >= 10) {
                System.out.println("Hyvä! Hallitset kertotaulukot");
                uusPeli = true;
            } else {
                System.out.println("Uusiks meni! Tarvitset lisää harjoitusta");
                pisteet = 0;
            }
        }

    }

}
