import java.util.Scanner;
import java.util.ArrayList;

public class T3_Duplicates {
    public static void main(String[] args) {
        ArrayList<Integer> taulukko = new ArrayList<>(); // Muista että muuttuja nimi lisätään ennen = merkkiä!!!
        ArrayList<Integer> tulosTaulukko = new ArrayList<>();
        Scanner lukija = new Scanner(System.in);
        System.out.print("Syötä taulukon koko: ");
        int luku = lukija.nextInt();
        for (int i = 0; i < luku; i++) {
            System.out.print("Anna kokonaisluku " + (i + 1) + ": ");
            taulukko.add(lukija.nextInt());
        }

        for (int lukuTulos : taulukko) {
            if (!tulosTaulukko.contains(lukuTulos)) {
                tulosTaulukko.add(lukuTulos);
            }
        }
        System.out.println("Taulukko ilman kaksoiskappaleita:");
        for (int lukuTulos : tulosTaulukko) {
            System.out.print(lukuTulos + " ");
        }
        lukija.close();
    }
}


