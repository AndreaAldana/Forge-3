import java.util.Scanner;

public class taller7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número");

         int num = sc.nextInt();
        boolean primo = true;

        for(int i = 2; i<num; i++){
            if(num%i == 0){
                primo = false;
            }

            }
        if(primo){
            System.out.println("Es primo");
        }
        else{
            System.out.println("No es primo");
        }
        System.out.println("Desea probar otro número? (si) (no)");
        sc.nextLine();
        String opcion = sc.nextLine();

        if(opcion.equalsIgnoreCase("si")) {
            System.out.println("Ingrese otro numero");
            opcion = sc.nextLine();
        }
        else if(opcion.equalsIgnoreCase("no")){
            System.exit(-1);
        }
        }
    }
