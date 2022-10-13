package Tema05;

public class Actividad10 {
    public static void main(String[] args) {
        double numeros = 0;
        double numero  = 0;
        double suma = 0;

        System.out.println("Para parar, introduzca un número negativo.");
        System.out.println("Vaya introduciendo números:");

        while (numero   >= 0) {
            numero   = Double.parseDouble(System.console().readLine());
            numeros++;
            suma += numero  ;
        }

        System.out.print("La media de los números positivos   s es ");
        System.out.println((suma - numero  ) / (numeros - 1));
    }
}