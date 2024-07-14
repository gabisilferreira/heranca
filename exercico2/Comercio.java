package exercico2;

import java.util.Scanner;

public class Comercio {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o nome do produto: ");
        String nome = scanner.nextLine();

        System.out.print("Digite o preço do produto: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();  // Consumir a nova linha deixada pelo nextDouble

        System.out.print("Digite o tipo do produto (Perecível/Não Perecível): ");
        String tipo = scanner.nextLine();

        Produto produto;

        if (tipo.equalsIgnoreCase("perecível")) {
            System.out.print("Digite a data de validade (AAAA-MM-DD): ");
            String dataValidade = scanner.nextLine();
            produto = new ProdutoPerecivel(nome, preco, dataValidade);
        } else {
            produto = new ProdutoNaoPerecivel(nome, preco);
        }

        produto.exibirDetalhes();

        scanner.close();
    }
}

