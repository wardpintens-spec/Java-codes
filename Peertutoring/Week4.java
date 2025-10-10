package Peertutoring;
import java.util.Scanner;

public class Week4 {
    public static void aftellen(){
        System.out.println("Start");
        for (int i = 15; i > 0; i--){
            System.out.println(i);

            try {
                Thread.sleep(1000); // 1 seconde wachten (1000 ms)
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println("Stop");

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String antwoord;
        String klaar;
        int rusthartslag = 0;
        int maxhartslag;
        int HHR;
        int keuze;
        do {
            System.out.print("Ken je je HHR? ");
            antwoord = scan.nextLine();

            if (antwoord.toLowerCase().charAt(0) == 'j') {
                System.out.print("Wat is je HHR? ");
                HHR = scan.nextInt();
            }

        }while ((antwoord.toLowerCase().charAt(0) != 'j') && (antwoord.toLowerCase().charAt(0) != 'n'));

        do {
            System.out.print("Ken je je rusthartslag? ");
            antwoord = scan.nextLine();

            if (antwoord.toLowerCase().charAt(0) == 'j') {
                System.out.print("Wat is je rusthartslag? ");
                rusthartslag = scan.nextInt();
                scan.nextLine();
            }

            else if (antwoord.toLowerCase().charAt(0) == 'n') {
                System.out.println("Ga even rustig zitten en adem 10x diep in en uit.");
                System.out.println("Tell je hartslagen gedurende 15s.");
                do{
                System.out.print("Indien je klaar bent typ je \"ok\". ");
                klaar = scan.nextLine();

                }while (!klaar.equalsIgnoreCase("ok"));

                aftellen();

                System.out.print("Geef het aantal slagen: ");
                rusthartslag = scan.nextInt() * 4;
                scan.nextLine();
            }

        }while ((antwoord.toLowerCase().charAt(0) != 'j') && (antwoord.toLowerCase().charAt(0) != 'n'));

        System.out.println("We gaan nu je maximale hartslag meten.");
        System.out.println("""
                Interval 1: Ren 30 seconden op volle snelheid.
                Herstelperiode 1: Rust 60 seconden.
                Interval 2: Ren 30 seconden op volle snelheid.
                Herstelperiode 2: Rust 60 seconden.
                Interval 3: Ren 60 seconden op volle snelheid.""");

        do{
            System.out.println();
            System.out.print("Indien je klaar bent typ je \"ok\". ");
            klaar = scan.nextLine();

        }while (!klaar.equalsIgnoreCase("ok"));

        aftellen();

        System.out.print("Geef het aantal slagen: ");
        maxhartslag = scan.nextInt() * 4;

        HHR = maxhartslag - rusthartslag;
        System.out.println("Uw HHR is " + HHR + ".");

        System.out.print("In welke zone wilt u trainen (1-5): ");
        keuze = scan.nextInt();


    }
}
