package Cadenas;

public class Cadenas12 {
    public static String quitaCaracter(String cad, char car) {
        String carString = "" + car;
        // Aqui cambiamos el caracter puesto por un espacio en blanco
        cad = cad.replace(carString, "");
        // Devolvemos la cadena
        return cad;
    }

    // Introducimos la cadena y el caracter
    public static void main(String[] args) {
        System.out.println(quitaCaracter("Una casa", 'a'));
    }
}