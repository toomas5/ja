/*
 Toomas
 IT-22
 Ülesanne8.2
 */

import java.util.Scanner;

public class h8_2 {

    public static void main(String[] args) {
        h821 kiisu = new h821("Mart", 35, "töötu", "eesti");
        kiisu.tüüp();
        kiisu.nimi();
        kiisu.vanus();
        kiisu.riik();
        System.out.println("");
        ;
        h822 arb = new h822("tööl", "Aruba", "avamerel", "ülejäänud meeskonnaga");
        arb.mis();
        arb.kus();
        arb.millel();
        arb.kellega();

    }

}