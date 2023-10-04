package condicionales.anidados;
public class CondicionalesAnidados {
    public static void main(String[] args) {
        
        int num1 = 9;
        int num2 = 9;
        
        if (num2 > num1){
            System.out.println("N2 es mayor que N1");
        }
        else {
            if (num1 == num2){
                System.out.println("Son iguales");
            }
            else {
                System.out.println("N1 es mayor a N2");
            }
        }
    }
}