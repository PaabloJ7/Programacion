
public class Actividad3 {
	
	public static void main (String[] args) {
		
    System.out.println("Introduce un numero de la semana:");
    int dia = Integer.parseInt(System.console().readLine());
    
    String diaa;
    
    switch (dia)  {
      case 1:
      diaa = "Lunes";
      break;
      case 2:
      diaa = "Martes";
      break;
      case 3:
      diaa = "Miercoles";
      break;
      case 4:
      diaa = "Jueves";
      break;
      case 5:
      diaa = "Viernes";
      break;
      case 6:
      diaa = "Sabado";
      break;
      case 7:
      diaa = "Domingo";
      break;
      default:
      diaa = "No existe ese dia";
    }
    
    System.out.println("El dia" + " " + dia + " es: " + diaa);
      
	}
}

