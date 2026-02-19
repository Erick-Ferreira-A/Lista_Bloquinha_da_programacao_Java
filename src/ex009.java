import java.util.Scanner;

public class ex009 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite uma senha: ");
        String senha = leitura.nextLine();

        boolean temTamanhoMinimo = senha.length() >= 8;
        boolean temMaiuscula = false;
        boolean temMinuscula = false;
        boolean temNumero = false;

        for (int i = 0; i < senha.length(); i++) {
            char c = senha.charAt(i);

            if (Character.isUpperCase(c)) {
                temMaiuscula = true;
            }

            if (Character.isLowerCase(c)) {
                temMinuscula = true;
            }

            if (Character.isDigit(c)) {
                temNumero = true;
            }
        }


        if (temTamanhoMinimo && temMaiuscula && temMinuscula && temNumero) {
            System.out.println("Senha forte");
        } else {
            System.out.println("Senha fraca");

            if (!temTamanhoMinimo) {
                System.out.println("- Deve ter pelo menos 8 caracteres");
            }
            if (!temMaiuscula) {
                System.out.println("- Deve ter pelo menos 1 letra maiúscula");
            }
            if (!temMinuscula) {
                System.out.println("- Deve ter pelo menos 1 letra minúscula");
            }
            if (!temNumero) {
                System.out.println("- Deve ter pelo menos 1 número");
            }
        }

    }
}
