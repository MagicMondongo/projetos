public class ParOuImpar {

        public static void main(String[] args) {
            // Exemplo 1: Verificando se um número é par ou ímpar
            int numero = 50;

            if (numero % 2 == 0) {
                System.out.println(numero + " é par.");
            } else {
                System.out.println(numero + " é ímpar.");
            }

            // Exemplo 2: Verificando se um número é divisível por outro
            int dividendo = 35;
            int divisor = 15;

            if (dividendo % divisor == 0) {
                System.out.println(dividendo + " é divisível por " + divisor);
            } else {
                System.out.println(dividendo + " não é divisível por " + divisor);
            }

            // Exemplo 3: Usando módulo para encontrar o resto da divisão
            int a = 5;
            int b = 1;
            int resto = a % b;

            System.out.println("O resto da divisão de " + a + " por " + b + " é " + resto);
        }
    }


