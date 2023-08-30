import java.util.LinkedList;

public class Asiakas5 {
    private static int nextId = 1;

    static class Asiakas {
        private int id;
        private long aloitusaika;

        public Asiakas() {
            this.id = nextId++;
            this.aloitusaika = System.currentTimeMillis();
        }

        public int getId() {
            return id;
        }
    }

    static class Palvelupiste {
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

                int palveluaika = (int) (Math.random() * 4) + 1;

                try {
                    Thread.sleep(palveluaika * 1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

                Asiakas palveltava = poistaJonosta();
                long palvelunPaatymisaika = System.currentTimeMillis() / 1000;
                System.out.println(
                        "Asiakas " + palveltava.getId() + " palveltu. Palvelun päättymisaika: " + palvelunPaatymisaika);

                System.out.println();
            }
        }
    }

    public static void main(String[] args) {
        Palvelupiste palvelupiste = new Palvelupiste();

        for (int i = 0; i < 5; i++) {
            palvelupiste.lisaaJonoon(new Asiakas());
        }

        palvelupiste.palvele();
    }
}
