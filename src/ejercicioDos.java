import java.util.Scanner;

public class ejercicioDos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String pay = sc.nextLine();


        if(pay.equalsIgnoreCase("contado")){
            int price = sc.nextInt();
            double descuento = price - (price * 0.05);
            System.out.println("Su total con descuento es " + descuento);
        }
        else if (pay.equalsIgnoreCase("tarjeta")){
            int price = sc.nextInt();
            double aumento = price * 0.03;
            System.out.println("Su total con aumento es " + (price+aumento));
        }
        else{
            System.exit(-1);
        }



    }
}
