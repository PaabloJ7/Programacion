
public class Actividad11 {
	
	public static void main (String[] args) {
    

		System.out.println ("Introduce las horas:  ");
    int horas = Integer.parseInt (System.console().readLine());
    
    System.out.println ("Introduce los minutos: ");
    int minutos = Integer.parseInt (System.console().readLine());
    
    
    int segundos= (horas * 3600) + (minutos * 60);
    
    int medianoche = (24 * 3600) - segundos;
   
   System.out.println ("desde las " + (horas ) + " faltan " + medianoche + " segundos para la medianoche");
    
	}
}

