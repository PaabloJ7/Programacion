package Cadenas;

public class Cadenas1 {
    public static int numeroEspacios(String cad) {
        //Creamos "Espacios"
        int espacio = 0;
        //Bucle para que recorra toda la frase y compruebe si tiene espacio
        for (int i = 0; i < cad.length(); i++) {
            if (cad.charAt(i) == ' ')
        //Si tiene espacio, incrementa el numero
                espacio++;
        }
        return espacio;
    }

    // Introducimos la frase que queremos pasar a la cadenas
    public static void main(String[] args) {
        System.out.println(numeroEspacios("Numeros de espacios"));
    }
}
