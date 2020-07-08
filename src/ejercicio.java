import java.util.Scanner;

public class ejercicio {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese su nota");
        int nota = sc.nextInt();

        if(nota >0 && nota < 4){
            System.out.println("Deficiente");
        }
        else if (nota >3 && nota < 7){
            System.out.println("Regular");
        }
        else if (nota>6 && nota <10){
            System.out.println("Bien");
        }
        else if (nota >9 && nota < 13){
            System.out.println("Excelente");
        }
        else{
            System.out.println("Inválido");
        }
        if(nota > 6){
            System.out.println("Aprobado");
        }
        else{
            System.out.println("Suspendido");
        }
    }
}
