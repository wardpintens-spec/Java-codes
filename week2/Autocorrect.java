package week2;
import java.util.Scanner;
public class Autocorrect {
    public static void main(String[]args){
        String woord1;
        String woord2;
        int afstand;
        int lengte1;
        int lengte2;
        int waarde;
        int som1 = 0;
        int som2 = 0;
        int x = 0;

        Scanner scan = new Scanner(System.in);

        System.out.print("Geef een woord: ");
        woord1 = scan.nextLine();
        lengte1 = woord1.length();

        System.out.print("Geef nog een woord: ");
        woord2 = scan.nextLine();
        lengte2 = woord2.length();

        while (x != lengte1){
            waarde = woord1.toUpperCase().charAt(x);
            som1 += waarde;
            x++;
        }
        x = 0;
        while (x != lengte2){
            waarde = woord2.toUpperCase().charAt(x);
            som2 += waarde;
            x++;
        }
        afstand = som2 - som1;
        System.out.println("De afstand tussen " + woord1 + " en " + woord2 + " is " + Math.abs(afstand) + ".");


    }
}
