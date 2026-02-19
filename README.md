# 📘 Coleção de Exercícios em Java – Fundamentos

Este repositório contém 15 exercícios desenvolvidos em Java com foco em lógica de programação, estruturas de controle, arrays, orientação a objetos e organização de código.

---

## 🛠 Tecnologias Utilizadas

- Java
- Scanner (entrada de dados)
- Random (números aleatórios)
- ArrayList
- Estruturas condicionais (if/switch)
- Laços de repetição (for/while)
- Classes e objetos

---

# 📂 Lista de Exercícios

---

## ✅ ex001 – Cálculo de Média e Maior/Menor Número
```java
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

```

### 📌 Entrada:
3 números decimais.

### 📌 Saída:
- Maior número
- Menor número
- Soma (2 casas decimais)
- Média (2 casas decimais)

### 🔎 Lógica:
- Comparação com operadores relacionais
- Uso de `String.format()` para formatação

### 🛡 Validações:
- Comparações considerando igualdade

---

## ✅ ex002 – Conversão de Temperatura
```java
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

```

### 📌 Entrada:
Opção (1 ou 2) + temperatura

### 📌 Saída:
Temperatura convertida

### 🔎 Lógica:
- `switch`
- Fórmulas matemáticas de conversão

### 🛡 Validações:
- Tratamento de opção inválida

---

## ✅ ex003 – Par, Múltiplo de 3 e 5
```java
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

```
### 📌 Entrada:
Número inteiro

### 📌 Saída:
- Se é par ou ímpar
- Se é múltiplo de 3
- Se é múltiplo de 5

### 🔎 Lógica:
Uso do operador módulo `%`

---

## ✅ ex004 – Maior Número com Tratamento de Igualdade
```java
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

```
### 📌 Entrada:
3 números inteiros

### 📌 Saída:
Maior número ou identificação de empate

### 🔎 Lógica:
Encadeamento completo de `if-else`

---

## ✅ ex005 – Calculadora com Menu (while)
```java
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
```
### 📌 Entrada:
Menu de operações + dois números

### 📌 Saída:
Resultado da operação

### 🔎 Lógica:
- `while`
- `switch`
- Estrutura de menu repetitiva

### 🛡 Validações:
- Impede divisão por zero

---

## ✅ ex006 – Soma e Contagem de Pares
```java
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

```
### 📌 Entrada:
Número inteiro N

### 📌 Saída:
- Lista de 1 até N
- Soma total
- Quantidade de números pares

### 🔎 Lógica:
- Laço `for`
- Acumuladores

---

## ✅ ex007 – Tabuada com Intervalo
```java
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

```
### 📌 Entrada:
Número + limite

### 📌 Saída:
Tabuada até o limite escolhido

### 🔎 Lógica:
Laço `for`

---

## ✅ ex008 – Jogo de Adivinhação
```java
import java.util.Scanner;
import java.util.Random;

public class ex008 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        Random random = new Random();

        int numeroSecreto = random.nextInt(100) + 1; // 1 a 100
        int tentativa = 0;
        int chute = 0;

        System.out.println("Estou pensando em um número entre 1 e 100...");

        while (chute != numeroSecreto) {

            System.out.print("Digite seu chute: ");
            chute = leitura.nextInt();
            tentativa++;

            if (chute < numeroSecreto) {
                System.out.println("Maior!");

            } else if (chute > numeroSecreto) {
                System.out.println("Menor!");

            } else {
                System.out.println("Parabéns! Você acertou!");
                System.out.println("Número de tentativas: " + tentativa);
            }
        }

    }
}

```
### 📌 Entrada:
Tentativas do usuário

### 📌 Saída:
- Dica (Maior/Menor)
- Número de tentativas

### 🔎 Lógica:
- `while`
- `Random`
- Comparação condicional

---

## ✅ ex009 – Validação de Senha
```java
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

```
### 📌 Regras:
- Mínimo 8 caracteres
- 1 maiúscula
- 1 minúscula
- 1 número

### 📌 Saída:
- Senha forte ou fraca
- Diagnóstico completo

### 🔎 Lógica:
Uso de:
- `Character.isUpperCase()`
- `Character.isLowerCase()`
- `Character.isDigit()`

---

## ✅ ex010 – Estatística de Notas
```java
import java.util.Scanner;

public class ex010 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite a quantidade de alunos: ");
        int n = leitura.nextInt();

        if (n < 1) {
            System.out.println("Quantidade inválida. Deve ser pelo menos 1.");
            leitura.close();
            return;
        }

        double[] notas = new double[n];
        double soma = 0;

        for (int i = 0; i < n; i++) {
            System.out.print("Digite a nota do aluno " + (i + 1) + ": ");
            notas[i] = leitura.nextDouble();
            soma += notas[i];
        }

        double media = soma / n;

        double maior = notas[0];
        double menor = notas[0];

        for (int i = 1; i < n; i++) {
            if (notas[i] > maior) {
                maior = notas[i];
            }
            if (notas[i] < menor) {
                menor = notas[i];
            }
        }

        int acimaOuIgual = 0;

        for (int i = 0; i < n; i++) {
            if (notas[i] >= media) {
                acimaOuIgual++;
            }
        }

        System.out.printf("Média da turma: %.2f%n", media);
        System.out.printf("Maior nota: %.2f%n", maior);
        System.out.printf("Menor nota: %.2f%n", menor);
        System.out.println("Alunos acima ou igual à média: " + acimaOuIgual);

    }
}

```
### 📌 Entrada:
Quantidade de alunos + notas

### 📌 Saída:
- Média
- Maior nota
- Menor nota
- Quantidade acima da média

### 🔎 Lógica:
Uso de arrays + cálculos estatísticos

### 🛡 Validação:
`n >= 1`

---

## ✅ ex011 – Frequência de Vogais
```java
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

```
### 📌 Entrada:
Frase

### 📌 Saída:
Contagem de a, e, i, o, u

### 🔎 Lógica:
- `toLowerCase()`
- `charAt()`
- Contadores

---

## ✅ ex012 – Pedra, Papel e Tesoura
```java
import java.util.Scanner;
import java.util.Random;

public class ex012 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        Random random = new Random();

        System.out.println("1 - Pedra");
        System.out.println("2 - Papel");
        System.out.println("3 - Tesoura");
        System.out.print("Escolha sua opção: ");

        int usuario = leitura.nextInt();
        int computador = random.nextInt(3) + 1; // 1 a 3


        System.out.println("Você escolheu: " + nomeEscolha(usuario));

        System.out.println("Computador escolheu: " + nomeEscolha(computador));

        if (usuario == computador) {
            System.out.println("Empate!");

        } else if ((usuario == 1 && computador == 3) ||
                (usuario == 2 && computador == 1) ||
                (usuario == 3 && computador == 2)) {

            System.out.println("Você venceu!");

        } else {
            System.out.println("Você perdeu!");
        }

    }

    public static String nomeEscolha(int escolha) {
        switch (escolha) {
            case 1: return "Pedra";
            case 2: return "Papel";
            case 3: return "Tesoura";
            default: return "Opção inválida";
        }
    }
}

```
### 📌 Entrada:
Escolha do usuário

### 📌 Saída:
- Escolha do computador
- Resultado da rodada

### 🔎 Lógica:
- `Random`
- Regras condicionais compostas

---

## ✅ ex013 – Caixa Eletrônico
```java
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

```
### 📌 Entrada:
Valor inteiro

### 📌 Saída:
Quantidade de notas:
100, 50, 20, 10, 5, 2, 1

### 🔎 Lógica:
- Divisão inteira `/`
- Operador módulo `%`
- Decomposição matemática

---

## ✅ ex014 – Busca Linear
```java
import java.util.Scanner;

public class ex014 {
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);

        System.out.print("Digite a quantidade de números: ");
        int n = leitura.nextInt();

        if (n < 1) {
            System.out.println("Quantidade inválida.");
            leitura.close();
            return;
        }

        int[] numeros = new int[n];

        // Leitura do array
        for (int i = 0; i < n; i++) {
            System.out.print("Digite o número da posição " + i + ": ");
            numeros[i] = leitura.nextInt();
        }

        System.out.print("\nDigite o número que deseja buscar: ");
        int x = leitura.nextInt();

        int contador = 0;

        System.out.println("\n===== RESULTADO =====");

        for (int i = 0; i < n; i++) {
            if (numeros[i] == x) {
                if (contador == 0) {
                    System.out.println("Número encontrado!");
                }
                System.out.println("Encontrado na posição (índice): " + i);
                contador++;
            }
        }

        if (contador == 0) {
            System.out.println("Número não encontrado.");
        } else {
            System.out.println("Total de ocorrências: " + contador);
        }

    }
}
```
### 📌 Entrada:
Array + número a buscar

### 📌 Saída:
- Se existe
- Índices encontrados
- Total de ocorrências

### 🔎 Lógica:
Busca linear O(n)

---

## ✅ ex015 – Mini Sistema de Estoque (CRUD)
```java
import java.util.ArrayList;
import java.util.Scanner;

class Produto {
    String nome;
    double preco;
    int quantidade;

    Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }
}

public class ex015 {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        ArrayList<Produto> estoque = new ArrayList<>();

        int opcao;

        do {
            System.out.println("\n===== SISTEMA DE ESTOQUE =====");
            System.out.println("1 - Cadastrar produto");
            System.out.println("2 - Listar produtos");
            System.out.println("3 - Atualizar quantidade");
            System.out.println("4 - Remover produto");
            System.out.println("5 - Sair");
            System.out.print("Escolha uma opção: ");

            opcao = leitura.nextInt();
            leitura.nextLine(); // limpar buffer

            switch (opcao) {

                case 1:
                    System.out.print("Nome do produto: ");
                    String nome = leitura.nextLine();

                    Produto existente = buscarProduto(estoque, nome);

                    if (existente != null) {
                        System.out.println("Produto já existe. Atualizando quantidade.");
                        System.out.print("Nova quantidade a adicionar: ");
                        int qtdAdd = leitura.nextInt();
                        existente.quantidade += qtdAdd;
                    } else {
                        System.out.print("Preço: ");
                        double preco = leitura.nextDouble();
                        System.out.print("Quantidade: ");
                        int quantidade = leitura.nextInt();

                        estoque.add(new Produto(nome, preco, quantidade));
                        System.out.println("Produto cadastrado com sucesso!");
                    }
                    break;

                case 2:
                    if (estoque.isEmpty()) {
                        System.out.println("Estoque vazio.");
                    } else {
                        System.out.println("\n===== LISTA DE PRODUTOS =====");
                        for (Produto p : estoque) {
                            System.out.printf("Nome: %s | Preço: %.2f | Qtd: %d%n",
                                    p.nome, p.preco, p.quantidade);
                        }
                    }
                    break;

                case 3:
                    System.out.print("Digite o nome do produto: ");
                    String nomeAtualizar = leitura.nextLine();

                    Produto pAtualizar = buscarProduto(estoque, nomeAtualizar);

                    if (pAtualizar != null) {
                        System.out.print("Nova quantidade: ");
                        int novaQtd = leitura.nextInt();
                        pAtualizar.quantidade = novaQtd;
                        System.out.println("Quantidade atualizada com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 4:
                    System.out.print("Digite o nome do produto: ");
                    String nomeRemover = leitura.nextLine();

                    Produto pRemover = buscarProduto(estoque, nomeRemover);

                    if (pRemover != null) {
                        estoque.remove(pRemover);
                        System.out.println("Produto removido com sucesso!");
                    } else {
                        System.out.println("Produto não encontrado.");
                    }
                    break;

                case 5:
                    System.out.println("Encerrando sistema...");
                    break;

                default:
                    System.out.println("Opção inválida.");
            }

        } while (opcao != 5);

        leitura.close();
    }

    // Método de busca
    public static Produto buscarProduto(ArrayList<Produto> estoque, String nome) {
        for (Produto p : estoque) {
            if (p.nome.equalsIgnoreCase(nome)) {
                return p;
            }
        }
        return null;
    }
}

```
### 📌 Funcionalidades:
1. Cadastrar produto
2. Listar
3. Atualizar quantidade
4. Remover
5. Sair

### 🔎 Lógica:
- Classe `Produto`
- `ArrayList`
- Método de busca
- Menu com `do-while`

### 🛡 Validações:
- Impede nome duplicado
- Busca case-insensitive
- Mensagens claras de erro

---

# 🎯 Objetivo do Projeto

Consolidar fundamentos de:

- Lógica de programação
- Estruturas de repetição
- Estruturas condicionais
- Arrays
- Programação orientada a objetos
- Organização de código

---

# 👨‍💻 Autor

Erick Ferreira Aleixo  
Estudante de Ciência da Computação
