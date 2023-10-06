/*
 Toomas
 IT-22
 Ülesanne6
 */

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class h6 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> a = new ArrayList<>();

        while (true) {
            System.out.print("täisarvud: (tühi lõpetab)");
            String sisend = scanner.nextLine();
            if (sisend.isEmpty()) {
                break;
            }
            try {
                a.add(Integer.parseInt(sisend));
            } catch (NumberFormatException e) {
                System.out.println("peab olema täisarv");
            }
        }

        if (!a.isEmpty()) {
            int s = a.stream().mapToInt(Integer::intValue).sum();
            double k = a.stream().mapToInt(Integer::intValue).average().orElse(0.0);
            try (PrintWriter kk = new PrintWriter("andmed.txt")) {
                kk.println("Sisestatud arvud:");
                a.forEach(kk::println);
                kk.println("summa: " + s);
                kk.println("keskmine: " + k);
                System.out.println("salvestatud");
            } catch (IOException e) {
                System.out.println("viga");
            }
        } else {
            System.out.println("pole arve");
        }
    }
}
