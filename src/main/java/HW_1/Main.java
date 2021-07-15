package HW_1;

import java.util.Random;

public class Main {

    public static void main(String[] args) {

        Random random = new Random();
        Actions[] actions = new Actions[4];

        int distance = random.nextInt(10);
        int height = random.nextInt(10);
        actions[1] = new Human("Usain Bolt", distance, height);

        distance = random.nextInt(10);
        height = random.nextInt(10);
        actions[2] = new Robot("R2-D2", distance, height);

        distance = random.nextInt(10);
        height = random.nextInt(10);
        actions[3] = new Cat("Venus", distance, height);

        Barrier[] barriers = new Barrier[3];

        boolean isTrack;
        for (int i = 1; i < barriers.length; i++) {
            distance = random.nextInt(10);
            isTrack = random.nextBoolean();
            if (isTrack) {
                barriers[i] = new Track("" + i, distance);
            } else {
                barriers[i] = new Wall("" + i, distance);
            }
        }

        for (int i = 1; i < actions.length; i++) {
            boolean result = true;
            for (int j = 1; j < barriers.length; j++) {

                result = barriers[j].moving(actions[i]);

                if (!result) {
                    break;
                }
            }

            if (result) {
                System.out.println("Passes!!");
            } else {
                System.out.println("Leaves!!");
            }
        }
    }
}
