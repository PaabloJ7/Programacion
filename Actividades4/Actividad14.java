
public class Actividad14  {
	public static void main (String[] args) {
		
        System.out.print("Introduce un numero: ");
        int numero = Integer.parseInt(System.console().readLine());
        
        if ((numero % 2) == 0)  {
          System.out.println("El numero es par");
        }
        else {
         System.out.println("El numero es inpar");
        }
        
         if ((numero % 5) == 0) {
          System.out.println("y divisible entre 5.");
        } 
        else {
          System.out.println("y NO es divisible entre 5.");
    }
    }
        
}

