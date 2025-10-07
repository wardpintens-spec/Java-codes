package projects;
import java.util.Scanner;
import java.util.Random;
public class Blackjack {

    static String[] cardGenerator(){
        Random random = new Random();

        String[] symbols = {"♠", "♥", "♦", "♣"};
        String[] numbers = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "J", "D", "K"};

        String symbol = symbols[random.nextInt(0, 4)];

        String number = numbers[random.nextInt(0, 13)];

        String[] card;

        if (number.equals("10")){
            card = new String[]{
                    " ------- ",
                    "|"+number+"     |",
                    "|   "+symbol+"   |",
                    "|     "+number+"|",
                    " ------- "};
        }
        else {card = new String[]{
                " ------- ",
                "|"+number+"      |",
                "|   "+symbol+"   |",
                "|      "+number+"|",
                " ------- "};
        }
        sum(number);
        return card;
    }
    static int sum = 0;
    static void sum(String numberString){
        int number = switch (numberString){
            case "1" -> 1;
            case "2" -> 2;
            case "3" -> 3;
            case "4" -> 4;
            case "5" -> 5;
            case "6" -> 6;
            case "7" -> 7;
            case "8" -> 8;
            case "9" -> 9;
            case "10", "J", "D", "K" -> 10;
            default -> 0;
        };
        sum += number;

    }

    public static void main(String[] args) {

    boolean playing = true;


        String[] kaart = cardGenerator();
        String[] kaart2 = cardGenerator();
        String[] kaart3 = cardGenerator();


        for (int i = 0; i < 5; i++){
            System.out.println(kaart[i] + " " + kaart2[i]);

        }
        System.out.print("Hit or stand? ");
        System.out.print("Hit, stand or double? ");
        System.out.println();
        for (int i = 0; i < 5; i++){
            System.out.println(kaart[i] + " " + kaart2[i] + " " + kaart3[i]);
        }
        System.out.println("You have " + sum);
    }
}
