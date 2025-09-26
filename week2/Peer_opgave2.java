package week2;
import java.util.Scanner;

public class Peer_opgave2 {
    private static int ja = 0;

    static void vraag(String zin){
        Scanner scan = new Scanner(System.in);
        String antwoord;

        do {System.out.print(zin);
            antwoord = scan.nextLine();

        }while (!(antwoord.toLowerCase().strip()).equals("ja") && !(antwoord.toLowerCase().strip()).equals("nee"));
        if (antwoord.equals("ja")){
            ja++;
        }
    }

    public static void main(String[] args) {

        String zin1 = "Het laatste wat ik doe -voor ’s avonds het licht" +
                " uit gaat- is nog snel even kijken of er nog iets aan " +
                "berichten, enz is binnengekomen op mijn smartphone: ";

        String zin2 = "Het eerste wat ik doe -al ’s morgens het licht aangaat- " +
                        "is kijken of er berichten, enz zijn binnengekomen op mijn smartphone: ";



        vraag(zin1);
        vraag(zin2);
        System.out.println(ja);

        switch (ja){
            case 0 -> System.out.println("Je bent niet digitaal verslaafd. Houden zo!");

            case 1,2 -> System.out.println("Je hebt een milde vorm van digitale verslaving.");

            case 3, 4, 5 -> System.out.println("Je hebt een niet te onderschatten vorm van digitale verslaving. Leg jezelf wat beperkingen op.");

            case 6, 7, 8 -> System.out.println("Je hebt een ernstige vorm van digitale verslaving. Overweeg om een digitale detox-cursus te volgen!");

            default -> System.out.println("Je hebt een extreme vorm van digitale verslaving. Je hebt waarschijnlijk professionele hulp nodig!");
        }

    }



}
