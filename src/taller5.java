import java.util.Scanner;

public class taller5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca un número");
        int num = sc.nextInt();
        int counterPar = 0;
        int counterImpar = 0;

        for(int i = 1; i<=num;i++){
            if(i%2==0){
                counterPar += i;
            }
            else{
                counterImpar += i;
            }

        }
        System.out.println("La sumatoria de números pares es " + counterPar + ", la sumatoria de los núm impares es " + counterImpar);
    }
}
