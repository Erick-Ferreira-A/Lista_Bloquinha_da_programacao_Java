import java.util.Scanner;

public class ex013 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite o valor para saque (>= 1): ");
        int valor = leitura.nextInt();

        if (valor < 1) {
            System.out.println("Valor inválido.");
            leitura.close();
            return;
        }

        int n100 = valor / 100;
        valor = valor % 100;

        int n50 = valor / 50;
        valor = valor % 50;

        int n20 = valor / 20;
        valor = valor % 20;

        int n10 = valor / 10;
        valor = valor % 10;

        int n5 = valor / 5;
        valor = valor % 5;

        int n2 = valor / 2;
        valor = valor % 2;

        int n1 = valor;

        System.out.println("Notas de 100: " + n100);
        System.out.println("Notas de 50: " + n50);
        System.out.println("Notas de 20: " + n20);
        System.out.println("Notas de 10: " + n10);
        System.out.println("Notas de 5: " + n5);
        System.out.println("Notas de 2: " + n2);
        System.out.println("Notas de 1: " + n1);

    }
}
