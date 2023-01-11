package Cadenas;

public class Cadenas9 {
    public static String sustituyeCaracter(String cad, char carInic, char carFin ){
        // Aqui reemplazaremos el primer caracter x el segundo caracter
        cad = cad.replace(carInic, carFin);
        // Nos mostrara la frase con los caracteres cambiados
        return cad;
    }

    // Introducimos la frase que queramos y los caracteres que quermos cambiar
    public static void main(String[] args) {
        System.out.println(sustituyeCaracter("Un lobo blanco", 'o', 'i'));
    }
}

 

