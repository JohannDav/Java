package operadorternario;

import java.util.Scanner;

public class OperadorTernario {
    public static void main(String[] args) {
        
        double promedio;
        String condicionFinal;
        
        Scanner teclado = new Scanner (System.in);
        
        System.out.println("Ingrese el promedio del alumno");
        promedio = teclado.nextDouble(); // En "nextdouble" el double es el tipo de dato o variable
        
        condicionFinal = promedio >= 6 ? "Aprobado": "Desaprobado";
        
        System.out.println("El promedio es: " + condicionFinal);
    }
    
}
