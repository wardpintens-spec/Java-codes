package week2;

public class ASCII_tabel {
    public static void main(String[] args) {
        int perRij = 6;
        int rij = 0;
        int waarde = 32;

        while (waarde <= 383) {
            while (rij != perRij) {
                System.out.print((char) waarde + "(" + waarde + ") ");
                rij++;
                waarde++;
            }
            rij = 0;
            System.out.print("\n");
        }
    }
}
