import java.util.Scanner;

public class taller2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese primer número");
        int num1 = sc.nextInt();
        System.out.println("Ingrese segundo número");
        int num2 = sc.nextInt();

        if(num1>num2){
            System.out.println(num1 + " es mayor que " + num2);
        }
        else if(num2>num1){
            System.out.println(num2 + " es mayor que " + num1);
        }
        else{
            System.out.println(num1 + " y " + num2 + " son iguales.");
        }

    }
}
