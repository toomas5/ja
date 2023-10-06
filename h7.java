/*
 Toomas
 IT-22
 Ülesanne7
 */

import java.util.Scanner;

class h7{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true){
        try {
        System.out.println("Sisesta kaks numbrit");
        int y = scanner.nextInt();
        int b = scanner.nextInt();
        if(y == 0 || b == 0){
        System.out.println("Nulliga ei saa jagada" + "\n");  
        
            }
            else{
            
            int g = (y*b)/(y*b);
            System.out.println(g);
            break;
            }
        
        } catch (ArithmeticException  e) {
        throw new  ArithmeticException("Nulliga ei saa jagada");
        }
    }
}
    
}

