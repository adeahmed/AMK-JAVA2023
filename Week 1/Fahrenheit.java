
import java.util.Scanner;

public class Fahrenheit {
  public static void main(String[] args) {
    Scanner lukija = new Scanner(System.in);
    double celsius, fahrenheit;
    System.out.printf("anna celsius asteet ");
    celsius = lukija.nextDouble();
    fahrenheit = 1.8 * celsius + 32;
    System.out.printf("" + celsius + " celcius  astetta on %.1f fahrenheit-astetta",
        fahrenheit);
    // System.out.println(fahrenheit);
    lukija.close();
  }

  }
