import java.util.Scanner;

public class taller3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");
        int num = sc.nextInt();

       if(num>0){
           System.out.println("El número es positivo");
       }
       else if(num<0){
           System.out.println("El número es negativo");
       }
       else{
           System.out.println("El numero es 0");
       }

       if(num%2==0){
           System.out.println("El número es par");
       }
       else{
           System.out.println("El número es impar");
       }
    }
}
