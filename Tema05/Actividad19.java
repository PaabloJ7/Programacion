public class Actividad19 {
    public static void main(String[] args) {
        System.out.print("Introduce la altura: ");
        int h = Integer.parseInt(System.console().readLine());
        System.out.print("Introduce el caracter: ");
        String car = System.console().readLine();
        for (int fila = 0; fila < h; ++fila) {
          for (int col = 0; col < h-fila-1; ++col) {
            System.out.print(" ");
          }
          for (int col = 0; col < 2*fila+1; ++col) {
            System.out.print(car);
          }
          System.out.println();
        }
      }
}
