import java.util.Scanner;

public class ex014 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int n = leitura.nextInt();

        if (n < 1) {
            System.out.println("Quantidade inválida.");
            leitura.close();
            return;
        }

        int[] numeros = new int[n];

        // Leitura do array
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número da posição " + i + ": ");
            numeros[i] = leitura.nextInt();
        }

        System.out.print("\nDigite o número que deseja buscar: ");
        int x = leitura.nextInt();

        int contador = 0;

        System.out.println("\n===== RESULTADO =====");

        for (int i = 0; i < n; i++) {
            if (numeros[i] == x) {
                if (contador == 0) {
                    System.out.println("Número encontrado!");
                }
                System.out.println("Encontrado na posição (índice): " + i);
                contador++;
            }
        }

        if (contador == 0) {
            System.out.println("Número não encontrado.");
        } else {
            System.out.println("Total de ocorrências: " + contador);
        }

    }
}