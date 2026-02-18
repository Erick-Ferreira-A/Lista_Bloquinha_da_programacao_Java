import java.util.Scanner;
public class ex004 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite o primeiro numero inteiro: ");
        int n1 = leitura.nextInt();
        System.out.println("Digite o segundo numero inteiro: ");
        int n2 = leitura.nextInt();
        System.out.println("Digite o terceiro numero inteiro: ");
        int n3 = leitura.nextInt();

        if (n1 > n2 && n1 > n3) {
            System.out.println("O maior numero é " + n1);

        } else if (n2 > n1 && n2 > n3) {
            System.out.println("O maior numero é " + n2);

        } else if (n3 > n1 && n3 > n2) {
            System.out.println("O maior numero é " + n3);

        } else if (n1 == n2 && n1 > n3) {
            System.out.println("n1 e n2 são iguais e são os maiores: " + n1);

        } else if (n1 == n3 && n1 > n2) {
            System.out.println("n1 e n3 são iguais e são os maiores: " + n1);

        } else if (n2 == n3 && n2 > n1) {
            System.out.println("n2 e n3 são iguais e são os maiores: " + n2);

        } else {
            System.out.println("Os três números são iguais: " + n1);
        }
    }
}
