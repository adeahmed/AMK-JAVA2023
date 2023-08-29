
public class Asiakas {
    private static int nextId = 1;
    private int id;
    private long aloitusaika, lopetusaika;

    public Asiakas() {
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
        Asiakas a1 = new Asiakas();
        Asiakas a2 = new Asiakas();
        Asiakas a3 = new Asiakas();

        a1.setAloitusaika(System.currentTimeMillis());
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a1.setLopetusaika(System.currentTimeMillis());

        a2.setAloitusaika(System.currentTimeMillis());
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a2.setLopetusaika(System.currentTimeMillis());

        a3.setAloitusaika(System.currentTimeMillis());
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a3.setLopetusaika(System.currentTimeMillis());

        System.out.println("Asiakkaan " + a1.getId() + " kulunut aika: " + a1.getKulunutAika() + " ms");
        System.out.println("Asiakkaan " + a2.getId() + " kulunut aika: " + a2.getKulunutAika() + " ms");
        System.out.println("Asiakkaan " + a3.getId() + " kulunut aika: " + a3.getKulunutAika() + " ms");
    }
}
