package Tema05;

public class Actividad15 {
    public static void main(String[] args) {
        System.out.print("Introduzca la base: ");
        int base = Integer.parseInt(System.console().readLine());

        System.out.print("Introduzca el exponente: ");
        int exponenteFinal = Integer.parseInt(System.console().readLine());
    

          for (int i = 1; i <= exponenteFinal; i++){

            int potencia = i;
            int exponente = 1;

              for (int n = 0; n < exponente; n++){
                potencia *= base;
              }
              System.out.println(base + "^" + i + " = " + potencia);
         }
    } 
}
