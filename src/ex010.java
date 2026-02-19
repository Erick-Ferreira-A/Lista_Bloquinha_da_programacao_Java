import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int n = leitura.nextInt();

        if (n < 1) {
            System.out.println("Quantidade inválida. Deve ser pelo menos 1.");
            leitura.close();
            return;
        }

        double[] notas = new double[n];
        double soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = leitura.nextDouble();
            soma += notas[i];
        }

        double media = soma / n;

        double maior = notas[0];
        double menor = notas[0];

        for (int i = 1; i < n; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        int acimaOuIgual = 0;

        for (int i = 0; i < n; i++) {
            if (notas[i] >= media) {
                acimaOuIgual++;
            }
        }

        System.out.printf("Média da turma: %.2f%n", media);
        System.out.printf("Maior nota: %.2f%n", maior);
        System.out.printf("Menor nota: %.2f%n", menor);
        System.out.println("Alunos acima ou igual à média: " + acimaOuIgual);

    }
}
