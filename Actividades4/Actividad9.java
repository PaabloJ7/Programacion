
import java.util.Scanner;

public class Actividad9 {

    public static void main(String[] args) {

        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Resolucion de ecuacion de 2o grado");
            System.out.println("ax^2 + bx + c = 0");

            System.out.print("valor de a =");
            double a = s.nextDouble();
            System.out.print("valor de b =");
            double b = s.nextDouble();
            System.out.print("valor de c =");
            double c = s.nextDouble();

            if ( (a==0) && (b==0) && (c==0)) {
                System.out.println("Infinitas soluciones");
            }

          
            if ( (a==0) && (b==0) && (c!=0)) {
                System.out.println("No tiene solucion");
            }

        
            if ( (a!=0) && (b!=0) && (c==0)) {
                System.out.println("x1 = 0");
                System.out.println("x2 = -b/a");
            }

            
            if ( (a!=0) && (b!=0) && (c!=0)) {
                double discriminante = b*b - (4 * a * c);
                if (discriminante < 0)
                    System.out.println("La solucion no es real");
                else {
                    System.out.println("x1 = " + (-b + Math.sqrt(discriminante)) / (2 *a));
                    System.out.println("x2 = " + (-b - Math.sqrt(discriminante)) / (2 *a));
                }

            }
        }

    }
}
