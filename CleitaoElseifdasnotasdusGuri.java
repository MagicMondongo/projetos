import java.util.Scanner;

public class CleitaoElseifdasnotasdusGuri {

        public static void main(String[] args) {

            Scanner sc = new Scanner(System.in);

            Integer nota = 0;
            Integer nota1 = 9;
            Integer nota2 = 7;
            Integer nota3 = 5;

            System.out.println("Informe sua nota :");
            nota = sc.nextInt();

            if (nota >= nota1) {
                System.out.println("excelente");
            }else if (nota >= nota2) {
                System.out.println("bom");
            }else if (nota > nota3) {
                System.out.println("satisfatorio");
            }else if (nota <= nota3) {
                System.out.println("insatisfatorio");



            }

        }
    }
