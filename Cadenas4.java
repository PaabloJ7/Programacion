package Cadenas;

public class Cadenas4 {
    public static boolean contiene(String cad, char car) {
        // Inciamos un bucle que recorra "contiene" para ver si contiene el caracter que le hemos introducido
        for (int i = 0; i < cad.length(); i++) {
            if (cad.charAt(i) == car)
                // Si tiene el caracter nos devuelve "True"
                return true;
        }
        // Si no tiene el caracter nos devuelve "False"
        return false;
    }

    // Escribrimos la frase que queremos comprarbar y el caracter.
    public static void main(String[] args) {
        System.out.println(contiene("Casa", 'a'));
    }
}
