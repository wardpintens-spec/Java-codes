package week4.Dungeons_and_dragons;

import java.util.Random;

public class Dungeons_and_dragons {
    public static int gooi(int zijden){
        Random random = new Random();
        int waarde;
        waarde = random.nextInt(1,zijden);

        return waarde;
    }

    public static void main(String[] args) {

    }
}
