import java.util.Scanner;

public class votosLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int counterSi = 0;
        int counterNo = 0;

        while(true){
            System.out.println("Ingrese su voto");
            String voto = sc.nextLine();

            if(voto.equalsIgnoreCase("fin")){
                System.out.println("Quien ganó?");
                if(counterSi > counterNo){
                    System.out.println(("Ganó el sí por " + (counterSi-counterNo) + " voto/s"));

                }
                else if (counterNo > counterSi){
                    System.out.println("Ganó el no por " + (counterNo-counterSi) + " voto/s");
                }
                else{
                    System.out.println("Es un empate");
                }
                break;

            }
            else if (voto.equalsIgnoreCase("si")){
                counterSi+= 1;
            }
            else if (voto.equalsIgnoreCase("no")){
                counterNo+= 1;
            }
            else{
                System.out.println("Opción inválida");
                sc.nextLine();
            }
        }
    }
}
