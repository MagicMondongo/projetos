import java.util.Scanner;

public class Temperatura {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer Temperatura = 0;
        Integer Temperatura1 = 29;
        Integer Temperatura2 = 15;
        Integer Temperatura3 = 29;;

        System.out.println("Informe sua Temperatura :");
        Temperatura = sc.nextInt();

        if (Temperatura > 30) {
            System.out.println("quente");
        }
        else if (Temperatura > 15 && Temperatura <= 30) {
            System.out.println("agradavel");
        }
        else  {
            System.out.println("frio");
        }



    }
}