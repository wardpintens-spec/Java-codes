package week4.Dungeons_and_dragons;

import java.util.Random;
import java.util.Scanner;

public class Dungeons_and_dragons {
    public static int gooi(int zijden){
        Random random = new Random();
        int waarde;
        waarde = random.nextInt(1,zijden);

        return waarde;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Geef aantal zijden: ");
        int zijden = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < 5; i++) {
            System.out.print("Druk op <enter> om een waarde te creëren");
            scan.nextLine();
            System.out.println(gooi(zijden));
        }
        System.out.println("Klaar.");


    }
}
