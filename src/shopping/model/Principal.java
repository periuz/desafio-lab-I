package model;

import app.*;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Loja loja = null;
        Produto produto = null;

        while (true) {
            System.out.println("\nMenu:");
            System.out.println("(1) criar uma loja");
            System.out.println("(2) criar um produto");
            System.out.println("(3) sair");
            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    loja = criarLoja(scanner);
                    break;
                case 2:
                    produto = criarProduto(scanner);
                    break;
                case 3:
                    System.out.println("Saindo...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Opção inválida!");
            }

            if (loja != null && produto != null) {
                Data dataAtual = new Data(20, 10, 2023);
                System.out.println(produto.estaVencido(dataAtual) ? "\nPRODUTO VENCIDO" : "\nPRODUTO NÃO VENCIDO");
                System.out.println(loja);
                return;
            }
        }
    }

    private static Loja criarLoja(Scanner scanner) {
        System.out.print("Nome da loja: ");
        String nome = scanner.nextLine();
        System.out.print("Quantidade de funcionários: ");
        int qtdFuncionarios = scanner.nextInt();
        System.out.print("Salário base: ");
        double salarioBase = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("\n--- Endereço da Loja ---");
        Endereco endereco = criarEndereco(scanner);

        System.out.println("\n--- Data de Fundação ---");
        Data dataFundacao = criarData(scanner);

        System.out.print("Capacidade máxima do estoque de produtos: ");
        int maxProdutos = scanner.nextInt();
        scanner.nextLine();

        return new Loja(nome, qtdFuncionarios, salarioBase, endereco, dataFundacao, maxProdutos);
    }

    private static Produto criarProduto(Scanner scanner) {
        System.out.print("Nome do produto: ");
        String nome = scanner.nextLine();
        System.out.print("Preço: ");
        double preco = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("\n--- Data de Validade ---");
        Data dataValidade = criarData(scanner);

        return new Produto(nome, preco, dataValidade);
    }

    private static Endereco criarEndereco(Scanner scanner) {
        System.out.print("Rua: ");
        String rua = scanner.nextLine();
        System.out.print("Cidade: ");
        String cidade = scanner.nextLine();
        System.out.print("Estado: ");
        String estado = scanner.nextLine();
        System.out.print("País: ");
        String pais = scanner.nextLine();
        System.out.print("CEP: ");
        String cep = scanner.nextLine();
        System.out.print("Número: ");
        String numero = scanner.nextLine();
        System.out.print("Complemento: ");
        String complemento = scanner.nextLine();

        return new Endereco(rua, cidade, estado, pais, cep, numero, complemento);
    }

    private static Data criarData(Scanner scanner) {
        System.out.print("Dia: ");
        int dia = scanner.nextInt();
        System.out.print("Mês: ");
        int mes = scanner.nextInt();
        System.out.print("Ano: ");
        int ano = scanner.nextInt();
        scanner.nextLine();

        return new Data(dia, mes, ano);
    }


}
