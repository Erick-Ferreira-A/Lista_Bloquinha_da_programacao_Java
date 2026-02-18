import java.util.Scanner;
public class ex001 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        double media;
        double soma;

        System.out.println("Digite um numero decimal: ");
        double n1 = leitura.nextDouble();

        System.out.println("Digite o segundo numero decimal: ");
        double n2 = leitura.nextDouble();

        System.out.println("Digite o terceiro numero decimal: ");
        double n3 = leitura.nextDouble();


        soma = n1 + n2 + n3;
        media =  (n1 + n2 + n3) / 3;

        if (n1 > n2 && n1 > n3 ) {
            System.out.println("O nomurero maior e: " + n1);
        } else if (n2 > n1 && n2 > n3) {
            System.out.println("o numero maior e: " + n2);
        } else {
            System.out.println("o numero maior e: " + n3);
        }

        if (n1 < n2 && n1 < n3 ) {
            System.out.println("O nomurero menor e: " + n1);
        } else if (n2 < n1 && n2 < n3) {
            System.out.println("o numero menor e: " + n2);
        } else {
            System.out.println("o numero menor e: " + n3);
        }

        String somaFormatada = String.format("%.2f", soma);
        System.out.println("A soma e:" + somaFormatada);


        String mediaFormatada = String.format("%.2f", media);
        System.out.println("A media e: " + mediaFormatada);

    }
}
