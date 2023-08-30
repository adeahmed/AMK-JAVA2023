import java.util.PriorityQueue;
import java.util.Scanner;

public class Tapahtuma implements Comparable<Tapahtuma> {
    private static int seuraavaId = 1;
    final private int id;
    final private int tapahtumaAloitus;
    long aloitusAika, lopetusAika;

    public Tapahtuma(int aloitus) {
        this.id = seuraavaId++;
        this.aloitusAika = System.nanoTime();
        this.tapahtumaAloitus = aloitus;
    }

    @Override
    public int compareTo(Tapahtuma t) {
        return this.tapahtumaAloitus - t.tapahtumaAloitus;
    }

    public int haeTapahtumaAloitus() {
        return this.tapahtumaAloitus;
    }

    public int haeId() {
        return this.id;
    }

    public long haeAloitusAika() {
        return this.aloitusAika;
    }

    public void asetaLopetusAika(long aika) {
        this.lopetusAika = aika;
    }

    public long haeLopetusAika() {
        return this.lopetusAika;
    }

    public long haeAikaero() {
        return this.lopetusAika - this.aloitusAika;
    }

    public static void main(String[] args) {
        PriorityQueue<Tapahtuma> jono = new PriorityQueue<>();

        Scanner lukija = new Scanner(System.in);
        char vastaus;

        do {
            System.out.println("Valinnat:");
            System.out.println("1. Lisää tapahtuma");
            System.out.println("2. Poista tapahtuma");
            System.out.println("3. Poistu ohjelmasta\n");

            System.out.print("Valintasi: ");
            vastaus = lukija.next().charAt(0);

            if (vastaus == '1') {
                System.out.print("Syötä tapahtuman aloitusaika: ");
                int tapahtumaAloitus = lukija.nextInt();

                jono.add(new Tapahtuma(tapahtumaAloitus));
            } else if (vastaus == '2') {
                Tapahtuma tapahtuma = jono.poll();
                if (tapahtuma != null) {
                    System.out.printf("Poistettiin tapahtuma %d\n", tapahtuma.haeTapahtumaAloitus());
                }
            }
        } while (vastaus != '3');

        while (jono.size() > 0) {
            System.out.printf("Tapahtuma: %d\n", jono.poll().haeTapahtumaAloitus());
        }
        lukija.close();
    }

}
