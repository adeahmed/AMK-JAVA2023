import java.util.PriorityQueue;
import java.util.Scanner;

public class Tapahtuma2 implements Comparable<Tapahtuma2> {
    private static int seuraavaId = 1;
    final private int id;
    final private int tapahtumaAloitus;
    private TapahtumanTyyppi tapahtumaTyyppi;

    long aloitusAika, lopetusAika;

    public Tapahtuma2(int aloitus, TapahtumanTyyppi tyyppi) {
         this.id = seuraavaId++;
        this.aloitusAika = System.nanoTime();
        this.tapahtumaAloitus = aloitus;
        this.tapahtumaTyyppi = tyyppi;
    }

    public TapahtumanTyyppi haeTapahtumaTyyppi() {
        return tapahtumaTyyppi;
    }

    @Override
    public int compareTo(Tapahtuma2 e) {
        return this.tapahtumaAloitus - e.tapahtumaAloitus;
    }

    public static void main(String[] args) {
        PriorityQueue<Tapahtuma2> jono = new PriorityQueue<>();

        Scanner lukija = new Scanner(System.in);
        char vastaus;

        do {
            System.out.println("Valinnat:");
            System.out.println("1. Lisää tapahtuma");
            System.out.println("2. Poista tapahtuma");
            System.out.println("3. Lopeta sovellus\n");

            System.out.print("Valintasi: ");
            vastaus = lukija.next().charAt(0);

            if (vastaus == '1') {
                System.out.print("Syötä tapahtuman aloitusaika: ");
                int tapahtumaAloitus = lukija.nextInt();

                System.out.print("Syötä tapahtuman tyyppi (SAAPUMINEN, LÄHTÖ): ");
                String tapahtumaTyyppiStr = lukija.next();
                TapahtumanTyyppi tapahtumaTyyppi = TapahtumanTyyppi.valueOf(tapahtumaTyyppiStr);

                jono.add(new Tapahtuma2(tapahtumaAloitus, tapahtumaTyyppi));
            } else if (vastaus == '2') {
                Tapahtuma2 tapahtuma = jono.poll();
                if (tapahtuma != null) {
                    System.out.printf("Poistettiin tapahtuma %d, tyyppi: %s\n", tapahtuma.tapahtumaAloitus, tapahtuma.tapahtumaTyyppi);
                }
            }
        } while (vastaus != '3');

        while (!jono.isEmpty()) {
            Tapahtuma2 tapahtuma = jono.poll();
            System.out.printf("Tapahtuma: %d, tyyppi: %s\n", tapahtuma.tapahtumaAloitus, tapahtuma.tapahtumaTyyppi);
        }
        lukija.close();
    }
}

enum TapahtumanTyyppi {
    SAAPUMINEN, LÄHTÖ
}
