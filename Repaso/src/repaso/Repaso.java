package repaso;
public class Repaso {
    public static void main(String[] args) {
        
        int i = 0;
        
        while(i <= 10){
            System.out.println("Vuelta con while numero: " + i);
            i = i + 1;
        }
        // AHORA CON FOR
        
        for(int cont = 0; cont <= 10; cont ++){
            System.out.println("Vuelta con for numero: " + cont);
        }
        
    }
}