import java.util.Scanner;

public class taller4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int factorial = 1;
        System.out.println("Ingrese un número");
        int num = sc.nextInt();

        for (int i=1;i<=num;i++){
            factorial = factorial*i;

        }
        System.out.println(factorial);

    }
}
