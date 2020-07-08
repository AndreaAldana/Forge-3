import java.util.Scanner;

public class otroEjercicioWhile {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while(true){
            System.out.println("Ingrese un número");
            int x = sc.nextInt();

            if(x==0){
                break;
            }
        }
        System.out.println("Terminé");
    }


}
