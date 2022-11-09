public class Actividad3 {
    public static void main(String[] args) {

        String palo = ""; 
        String numero = ""; 
        
        int numeroPalo = (int)(Math.random()*4); // hay 4 palos y usamos el math random para que elija una aleatoriamente
        
        switch(numeroPalo) {
          case 1:
            palo = "copas";
            break;
          case 2:
            palo = "oros";
            break;
          case 3:
            palo = "espadas";
            break;
          case 4:
            palo = "bastos";
          default:
        }
    
        int numerocarta = (int)(Math.random()*11); // Al ser de 40 cartas solo llega al 7 + 4 literales
        
        switch(numerocarta) {
          case 1:
            numero = "As";
            break;
          case 11:
            numero = "Sota";
            break;
          case 12:
            numero = "Caballo";
            break;
          case 13:
            numero = "Rey";
            break;
          default:
            numero = String.valueOf(numerocarta); // usamos String.valueOf para convertir un número en una cadena de caracteres
        }
        
        System.out.println(numero + " de " + palo);
      }
        
      

}
