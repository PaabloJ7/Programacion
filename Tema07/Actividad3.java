public class Actividad3 {

    public static void main(String[] args) {

System.out.println("Introduce un numero");
int uno;
uno = Integer.parseInt(System.console().readLine());
System.out.println("Introduce un numero");
int dos;
dos = Integer.parseInt(System.console().readLine());
System.out.println("Introduce un numero");
int tres;
tres = Integer.parseInt(System.console().readLine());
System.out.println("Introduce un numero");
int cuatro;
cuatro = Integer.parseInt(System.console().readLine());
System.out.println("Introduce un numero");
int cinco;
cinco = Integer.parseInt(System.console().readLine());
System.out.println("Introduce un numero");
int seis;
seis = Integer.parseInt(System.console().readLine());




    int[] x = {seis, cinco, cuatro, tres, dos, uno};

for (int i = 0; i < 10; i++) {
    System.out.printf("num[%2d]: %d\n", i, x[i]);
  }
}
}