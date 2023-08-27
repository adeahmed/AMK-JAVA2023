import java.util.Scanner;
import java.util.Random;

public class T3_Name {
    public static void main(String[] taulukko) {
        Random random = new Random();
        Scanner lukija = new Scanner(System.in);
        String[] etunimi = { "Lionel", "Cristiano", "Neymar", "Kylian", "Mohamed", "Ade" };
        String[] sukunimi = { "Messi", "Ronaldo", "Mbappé", "Salah", "Hazard", "Ahmed" };
        System.out.println("Anna luku:0 - " + (etunimi.length - 1));
        int indeksiEtu = lukija.nextInt();
        System.out.println("Anna luku:0 - " + (sukunimi.length - 1));
        int indeksiSuku = lukija.nextInt();

        if (indeksiEtu >= 0 && indeksiEtu < etunimi.length && indeksiSuku >= 0 && indeksiSuku < sukunimi.length) {
            String nimi = etunimi[indeksiEtu] + " " + sukunimi[indeksiSuku];
            System.out.println("Generoitu nimi: " + nimi);

        } else {
            System.out.println();
        }
        lukija.close();

    }
}
