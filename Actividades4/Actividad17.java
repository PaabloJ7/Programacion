
public class Actividad17 {
   public static void main(String[] args) {

    System.out.print("Introduce un número entero: ");
    int n = Integer.parseInt(System.console().readLine());

    System.out.println("La ultima cifra es: " + (n % 10));
  }
}