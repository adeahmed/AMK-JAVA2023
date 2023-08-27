
public class Asiakas {
    private static int nextId = 1;
    private int id;
    private long startTime, endTime;

    public Asiakas() {
        System.out.println(nextId);
        this.id = nextId++;
    }
    // Aseta asiakkaan aloitusaika
    public void aloitaAsiointi() {
        startTime = System.currentTimeMillis();
    }

    // Aseta asiakkaan lopetusaika
    public void lopetaAsiointi() {
        endTime = System.currentTimeMillis();
    }

    // Metodi kulutetun ajan laskemiseen
    public long getKulunutAika() {
        return endTime - startTime;
    }

    public static void main(String[] args) {
        System.out.println("Load");

        Asiakas a1 = new Asiakas();
        // Asiakas a2 = new Asiakas();
        Asiakas a3 = new Asiakas();

        // Asetetaan aloitus- ja lopetusaika a1:lle ja a3:lle
        a1.aloitaAsiointi();
        // Simuloidaan 5 sekunnin kulunutta aikaa
        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a1.lopetaAsiointi();

        a3.aloitaAsiointi();
        // Simuloidaan 7 sekunnin kulunutta aikaa
        try {
            Thread.sleep(7000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        a3.lopetaAsiointi();

        System.out.println("Asiakkaan " + a1.id + " kulunut aika: " + a1.getKulunutAika() + " ms");
        System.out.println("Asiakkaan " + a3.id + " kulunut aika: " + a3.getKulunutAika() + " ms");
        
    }
}
