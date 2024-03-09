package ejerciciovec;

import java.util.Scanner;

public class EjercicioVec {
    public static void main(String[] args) {
        
        /* Realizar un programa que permita cargar 15 números en un vector. Una vez
        cargados, se necesita que el programa cuente e informe por pantalla cuantas
        veces se cargo el numero 3*/
        int vector [] = new int [15];
        Scanner teclado = new Scanner (System.in);
        
        //Carga del vector
        for(int i = 0; i < 15; i ++){
            vector[i] = teclado.nextInt();
            
        }
        //Recorrido y contar numer 3 
        int cont = 0;
        
        for(int i = 0; i < 15; i ++){
            if (vector[i] == 3){
                cont = cont + 1;
            }
        }
        System.out.println("La cantidad de numer 3 que hay son: " + cont);
        
    }
    
}
