import java.util.Scanner;
public class ex002 {
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);

        System.out.println("Qual conversao deseja realizar?");
        System.out.println("Digite 1 para converter de Celsius para Fahrenheit.");
        System.out.println("Digite 2 para converter de Fahrenheit para Celsius.");
        int identificador = leitura.nextInt();

        switch(identificador) {
            case 1:
                double f;
                System.out.println("Digite a temperatura em Celsius(°C): ");
                double c = leitura.nextDouble();
                f = (c * 1.8) + 32;
                System.out.println(c + "°C e igual a " + f + " Fahrenheit");
            break;

            case 2:
                double c2;
                System.out.println("Digite a temperatura em Fahrenheit(°F): ");
                double f2 = leitura.nextDouble();
                c2 = (f2 - 32) / 1.8;
                String c2Formatado = String.format("%.2f", c2);
                System.out.println(f2 + "°F e igual a " + c2Formatado + " Celsius");
            break;
            default:
                System.out.println("Conteúdo invalido. Digite um numero que represente a temperadura que deseja converter.");
        }
    }
}
