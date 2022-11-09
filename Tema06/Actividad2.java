
public class Actividad2 {
    public static void main(String[] args) {

        String palo = ""; 
        String numero = ""; 
        
        int numeroPalo = (int)(Math.random()*4); // hay 4 palos y usamos el math random para que elija una aleatoriamente
        
        switch(numeroPalo) {
          case 1:
            palo = "picas";
            break;
          case 2:
            palo = "corazones";
            break;
          case 3:
            palo = "diamantes";
            break;
          case 4:
            palo = "tréboles";
          default:
        }
    
        int numerocarta = (int)(Math.random()*13); // al haber 4 cartas que no son numeros se crea otro switch para esas excepciones
        
        switch(numerocarta) {
          case 1:
            numero = "As";
            break;
          case 11:
            numero = "J";
            break;
          case 12:
            numero = "Q";
            break;
          case 13:
            numero = "K";
            break;
          default:
            numero = String.valueOf(numerocarta); // usamos String.valueOf para convertir un número en una cadena de caracteres
        }
        
        System.out.println(numero + " de " + palo);
      }
        

}
