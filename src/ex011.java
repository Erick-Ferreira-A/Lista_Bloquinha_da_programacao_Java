import java.util.Scanner;

public class ex011 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.println("Digite uma frase: ");
        String frase = leitura.nextLine();

        frase = frase.toLowerCase();

        int countA = 0;
        int countE = 0;
        int countI = 0;
        int countO = 0;
        int countU = 0;

        for (int i = 0; i < frase.length(); i++) {
            char c = frase.charAt(i);

            if (c == 'a') {
                countA++;
            } else if (c == 'e') {
                countE++;
            } else if (c == 'i') {
                countI++;
            } else if (c == 'o') {
                countO++;
            } else if (c == 'u') {
                countU++;
            }
        }

        System.out.println("a: " + countA);
        System.out.println("e: " + countE);
        System.out.println("i: " + countI);
        System.out.println("o: " + countO);
        System.out.println("u: " + countU);

    }
}
