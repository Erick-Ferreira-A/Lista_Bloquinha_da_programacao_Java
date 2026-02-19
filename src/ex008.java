import java.util.Scanner;
import java.util.Random;

public class ex008 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1; // 1 a 100
        int tentativa = 0;
        int chute = 0;

        System.out.println("Estou pensando em um número entre 1 e 100...");

        while (chute != numeroSecreto) {

            System.out.print("Digite seu chute: ");
            chute = leitura.nextInt();
            tentativa++;

            if (chute < numeroSecreto) {
                System.out.println("Maior!");

            } else if (chute > numeroSecreto) {
                System.out.println("Menor!");

            } else {
                System.out.println("Parabéns! Você acertou!");
                System.out.println("Número de tentativas: " + tentativa);
            }
        }

    }
}
