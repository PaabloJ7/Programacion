package Tema05;

public class Actividad7 {
    public static void main(String[] args) {

        int intentos = 4;
        int numero;
        boolean acertado = false;

        do {
            System.out.print("Introduce la clave: ");
            numero = Integer.parseInt(System.console().readLine());

            if (numero == 1234) {
                acertado = true;
            } else {
                System.out.println("Clave incorrecta");
            }

            intentos--;

        } while ((intentos > 0) && (!acertado));

        if (acertado) {
            System.out.println("La caja fuerte se a abierto");
        } else {
            System.out.println("No te quedan oportunidades");
        }
    }
}
