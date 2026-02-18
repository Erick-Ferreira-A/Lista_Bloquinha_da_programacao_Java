import java.util.Scanner;
public class ex003 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite um numero inteiro para o calculo: ");
        int n1 = leitura.nextInt();

        if (n1 % 2 == 0) {
            System.out.println(n1 + " e PAR");
        } else {
            System.out.println(n1 + " e IMPAR");
        }

        if (n1 % 3 == 0) {
            System.out.println(n1 + " e multiplo de 3");
        } else {
            System.out.println(n1 + " nao e multiplo de 3");
        }

        if (n1 % 5 == 0) {
            System.out.println(n1 + " e multiplo de 5");
        } else {
            System.out.println(n1 + " nao e multiplo de 5");
        }
    }
}
