package Tema05;

public class Actividad22 {
    public static void main(String[] args) {
    
        boolean primo = true;
    
        for (int n = 2; n <= 100; n++) {
    
          primo = true;
          for (int i = 2; i < n; i++) {
            if (n % i == 0) {
              primo = false;
            }
         }  if (primo) {
            System.out.print(n + " ");
          }
        }
        System.out.println();
      }
    }

