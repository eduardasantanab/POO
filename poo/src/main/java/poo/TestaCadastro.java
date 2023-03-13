package poo;

import java.util.Scanner;

public class TestaCadastro {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int tamanho;

        System.out.print("Informe o tamanho da cadastro a ser criado: ");
        tamanho = input.nextInt();
        input.nextLine();
        CadastroLivros livros = new CadastroLivros(tamanho);
        String ISBN;
        String titulo;
        double preco;
        int qtdEstoque, opcao;
        Livro l;

        if (tamanho > 0) {
            do {
                exibeOpcoes();
                opcao = input.nextInt();
                input.nextLine();

                if (opcao == 1) {
                    System.out.println("Informe os dados do livro");
                    System.out.print("ISBN: ");
                    ISBN = input.nextLine();
                    System.out.print("Título: ");
                    titulo = input.nextLine();
                    System.out.print("Preço: ");
                    preco = input.nextDouble();
                    input.nextLine();
                    System.out.print("Quantidade em estoque: ");
                    qtdEstoque = input.nextInt();
                    input.nextLine();
                    l = new Livro(ISBN, titulo, preco, qtdEstoque);
                    livros.cadastrarLivros(l);
                } else if (opcao == 2) {
                    livros.exibirTodos();
                } else if (opcao == 3) {
                    System.out.print("Informe o ISBN do livro desejado: ");
                    ISBN = input.nextLine();
                    livros.exibirLivro(ISBN);
                } else if (opcao == 4) {
                    System.out.print("Informe o ISBN do livro: ");
                    ISBN = input.nextLine();
                    System.out.print("Informe o novo preço do livro: ");
                    preco = input.nextDouble();
                    input.nextLine();
                    livros.alterarPreco(ISBN, preco);
                } else if (opcao == 5) {
                    System.out.print("Informe o ISBN do livro: ");
                    ISBN = input.nextLine();
                    System.out.print("Informe a quantidade que deseja adicionar: ");
                    qtdEstoque = input.nextInt();
                    input.nextLine();
                    livros.alterarEstoque(ISBN, qtdEstoque);
                } else if (opcao == 6) {
                    System.out.print("Informe o ISBN do livro que deseja remover: ");
                    ISBN = input.nextLine();
                    livros.removerLivro(ISBN);
                } else if (opcao == 0) {
                    System.out.println("O programa foi encerrado!");
                } else {
                    System.out.println("Opção inválida");
                }
            } while (opcao != 0);
        } else {
            System.out.print("Não é possível realizar um cadastro com este tamanho.");
        }
    }

    public static void exibeOpcoes() {
        System.out.println("Opções");
        System.out.println("1 - Cadastrar um livro");
        System.out.println("2 - Exibir livros cadastrados");
        System.out.println("3 - Exibir os dados de um livro");
        System.out.println("4 - Alterar preço de um livro");
        System.out.println("5 - Alterar quantidade em estoque de um livro");
        System.out.println("6 - Retirar pessoa do cadastro");
        System.out.println("0 - Encerrar programa");
        System.out.println("Informe a opção: ");
    }
}
