package ejercicio.condicionales;

import java.util.Scanner;

public class EjercicioCondicionales {
    public static void main(String[] args) {
        
        double sueldo = 0;
        int categoria;
        
        System.out.println("--CATEGORIAS--");
        System.out.println("1 Repositor");
        System.out.println("2 Cajero");
        System.out.println("3 Supervisor");
        
        System.out.println("Ingrese el NUMERO de la categoria del cual desea saber el sueldo");
        Scanner teclado = new Scanner (System.in);
        categoria = teclado.nextInt();
        
        if(categoria == 1){
            sueldo = 15890 + (15890 * 0.10);
        }
        else{
            if(categoria == 2){
                
                sueldo = 25630.89;
                
            }
            else {
                if(categoria == 3){
                    sueldo = 35560.20 - (35560.20 * 0.11);
                }
                else{
                    System.out.println("Ingrese una opcion válida");
                }
            }
        }
        if(categoria == 1 || categoria == 2 || categoria == 3){
        System.out.println("El suueldo para la categoria " +categoria + "es de: " + sueldo);
        }
    }
    
}
