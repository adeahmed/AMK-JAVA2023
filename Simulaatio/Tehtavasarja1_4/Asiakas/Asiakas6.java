import java.util.LinkedList;

class Asiakas {
    private static int nextId = 1;
    private int id;
    private long aloitusaika, lopetusaika;

    public Asiakas() {
        this.id = nextId++;
        this.aloitusaika = System.currentTimeMillis(); // Set start time here
    }

    public int getId() {
        return id;
    }

    public  void setLopetusaika(long lopetusaika) {
        this.lopetusaika = lopetusaika;
    }
    public  long getLopetusaika() {
        return lopetusaika; 
    }
    public long getKulunutAika() {
        return lopetusaika - aloitusaika;
    }
}

class Palvelupiste {
    private LinkedList<Asiakas> jono = new LinkedList<>();

    public void lisaaJonoon(Asiakas a) {
        jono.add(a);
    }

    public Asiakas poistaJonosta() {
        if (!jono.isEmpty()) {
            return jono.remove();
        }
        return null;
    }

    public void palvele() {
        while (!jono.isEmpty()) {
            Asiakas asiakas = jono.peek();
            System.out.println("Palvelupiste palvelee asiakasta " + asiakas.getId());

            int palveluaika = (int) (Math.random() * 4) + 1; // Arvotaan palveluaika väliltä 1-4 sekuntia

            try {
                Thread.sleep(palveluaika * 1000); // Muutettu palveluaika sekunneiksi
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            Asiakas palveltava = poistaJonosta();
            palveltava.setLopetusaika(System.currentTimeMillis());
            long palvelunPaatymisaika = palveltava.getLopetusaika();
            System.out.println(
                    "Asiakas " + palveltava.getId() + " palveltu. Palvelun päättymisaika: " + palvelunPaatymisaika);

            System.out.println();
        }
    }

    public long getKeskimaaarainenAika() {
        long summaAjoista = 0;
        int asiakasMaara = 0;

        for (Asiakas asiakas : jono) {
            summaAjoista += asiakas.getKulunutAika();
            asiakasMaara++;
        }

        if (asiakasMaara > 0) {
            return summaAjoista / asiakasMaara;
        } else {
            return 0;
        }
    }
}

public class Asiakas6 {
    public static void main(String[] args) {
        Palvelupiste palvelupiste = new Palvelupiste();

        for (int i = 0; i < 5; i++) {
            palvelupiste.lisaaJonoon(new Asiakas());
        }

        palvelupiste.palvele();

        long keskimaaarainenAika = palvelupiste.getKeskimaaarainenAika();
        System.out.println("Keskimääräinen aika palvelupisteessä: " + keskimaaarainenAika + " ms");
    }
}
