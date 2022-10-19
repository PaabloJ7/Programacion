package Tema05;

public class Actividad30 {
    public static void main(String[] args) {

        System.out.print("Introduce un numero: ");
        int numero = Integer.parseInt(System.console().readLine());

        System.out.print("Introduce un numero menor: ");
        int menor = Integer.parseInt(System.console().readLine());

        System.out.println("Los numeros inferiores a " + numero );
        System.out.print("que son son divisibles entre " + menor + " son: ");

        for(int i = 0; i < numero; i++) {
            if ((i % menor ) != 0) {
              System.out.print(i + " ");
          }
        }
    }
}

