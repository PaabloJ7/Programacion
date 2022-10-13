package Tema05;
public class Actividad13 {
    public static void main(String[] args) {
        System.out.println("Introduce 10 números enteros: ");
    
        int negativos = 0;
        int positivos = 0;
        
        for (int i = 0; i < 10; i++) {
          if (Integer.parseInt(System.console().readLine()) < 0) {
            negativos++;
          } else {
            positivos++;
          }
        }
        
        System.out.println("Son " + positivos + " positivos y " + negativos + " negativos.");
      }
    }