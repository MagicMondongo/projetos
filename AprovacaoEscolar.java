import java.util.Scanner;

    public class AprovacaoEscolar {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            Integer media = 6;
            Integer media1 = 9;
            Integer media2 = 7;
            Integer media3 = 5;

            System.out.println("Informe sua nota :");
            media = sc.nextInt();

            if (media >= media1) {
                System.out.println("aprovado");
            }else if (media >= media2) {
                System.out.println("aprovado");
            }else if (media >= media3) {
                System.out.println("recuperação");
            }else if (media < media3) {
                System.out.println("reprovado");


            }

        }
    }
