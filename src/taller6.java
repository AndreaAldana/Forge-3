import java.util.Scanner;

public class taller6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int sum = 0;
        int anterior = 0;
        int actual = 1;
        int siguiente = 0;

        while(true){
            siguiente = anterior + actual;
            System.out.println(siguiente);
            actual = siguiente;
            anterior = actual;

            if(siguiente > num){
                break;
            }

        }
    }
}
