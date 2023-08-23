
import java.util.Scanner;

public class Obsolete {

    public static void main(String[] args) {
        double paino;

        Scanner lukija = new Scanner(System.in);
        System.out.println("Anna paino grammoissa");
        paino = lukija.nextInt();

        double luodit = paino / 13.28;
        double naulat = luodit / 32;
        double leiviskat = naulat / 20;
        double leiviskat1 = leiviskat - (int) leiviskat;

        double naulat1 = leiviskat1 * 20;
        double naulat2 = naulat1 - (int) naulat1;
        double luodit1 = naulat2 * 32;
        System.out.printf((int) paino + " g on " + (int) leiviskat + " leiviskä, " + (int) naulat1
        + " naulaa, ja %.2f luotia", luodit1);
        lukija.close();
    }
}