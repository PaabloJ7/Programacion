
public class Actividad1 {
	
	public static void main (String[] args) {
		
    System.out.println("Introduce un dia de la semana:" );
    String respuesta = System.console().readLine();
    
    String asignatura;
    
    switch (respuesta) {
      case "Lunes":
      asignatura = "Base de datos";
      break;
      case "Martes":
      asignatura = "Entornos";
      break;
      case "Miercoles":
      asignatura = "Programación";
      break;
      case "Jueves":
      asignatura = "Lenguaje de marcas";
      break;
      case "Viernes":
      asignatura = "Base de datos";
      break;
      default:
      asignatura = "No existe ese dia";
    }
    
    System.out.println("El" + " " + respuesta + " " + "te toca:" +  " " + asignatura);
      
    
	}
}
