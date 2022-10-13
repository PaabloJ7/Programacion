
public class Actividad18 {
    public static void main(String[] args) {

        int numero = 0;
        int primera = 0;

        System.out.print("Introduce un numero : ");
        numero = Integer.parseInt(System.console().readLine());


        if (numero < 10) {
            primera = numero;
        }

        if ((numero >= 10) && (numero < 100)) {
            primera = numero / 10;
        }

        if ((numero >= 100) && (numero < 1000)) {
            primera = numero / 100;
        }

        if ((numero >= 1000) && (numero < 10000)) {
            primera = numero / 1000;
        }

        if (numero >= 10000) {
            primera = numero / 10000;
        }

        System.out.println("La primera cifra es: " + primera);
    }
}