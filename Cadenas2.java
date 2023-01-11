package Cadenas;

public class Cadenas2 {
    public static int numeroVocales(String cad) {
        // Creamos un array que contiene todas las vocales
        char[] voc = {'a','e','i','o','u','A','E','I','O','U'};
        // Variable que cuenta cuantas vocales hay
        int numVoc = 0;

        // Iniciamos un bucle que recorre la frase introducida en busca de las vocales
        for (int i = 0; i < 10; i++) {
            for (int j = 0; j < cad.length(); j++) {
        
                if (cad.charAt(j) == voc[i])
                    numVoc++;
            }
        }
        return numVoc;
    }

    // Introducimos la frase que queremos pasar a la cadena
    public static void main(String[] args) {
        System.out.println(numeroVocales("Una casa verde"));
    }
}