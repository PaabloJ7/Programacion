public class Actividad5 {
    public static void main(String[] args) {

    
    int maximo = 199;
    int minimo = 100;
    int suma = 0;
    int n;
    
    for (int i = 0; i < 50; i++) {
      n = (int)(Math.random()*100) + 100;
      System.out.print(n + " ");
      suma += n;
      
      if (n > minimo) {
        maximo = n;
      }
      
      if (n < maximo) {             
        minimo = n;
      }
    }
    
    System.out.println("\nMínimo: " + minimo + "\nMáximo: " + maximo + "\nMedia: " + suma / 50);
  }
}