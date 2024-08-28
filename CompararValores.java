import java.util.Scanner;

public class CompararValores {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Integer idade = 0;
        Integer idade2 = 18;

        System.out.println("Informe sua idade :");
        idade = sc.nextInt();

        if (idade > idade2) {
            System.out.println("é maior de idade");
        }else if (idade < idade2) {

            System.out.println( "é menor de idade" );
        }   else {
            System.out.println( "é maior de idade" );



        }

    }
}
