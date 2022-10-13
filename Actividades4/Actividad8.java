
public class Actividad8{
	public static void main (String[] args) {
	
    System.out.println("Introduce la nota numero 1: ");
    double nota1 = Double.parseDouble(System.console().readLine());
    System.out.println("Introduce la nota numero 2: ");
    double nota2 = Double.parseDouble(System.console().readLine());
    System.out.println("Introduce la nota numero 3: ");
    double nota3 = Double.parseDouble(System.console().readLine());
    
    double calculo = (nota1 +  nota2 + nota3)/3;
    
    System.out.println("La media es "+ calculo);
    
    if (calculo < 5)   {
      System.out.println("Insuficiente");
    }
    if ((calculo >= 5) && (calculo < 6)) {
      System.out.println("Suficiente");
    }
    if ((calculo >= 7) && (calculo < 9)) {
      System.out.println("Notable");
    }
    if (calculo >= 9)   {
      System.out.println("Sobresaliente");
    }
	}
}
