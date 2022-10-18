package Tema05;

public class Actividad25 {
    public static void main(String[] args) {

        System.out.print("Introduce un número entero: ");
        int numeroIntroducido = Integer.parseInt(System.console().readLine());
    
        int numero = numeroIntroducido;
        int volteado = 0;
        
        while (numero > 0) {
          volteado = (volteado * 10) + (numero % 10);
          numero /= 10;
        } 
        
        System.out.print("Si le damos la vuelta al " + numeroIntroducido);
        System.out.println(" Nos da " + volteado + ".");
      }
    }   

