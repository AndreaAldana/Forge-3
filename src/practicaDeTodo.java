import java.util.Scanner;

public class practicaDeTodo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sumPositivos = 0;
        int sumNegativos = 0;
        int par = 0;
        int impar = 0;
        int contarNum = 0;
        boolean flag = true;
        boolean band = true;


        while(flag){
            System.out.println("Ingrese un número");
            int num = sc.nextInt();
            int sumatoria = 0;
            sumatoria += num;
            contarNum++;
            int promedio = sumatoria/contarNum;


            while(band){
                if(num>0){
                    sumPositivos += num;

                }

                else{
                    sumNegativos += num;
                }
                if(num%2==0){
                    par++;
                }
                else{
                    impar++;
                }

                System.out.println("Desea continuar? (Sí) (No)");
                String option = sc.next();
                if(option.equalsIgnoreCase("si")){
                    System.out.println("ingrese otro número");
                    num = sc.nextInt();
                }
                else if (option.equalsIgnoreCase("no")){
                    System.out.println("La suma de todos los números positivos es " + sumPositivos);
                    System.out.println("La suma de todos los números negativos es " + sumNegativos);
                    System.out.println("La cantidad de números pares es " + par);
                    System.out.println("La cantidad de números impares es " + impar);
                    System.out.println("La media de todos los números introducidos es " + promedio);

                    System.exit(-1);
                }
            }
        }

    }
}
