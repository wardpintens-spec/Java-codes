package Les_oefeningen;

public class Week7_1 {
    static void main() {
        String zin = "Java leer je niet in een twee drie";

        String[] woorden = zin.split(" ");

        for (String woord : woorden){
            System.out.println(woord);
        }


    }
}
