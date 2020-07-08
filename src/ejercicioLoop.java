import java.util.Scanner;

public class ejercicioLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num;
        int divisible2 = 0;
        int divisible3 = 0;
        int i = 0;

        for(num=0; i<10; i++){
            System.out.println("Ingrese un número");
            num = sc.nextInt();

            if(num%2 == 0){
                divisible2 += 1;

            }
            else if(num%3 ==0){
                divisible3 += 1;
            }
            }
        System.out.println("Los números divisibles entre 2 fueron: " + divisible2 + "\n Los números divisibles entre 3 fueron: " + divisible3);
        }

    }

