// Realizar un programa que permite el intercambio de valores entre dos variables.
//Por ejemplo: Si una variable número vale 35, y una variable número dos vale 20,
//realizar las acciones necesarias para que número pase a valer 20 Y número dos 
//pase a valer 35. Una vez realizado el cambio mostrar resultado por pantalla.
package ejercicios.de.lógica;
public class EjerciciosDeLógica {
    public static void main(String[] args) {
        
        int num1 = 35;
        int num2 = 20;
        int aux;
        
        System.out.println("--ANTES--");
        System.out.println("Num1: " +num1);
        System.out.println("Num2: " +num2);
        
        aux = num2;
        //Valor de b pasa a A
        //num2 y aux = 20
        num2 = num1;
        // num2 = 35
        
        //Hasta ahora aux=20 , n2 = 35 , num1 = 35
        
        //Necesitamos pasar el valor de aux a n1 "valor de b = a
        num1 = aux;
        
        
        
        
        
        
        System.out.println("--DESPUES--");
        System.out.println("Num1: " + num1);
        System.out.println("num2: " +num2);
        
    }
    
}
