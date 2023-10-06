/*harjutus9
 Toomas
 IT-22
 iseseisev yl 19
 */

import java.util.Random;
import java.util.Scanner;

public class y3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int v1 = 0;
        int v2 = 0;

        while (true) {
            int t1 = random();
            int t2 = random();

            System.out.println("mängija vise " + t1);
            System.out.println("arvuti vise " + t2);
            System.out.println("----------------------------");

            if (t1 > t2) {
                System.out.println("mängija võitis");
                v1++;
            } else if (t1 < t2) {
                System.out.println("arvuti võitis");
                v2++;
            } else {
                System.out.println("viik");
            }
            System.out.println("============================");
            System.out.println("mängija võidud: " + v1);
            System.out.println("arvuti võidud: " + v2);
            System.out.println("============================");
            System.out.print("kas tahad jätkata? (jah/ei) ");
            String vs = scanner.next();

            if (!vs.equalsIgnoreCase("jah")) {
                break;
            }
        }

        if (v1 > v2) {
            System.out.println("mängija võitis");
        } else if (v1 < v2) {
            System.out.println("arvuti võitis");
        } else {
            System.out.println("viik");
        }
    }

    public static int random() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}