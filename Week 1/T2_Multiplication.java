
import java.util.Random;
import java.util.Scanner;


public class T2_Multiplication {
    public static void main(String[]lol){
        Random random = new Random();
        Scanner lukija  = new Scanner(System.in);
        int pisteet = 0;
       
        int luku1 = random.nextInt(10) + 1;
        int luku2 = random.nextInt(10)+ 1;
        System.out.println("Kysymys " + luku1 + ": Paljonko on " + luku1 + " * " + luku2 + "?");
        int oikeeVastaus = luku1 *luku2;
        
        System.out.println("Vastaus tähän -->:  ");
        int Vastaus = lukija.nextInt();
        if(Vastaus == oikeeVastaus){
            System.out.println("Oikein!");
            pisteet++;
        }else{
            System.out.println("Väärin!! Tsemii:D");
        }
    }

    
}
