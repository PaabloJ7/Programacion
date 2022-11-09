public class Actividad6 {
    public static void main(String[] args) {
       
        int numero;

numero = (int)(Math.random()*100);
System.out.println(numero);

int numeroIntroducido;
int intentos = 5;
boolean acertado = true;


do {
    System.out.print("Introduzca la clave de la caja fuerte: ");
    numeroIntroducido = Integer.parseInt(System.console().readLine());
    
    if (numeroIntroducido == numero) {
      acertado = true;
    } else {
      System.out.println("Clave incorrecta");
    }
    
    intentos--;

} while (!acertado && (intentos > 0));
    
if (!acertado) {
  System.out.println("Lo siento, no has acertado, el número que estaba pensando era el " + numero) ;
}
}
}
