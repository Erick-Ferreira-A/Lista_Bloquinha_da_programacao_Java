import java.util.Scanner;
public class ex006 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int soma = 0;
        int somapar = 0;

        System.out.println("Digite um numero para a contagem: ");
        int n = leitura.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println(i);
            soma += i;

            if( i % 2 == 0) {
                somapar = somapar + 1;
            }
        }
        System.out.println("A soma dos numeros listados e: " + soma);
        System.out.println("A qauntidade de numeros pares listados e: " + somapar);
    }
}
