package Tema05;

public class Actividad9 {
    public static void main(String[] args) {
        System.out.print("Introduce un numero: ");
        long numero  = Long.parseLong(System.console().readLine());
        
        long n = numero ;
        int numeroDeDigitos = 1;
        
        while (n > 10) {
          numeroDeDigitos++;
          n /= 10;
        }
        
        System.out.println(numero  + " tiene " + numeroDeDigitos + " dígitos.");
      }
    }