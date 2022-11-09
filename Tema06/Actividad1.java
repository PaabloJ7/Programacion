
public class Actividad1 {
    public static void main(String[] args) {

        System.out.println("3 tiradas de dados");

        int tirada = 0; // se crea la variable tirada
        int suma = 0; // se crea la variable suma 


        for (int i = 0; i < 3; i++) { // se crea el bucle que pare cuando llegue a 3
            tirada = (int)(Math.random() * 6) + 1; // asi se pone maximo 6
            System.out.print(tirada + " ");
            suma += tirada; // se usa la variable de la suma para sumar los dados
        }

        System.out.println("La suma de los 3 dados son: " + suma);
        }
    
}


