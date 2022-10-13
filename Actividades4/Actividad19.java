
public class Actividad19 {
    public static void main(String[] args) {

        int numero = 0;
        int cifras = 0;

        System.out.print("Introduce un numero : ");
        numero = Integer.parseInt(System.console().readLine());


        if (numero < 10) {
            cifras = 1;
        }

        if ((numero >= 10) && (numero < 100)) {
            cifras = 2;
        }

        if ((numero >= 100) && (numero < 1000)) {
            cifras = 3;
        }

        if ((numero >= 1000) && (numero < 10000)) {
            cifras = 4;
        }

        if (numero >= 10000) {
            cifras = 5;
        }

        System.out.println("El numero tiene: " + cifras + " cifras");
    }
}