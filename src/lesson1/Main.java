package lesson1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        SuperJumpable[] superJumpables = new SuperJumpable[3];

        int distance = random.nextInt(10);
        int heigth = random.nextInt(10);
        superJumpables[0] = new Human(" Fry ", distance, heigth);

        distance = random.nextInt(10);
        heigth = random.nextInt(10);
        superJumpables[1] = new Robot (" Bender ", distance, heigth);

        distance = random.nextInt(10);
        heigth = random.nextInt(10);
        superJumpables[2] = new Cat (" Barsik ", distance, heigth);

        Barrier[] barriers = new Barrier[6];
        boolean isTreadmill;
        for (int i = 0; i < barriers.length; i++) {
            distance = random.nextInt(10);
            isTreadmill = random.nextBoolean();
            if (isTreadmill) {
                barriers[i] = new Treadmill("Treadmill " + i, distance);
            }else {
                barriers[i] = new Wall("Wall " + i, heigth);
            }
        }
        for (int i = 0; i < superJumpables.length; i++) {
            boolean result = true;
            for (int j = 0; j < barriers.length; j++) {
                result = barriers[j].moving(superJumpables[i]);
                if (!result) {
                    break;
                }
            }
            if (result) {
                System.out.println("Success!!!");
            } else {
                System.out.println("unsuccessfuly!!!");
            }
        }
    }
}