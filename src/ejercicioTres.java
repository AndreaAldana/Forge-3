import java.util.Scanner;

public class ejercicioTres {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese valor de compra");
        int precio = sc.nextInt();

        System.out.println("Ingrese día de semana");
        String dia = sc.next();

        if(dia.equalsIgnoreCase("jueves") || dia.equalsIgnoreCase("martes")){
            double descuento = precio*0.15;
            System.out.println("Su precio con descuento por venir hoy es "+ (precio-descuento));

        } else{
            System.out.println("Popo, su precio es " + precio + ", venga martes o jueves");
        }
    }
}
