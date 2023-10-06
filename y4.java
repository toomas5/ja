/*harjutus9
 Toomas
 IT-22
 iseseisev yl 19
 */

import java.util.Random;
import java.util.Scanner;

public class y4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int v1 = 0;
        int v2 = 0;

        while (true) {
            int t1 = random();
            int t2 = random();

            System.out.print("arva nr (1-6)\n");
            int a = scanner.nextInt();
            System.out.print("mängija nr = " + a + "\n");
            System.out.print("arvuti nr = " + t2 + "\n");
            System.out.println("----------------------------");

            if (a == t2) {
                System.out.println("mängija võitis");
                v1++;
            } else{
                System.out.println("arvuti võitis");
                v2++;
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
        }
    }

    public static int random() {
        Random random = new Random();
        return random.nextInt(6) + 1;
    }
}