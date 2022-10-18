package Tema05;
public class Actividad17 {
    public static void main(String[] args) {
        System.out.print("Introduce un número: ");
        int num = Integer.parseInt(System.console().readLine());
        if (num < 0){
          System.out.print("El numero que tiene que ser positivo");
        } else {
          System.out.print("La suma de siguientes 100 números a "+num+" son: ");
          int suma = 0;
          for(int i = num; i < (num+100); i++){
            suma += i;
          }
          System.out.println(suma);
        }
      }
    }
