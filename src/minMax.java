import java.util.Scanner;

public class minMax {
    public static void main(String[] args) {
        /**
         * Pide una lista de número al usuario
         * retorna el mayor y menor ingresado
         */

        Scanner sc = new Scanner(System.in);
        int maximo = 0;
        int minimo = 1000000000;
        while(true){
            System.out.println("Ingrese número o 0 para terminar");
            int x = sc.nextInt();
            if(x==0){
                break;
            }

            if(x>maximo){
                maximo = x;
            }
            if(x<minimo){
                minimo = x;
            }


        }
        System.out.println("Menor: " + minimo);
        System.out.println("mayor " + maximo);
    }
}
