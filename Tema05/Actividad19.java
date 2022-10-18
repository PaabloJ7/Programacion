package Tema05;
public class Actividad19 {
    public static void main(String[] args) {
    
        System.out.print("Introduce la altura de la pirámide: ");
        int altura = Integer.parseInt(System.console().readLine());
    
        System.out.print("Introduce el relleno: ");
        String relleno = System.console().readLine();
        
        int planta = 1;
        int longitud = 1;
        int espacios = altura-1;
        
        while (planta <= altura) {
          
          for (int i = 1; i <= espacios; i++) {
            System.out.print(" ");
          }
    
          for (int i = 1; i <= longitud; i++) {
            System.out.print(relleno);
          }
    
          System.out.println();
    
          planta++;
          espacios--;
          longitud += 2;
        }
      }
    }
    
