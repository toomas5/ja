/*
 Toomas
 IT-22
 Ülesanne5
 */

import java.util.Scanner;

class h5{

    static int midagi(int a, int b){
        if (0 >= a) {
            System.out.println("Esimene number peab olema positiivne");
        }

        if (0 > b) {
            System.out.println("Teine number peab olema positiivne");
        }

        return a/b;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta kaks numbrit");
        int y = scanner.nextInt();
        int ka = scanner.nextInt();

        int taimer = 0;
        while (taimer < 3){
            if (y >= 0 && ka > 0){
            taimer++;
            System.out.println(midagi(y,ka));
            }
            else {
                System.out.println(midagi(y,ka));
                System.exit(0);
            }
        }        
    }
}
