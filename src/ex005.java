import java.util.Scanner;
public class ex005 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        int sair;
        sair = 1;

        while (sair != 0) {

            System.out.println("Escolha uma opcao para calcular\nMENU \n1 - Somar\n2 - Subtrair\n3 - Multiplicar\n4 - Dividir\n5 - Sair ");
            int opcao = leitura.nextInt();
            switch (opcao) {
                case 1:
                    System.out.println("Digite o primeiro numero (inteiro) para a soma: ");
                    int s1 = leitura.nextInt();
                    System.out.println("Digite o segundo numero (inteiro) para a soma: ");
                    int s2 = leitura.nextInt();

                    int soma = s1 + s2;

                    System.out.println("A soma de " + s1 + " e " + s2 + " resulta: " + soma);
                    break;
                case 2:
                    System.out.println("Digite o primeiro numero (inteiro) para a subtracao: ");
                    int x1 = leitura.nextInt();
                    System.out.println("Digite o segundo numero (inteiro) para a subtracao: ");
                    int x2 = leitura.nextInt();

                    int subtracao = x1 - x2;

                    System.out.println("A subtracao de " + x1 + " menos " + x2 + " resulta: " + subtracao);
                    break;
                case 3:
                    System.out.println("Digite o primeiro numero (inteiro) para a multiplicacao: ");
                    int m1 = leitura.nextInt();
                    System.out.println("Digite o segundo numero (inteiro) para a multiplicacao: ");
                    int m2 = leitura.nextInt();

                    int multiplicacao = m1 * m2;

                    System.out.println("A multiplicacao de " + m1 + " com " + m2 + " resulta: " + multiplicacao);
                    break;
                case 4:
                    System.out.println("Digite o primeiro numero (inteiro) para a divisao: ");
                    int d1 = leitura.nextInt();
                    System.out.println("Digite o segundo numero (inteiro) para a divisao: ");
                    int d2 = leitura.nextInt();

                    if (d1 == 0 || d2 == 0) {
                        System.out.println("Nao e possivel realizar uma divisao por 0. Digite um numero inteiro maior que 0.");
                    } else {

                        int divisao = d1 / d2;

                        System.out.println("A divisao de " + d1 + " por " + d2 + " resulta: " + divisao);
                    }
                    break;
                case 5:
                    sair = 0;
                    break;
            }
        }
    }
}