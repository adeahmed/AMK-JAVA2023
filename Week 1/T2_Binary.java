import java.util.Scanner;

public class T2_Binary {
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println(“anna binääri“);
String binary=sc.nextLine();
int decimal=Integer.parseInt(binary,2);
System.out.println(“Decimal version is : “+decimal);
}
}
