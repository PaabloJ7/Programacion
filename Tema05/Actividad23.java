package Tema05;

public class Actividad23 {
    public static void main(String[] args) {

  System.out.println("introduce números:");
        
    int numeroIntroducido;
    int suma = 0;
    int numeroDeElementos = 0;
        
      
    do {
     numeroIntroducido = Integer.parseInt(System.console().readLine());
     suma += numeroIntroducido;
     numeroDeElementos++;
    } while (suma <= 10000);
        
        System.out.println("Ha introducido un total de " + numeroDeElementos + " números");
        System.out.println("La suma es " + suma);
        System.out.println("La media es " + suma / numeroDeElementos);
        
     } 
 }   
