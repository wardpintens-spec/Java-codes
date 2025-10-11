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
    public static String limieten(double procent1, double procent2, int HHR, int rusthartslag){
        double limiet1 = (HHR * procent1) + rusthartslag;
        double limiet2 = (HHR * procent2) + rusthartslag;
        return "Limieten hartslag: tussen "+ (int) limiet1 +" en " + (int) limiet2;

    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String antwoord;
        String klaar;
        int rusthartslag = 0;
        int maxhartslag;
        int HHR = 0;
        int keuze;
        boolean kenHHR = true;
        do {
            System.out.print("Ken je je HHR? ");
            antwoord = scan.nextLine();

            if (antwoord.toLowerCase().charAt(0) == 'j') {
                System.out.print("Wat is je HHR? ");
                HHR = scan.nextInt();
                scan.nextLine();
            }
            else {
                kenHHR = false;
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

        if (!kenHHR){HHR = maxhartslag - rusthartslag;}

        System.out.println("Uw HHR is " + HHR + ".");

        do{
            System.out.print("In welke zone wilt u trainen (1-5): ");
            keuze = scan.nextInt();
        } while (keuze < 1 || keuze > 5);

        String workout = switch (keuze){
            case 1 -> limieten(0.5, 0.6, HHR, rusthartslag);
            case 2-> limieten(0.6, 0.7, HHR, rusthartslag);
            case 3-> limieten(0.7, 0.8, HHR, rusthartslag);
            case 4-> limieten(0.8, 0.9, HHR, rusthartslag);
            case 5-> limieten(0.9, 1, HHR, rusthartslag);
            default -> "";
        };
        System.out.println(workout);
    }
}
