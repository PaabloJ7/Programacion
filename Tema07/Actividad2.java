public class Actividad2 {
    public static void main(String[] args) {
    
        char[] simbolo = new char[10];
        
        simbolo[0] = 'a';
        simbolo[1] = 'x';
        simbolo[4] = '@';
        simbolo[6] = ' ';
        simbolo[8] = '+';
        simbolo[9] = 'Q';
              
        for (int i = 0; i < 10; i++) {
          System.out.println("simbolo[" + i + "]: " + simbolo[i]);
        }
}
}
