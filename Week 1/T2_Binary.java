import java.util.Scanner;

public class T2_Binary {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Anna binääri (0 tai 1):");
        String binäri = sc.nextLine();
        if (binäri.matches("[01]+")) {
            int decimal = Integer.parseInt(binäri, 2);
            System.out.println("Decimal luku on  : " + decimal);
        } else {
            System.out.println("Syöte ei ole kelvollinen binääriluku.");
        }

    }
}
