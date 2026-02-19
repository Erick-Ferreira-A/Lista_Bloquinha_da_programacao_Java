import java.util.Scanner;
import java.util.Random;

public class ex012 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        Random random = new Random();

        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");
        System.out.print("Escolha sua opção: ");

        int usuario = leitura.nextInt();
        int computador = random.nextInt(3) + 1; // 1 a 3


        System.out.println("Você escolheu: " + nomeEscolha(usuario));

        System.out.println("Computador escolheu: " + nomeEscolha(computador));

        if (usuario == computador) {
            System.out.println("Empate!");

        } else if ((usuario == 1 && computador == 3) ||
                (usuario == 2 && computador == 1) ||
                (usuario == 3 && computador == 2)) {

            System.out.println("Você venceu!");

        } else {
            System.out.println("Você perdeu!");
        }

    }

    public static String nomeEscolha(int escolha) {
        switch (escolha) {
            case 1: return "Pedra";
            case 2: return "Papel";
            case 3: return "Tesoura";
            default: return "Opção inválida";
        }
    }
}
