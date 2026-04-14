// Nome: Davi Fernandes Alves
// Matrícula: 1261946667


import java.util.Scanner;

public class App {
      public static boolean ehPar(int numero) {
        if (numero % 2 == 0) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite um número: ");
        int numero = scanner.nextInt();

        if (ehPar(numero)) {
            System.out.println("O número é par.");
        } else {
            System.out.println("O número é ímpar.");
        }

        scanner.close();
    }
}
