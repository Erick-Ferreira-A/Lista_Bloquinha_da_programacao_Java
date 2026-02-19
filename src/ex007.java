import java.util.Scanner;

public class ex007 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um numero para a tabuada: ");
        int n = leitura.nextInt();

        System.out.println("Escolha ate que numero deseja calcular a tabuada: ");
        int limite = leitura.nextInt();

        System.out.println("\n===== TABUADA DE " + n + " =====");

        for (int i = 1; i <= limite; i++) {
            System.out.println(n + " x " + i + " = " + (n * i));
        }
    }
}
