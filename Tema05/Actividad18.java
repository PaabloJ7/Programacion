package Tema05;
public class Actividad18 {
    public static void main(String[] args) {
    
        int primerNumero;
        int segundoNumero;
        
        do {
          System.out.print("Introduzce un número: ");
          primerNumero = Integer.parseInt(System.console().readLine());
          System.out.print("Introduce otro número distinto: ");
          segundoNumero = Integer.parseInt(System.console().readLine());
          
          if(primerNumero == segundoNumero) {
            System.out.print("Los números introducidos no son válidos, ");
            System.out.println("deben ser distintos.");
          }
        } while (primerNumero == segundoNumero);
        
        if (primerNumero > segundoNumero) {
          int aux = primerNumero;
          primerNumero = segundoNumero;
          segundoNumero = aux;
        }
        
        for(int i = primerNumero; i <= segundoNumero; i += 7) {
          System.out.print(i + " ");
        }
        
        System.out.println();
      }
    }

