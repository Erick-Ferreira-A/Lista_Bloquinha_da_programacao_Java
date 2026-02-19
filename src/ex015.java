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
