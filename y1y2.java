/*
 Toomas
 IT-22

-23 26 -19 -4 24

iseseisev yl 19 ja 4
 */

import java.util.Scanner;

class y1{
    public static void main(String[] args) {
        System.out.println("¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤\n¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤\n¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤\n¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤¤");
        System.out.println("==============================================\n==============================================\n==============================================\n==============================================");
        System.out.println("----------------------------------------------\n----------------------------------------------\n----------------------------------------------\n----------------------------------------------");

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta numbrid");
        int b = scanner.nextInt();
        String d = Integer.toBinaryString(b);
        System.out.println(d);
}
}
