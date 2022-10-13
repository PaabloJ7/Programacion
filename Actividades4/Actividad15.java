
public class Actividad15 {
	
	public static void main (String[] args) {
    
    System.out.println("Introduce un caracter para rellenar la piramide");
    String caracter = System.console().readLine();
    System.out.println("Introduce la direcion de la piramide: ");
    System.out.println("1. Hacia arriba");
    System.out.println("2. Hacia abajo");
    System.out.println("3. Hacia la izquierda");
    System.out.println("4. Hacia la derecha");
    int direccion = Integer.parseInt(System.console().readLine());
    
    switch(direccion) {
      case 1:
            System.out.println("  " + caracter );
            System.out.println(" " +caracter+caracter+caracter);
            System.out.println(caracter+caracter+caracter+caracter+caracter);
        break;
        case 2:
            System.out.println(caracter+caracter+caracter+caracter+caracter);
            System.out.println(" " +caracter+caracter+caracter);
            System.out.println("  " + caracter );
        break;
        case 3:
            System.out.println("    " + caracter);
            System.out.println("    "+ caracter+caracter);
            System.out.println("    " + caracter+caracter+caracter);
            System.out.println("    " + caracter+caracter);
            System.out.println("    " + caracter );
        case 4:
 
            System.out.println("   " +  "  " +caracter);
            System.out.println("   " +" "+caracter+caracter);
            System.out.println("   " +caracter+caracter+caracter + "    ");
            System.out.println("   " +" "+caracter+caracter);
            System.out.println("   " +  "  " +caracter);
        break;
        default:
        }
	}
}

