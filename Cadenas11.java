package Cadenas;

public class Cadenas11 {
    public static boolean esNumero(String cad) {
        // Creamos un array con los numeros
        char[] num = {'0','1','2','3','4','5','6','7','8','9'};
        // Iniciamos un bucle que recorre la longitud de la cadena mirando si son numero
        for (int i = 0; i < cad.length(); i++) {
            boolean esNum = false;
            // Iniciamos un bucle para ver si los numero de la cadena es igual que los numero del array
            for (int j = 0; j < 10; j++) {
                if (cad.charAt(i) == num[j]) {
                    esNum = true;
                    break;
                }
            }
            // Si contiene otra cosa nos devuelve false
            if (!esNum)
                return false;
        }
        // Si en un numero nos devolvera true
        return true;
    }

    // Introducimos el numero que quieras
    public static void main(String[] args) {
        System.out.println(esNumero("5345"));
    }
}
