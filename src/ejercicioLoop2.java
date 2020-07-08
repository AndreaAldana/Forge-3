import java.util.Scanner;

public class ejercicioLoop2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double num;
        double sum = 0;
        int counter = 0;


        while(true){
            System.out.println("Ingrese un número");
            num = sc.nextInt();


            if(num!=0){
                sum+= num;
                counter++;
            }

            else if(num==0){
                double promedio = sum/counter;
                System.out.println("El promedio es: " + promedio);
                break;
            }

        }

    }
}
