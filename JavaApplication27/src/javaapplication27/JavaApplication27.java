package javaapplication27;

import java.util.Scanner;

public class JavaApplication27 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        double num1, num2, num3;
        int operacion;
        
        System.out.println("Teclea el primer numero");
        Scanner teclado = new Scanner (System.in);
        num1 = teclado.nextDouble();
        
        System.out.println("teclea el numero correspondiente a la operacion por realizar");
        System.out.println("1 Suma");
        System.out.println("2 Resta");
        operacion = teclado.nextByte();
        
        System.out.println("Teclea el otro numero");
        num2 = teclado.nextByte();
        
        if (operacion == 1){
            num3 = num1 + num2;
            System.out.println("EL resultado de: " + num1 + " + " + num2 + " = " + num3);
        }
        else {
            num3 = num1 - num2;
            System.out.println("EL resultado de: " + num1 + " - " + num2 + " = " + num3);
        }
        
    }
    
}
