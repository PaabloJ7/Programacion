package Tema05;
public class Actividad16 {
    public static void main(String[] args) {
            
        System.out.print("Introduzce un numero: ");
        int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
        boolean esPrimo = true;
        
        for (int i = 2; i < numeroIntroducido; i++) {
          if ((numeroIntroducido % i) == 0) {
            esPrimo = false;
          }
        }
            
        System.out.println("El número introducido" + (esPrimo ? "" : " no") + " es primo.");
    
      }
    }


