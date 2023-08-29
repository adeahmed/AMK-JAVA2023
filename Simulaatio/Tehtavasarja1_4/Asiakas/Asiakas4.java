import java.util.LinkedList;
import java.util.Scanner;

public class Asiakas4 {
    private static int nextId = 1;
    private int id;
    private long aloitusaika, lopetusaika;

    public Asiakas4() {
        this.id = nextId++;
    }

    public int getId() {
        return id;
    }

    public long getAloitusaika() {
        return aloitusaika;
    }

    public void setAloitusaika(long aloitusaika) {
        this.aloitusaika = aloitusaika;
    }

    public long getLopetusaika() {
        return lopetusaika;
    }

    public void setLopetusaika(long lopetusaika) {
        this.lopetusaika = lopetusaika;
    }

    public long getKulunutAika() {
        return lopetusaika - aloitusaika;
    }
    public static void main(String[] args) {
        LinkedList<Asiakas4> asiakasJono = new LinkedList<>();
        Scanner lukija = new Scanner(System.in);

        while (true) {
            System.out.println("Valitse toiminto: ");
            System.out.println("1. Lisää asiakas");
            System.out.println("2. Poista asiakas");
            System.out.println("3. Lopeta ohjelma");

            int valinta = lukija.nextInt();
            lukija.nextLine();

            if (valinta == 1) {
                Asiakas4 uusiAsiakas = new Asiakas4();
                uusiAsiakas.setAloitusaika(System.nanoTime());
                asiakasJono.add(uusiAsiakas);
                System.out.println("Asiakas lisätty jonoon.");
            } else if (valinta == 2) {
                if (!asiakasJono.isEmpty()) {
                    Asiakas4 poistettava = asiakasJono.remove();
                    poistettava.setLopetusaika(System.nanoTime());
                    long kulunutAika = poistettava.getLopetusaika() - poistettava.getAloitusaika();
                    System.out.println("Asiakkaan " + poistettava.getId() + " kulunut aika: " + kulunutAika + " ns");
                } else {
                    System.out.println("Jono on tyhjä.");
                }
            } else if (valinta == 3) {
                break;
            } else {
                System.out.println("Virheellinen valinta.");
            }
            lukija.close();
            
        }
        
    }
}
