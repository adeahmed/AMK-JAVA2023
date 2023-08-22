
import java.util.Scanner;

public class Task3 {
   public static void main(String[] args) {
      Scanner scanner = new Scanner(System.in);
      System.out.println("ANNA NUMERO ");
      int eka = Integer.valueOf(scanner.nextLine());
      //int eka = scanner.nextInt();
      System.out.println("ANNA NUMERO ");
      int toka = Integer.valueOf(scanner.nextLine());
      //int toka = scanner.nextInt();
      System.out.println("ANNA NUMERO ");
      int kolmas = Integer.valueOf(scanner.nextLine());
     // int kolmas = scanner.nextInt();
      double avg = eka + toka + kolmas;
      System.out.println("Summa Nr= " + (eka + toka + kolmas));
      System.out.println("Summa Tuote = " + (eka * toka * kolmas));
      System.out.println("Summa avg = " + (avg / 3));
      scanner.close();
   }
}

