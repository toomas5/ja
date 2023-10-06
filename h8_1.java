/*
 Toomas
 IT-22
 Ülesanne8.1
 */

import java.util.Scanner;

class h8_1{
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        System.out.print("Rööpküliku pindala (1) \nRistküliku pindala (2) \nKolmnurga pindala (3)\nTrapetsi pindala (4)\n" + //
                "Vali tegevus: "); 
        String valik = scanner.next();
        System.out.print("Sisesta alus: ");
        String alus = scanner.next();
        System.out.print("Sisesta kõrgus: ");
        String korgus = scanner.next();

        double s;
        switch (Integer.parseInt(valik)) {
        case 1:
        s = Pindalad.roopkylikS(alus, korgus);
        System.out.printf("Rööpküliku pindala on %.2f ",s);
        break;
        case 2:
        s = Pindalad.ristkylikS(alus, korgus);
        System.out.printf("Ristküliku pindala on %.2f ",s);
        break;
        case 3:
        s = Pindalad.kolmnurkS(alus, korgus);
        System.out.printf("Kolmnurga pindala on %.2f ",s);
        break;
        case 4:
        System.out.print("Sisesta külg: ");
        String kylg = scanner.next();
        s = Pindalad.trapetsS(alus, korgus, kylg);
        System.out.printf("trapetsi pindala on %.2f ",s);

        break;
        
        default:
        System.out.print("Valikust arusaamine ebaõnnestus!");
        break;
    }
}


public class Pindalad {
 public static double roopkylikS(String a, String h) {
 float alus = Float.parseFloat(a);
 float korgus = Float.parseFloat(h);
 double s = alus * korgus;
 return s;
 }
 
 public static double ristkylikS(String a, String h) {
 float alus = Float.parseFloat(a);
 float korgus = Float.parseFloat(h);
 double s = alus * korgus;
 return s;
 }
 
 public static double kolmnurkS(String a, String h) {
 float alus = Float.parseFloat(a);
 float korgus = Float.parseFloat(h);
 double s = alus * korgus/2;
 return s;
 }
public static double trapetsS(String a, String h, String b) {
 float alus = Float.parseFloat(a);
 float korgus = Float.parseFloat(h);
 float kylg = Float.parseFloat(b);
 double s = (alus + kylg)/2*korgus;
 return s;
 }
}
}