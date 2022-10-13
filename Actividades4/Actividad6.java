public class Actividad6 {
  public static void main(String[] args) {

    System.out.println("Calculo del tiempo de caída de un objeto.");
    System.out.print("Introduce la altura desde donde cae el objeto: ");
    Double h = Double.parseDouble(System.console().readLine());

    final double g = 9.81; 
    double s = Math.sqrt(2*h/g);

    System.out.printf("El objeto tarda %.2f segundos en caer.\n", s);
    }
  }
