import java.util.Scanner;

public class ejercicioEvaluado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Hola, gracias por usar nuestro sistema, por favor ingrese su edad");
        int edad = sc.nextInt();
        System.out.println("A continuación, ingrese su salario");
        int salario = sc.nextInt();

        if(edad < 19){
            System.out.println("Su salario es " + salario + ", no recibe bonificación.");
        }
        else if(edad >= 19 && edad <= 50){
            double bon1 = salario*0.05;
            System.out.println("Su salario es " + (salario + (int)bon1) + ", se añadió 5% de bonificación.");
        }

        else if (edad >= 51 && edad <= 60){
            double bon2 = salario*0.10;
            System.out.println("Su salario es " + (salario + (int)bon2) + ", se añadió 10% de bonificación.");
        }

        else if (edad > 60){
            double bon3 = salario*0.15;
            System.out.println("Su salario es " + (salario + (int)bon3) + ", se añadió 15% de bonificación");
        }
    }
}
