package Week6.Studentencijfer_evaluator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String antwoord = "ja";
        do {


            Student student = null;
            boolean verder = false;
            do {
                System.out.print("Geef de naam van de student: ");
                String naam = scan.nextLine();

                System.out.print("Geef de ID van de student: ");
                int id = scan.nextInt();

                System.out.print("Geef het cijfer van de student (0-100): ");
                double cijfer = scan.nextDouble();
                scan.nextLine();

                student = new Student(naam, id, cijfer);
                verder = student.isCorrect();

            } while (!verder);

            System.out.println("Resultaten worden berekend...");
            System.out.println(3);
            System.out.println(2);
            System.out.println(1);
            System.out.println("-------------------");
            System.out.println("Studenteninformatie");
            System.out.println("-------------------");
            System.out.println("Naam:    : " + student.getNaam());
            System.out.println("ID       : " + student.getId());
            System.out.println("Cijfer   : " + student.getCijfer());
            System.out.println("Prestatie: " + student.getPrestatieCategorie());
            System.out.println();

            do {
                System.out.print("Wil je nog een student invoeren? (ja/nee): ");
                antwoord = scan.nextLine().strip();
            } while (!antwoord.equalsIgnoreCase("ja") && !antwoord.equalsIgnoreCase("nee"));

        }while (antwoord.equalsIgnoreCase("ja"));
        System.out.println();
        System.out.println("Het programma is beëndigd. Tot ziens!");
    }
}
