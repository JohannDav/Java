package vectores;
public class Vectores {
    public static void main(String[] args) {
        
        //Declaracion
        int vector [] = new int [4];
        
        //Asignacion (manual)
        
        vector[0] = 2;
        vector[1] = 35;
        vector[2] = 48;
        vector[3] = 157;
        
        //Recorrido
        
        for (int i = 0; i < vector.length; i ++){
            System.out.println("Estoy en el indice " + i);
            System.out.println("Tengo guardado un: " + vector [i]);
            System.out.println("----------------------------");
            
            /* EL for da esos valores debido a q i esta relacionado con
            el valor del indice "Los []", por ello se puede usar el [i]*/
        }
        
    }
}