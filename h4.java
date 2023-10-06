/*
 Toomas
 IT-22
 Ülesanne4
 */

import java.util.Scanner;

class h4{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Sisesta teksti");
        String tekst = scanner.nextLine();
        String[] tykel = tekst.split(" ");
        String es = tykel[0];
        String[] tyty = tekst.split("\\s+");
        var s = tekst.split(" ")[0];

        System.out.println('"' + tekst.toUpperCase() + '"');
        System.out.println("Märkide arv on " + tekst.length());
        System.out.println("Sõnade arv on " + tyty.length);
        System.out.printf("Esimene sõna on %s", es);
    }
}