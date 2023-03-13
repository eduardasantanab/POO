package poo;

public class CadastroLivros {
    private Livro[] vetor;
    int cont;

    public CadastroLivros(int tam) {
        vetor = new Livro[tam];
    }

    private int buscar(String isbnProcurado) {
        int i;
        for (i = 0; i <= this.cont - 1; i++) {
            if (vetor[i].toString().contains(isbnProcurado)) {
                return i; //isbn iguais
            }
        }
        return -1; //isbn nunca cadastrado
    }

    public void cadastrarLivros(Livro l) {
        boolean igual = false;

        for (int i = 0; i <= this.cont - 1; i++) {
            if (l.compareTo(this.vetor[i]) == 0) {
                igual = true;
                break;
            }
        }

        if (igual == true) { //mesmo isbn
            System.out.println("Este identificador já existe! Não foi possível completar a operação.");
        } else {
            if (this.cont == this.vetor.length) {
                System.out.println("O cadastro está cheio! Não foi possível completar a operação.");
            } else {
                this.vetor[this.cont] = l;
                this.cont++;
                System.out.println("O livro foi cadastrado com sucesso!");
            }
        }
    }

    public void exibirTodos() {
        int i;
        for (i = 0; i <= this.cont - 1; i++) {
            System.out.println(this.vetor[i]);
        }
    }

    public void exibirLivro(String isbnProcurado) {
        int retorno = this.buscar(isbnProcurado);

        if (this.vetor.length == 0) {
            System.out.println("Ainda não há livros cadastrados.");
        }

        if (retorno == -1) {
            System.out.println("Livro não cadastrado.");
        } else {
            System.out.println("Dados deste livro: ");
            System.out.println(this.vetor[retorno]);
        }
    }

    public void alterarPreco(String isbn, double novoPreco) {
        int retorno = this.buscar(isbn);
        if (retorno == -1) {
            System.out.println("Livro não cadastrado.");
        } else {
            System.out.print("Preço atual: ");
            System.out.println(this.vetor[retorno].getPreco());
            System.out.println("Novo preço do livro: " + novoPreco);
            this.vetor[retorno].setPreco(novoPreco);
            System.out.println("O preço foi atualizado com sucesso!");
        }
    }

    public void alterarEstoque(String isbn, int quantidade) {
        int novoEstoque;
        int retorno = this.buscar(isbn);
        if (retorno == -1) {
            System.out.println("Livro não cadastrado.");
        } else {
            novoEstoque = (this.vetor[retorno].getEstoque()) + quantidade;
            System.out.println("Quantidade atualizada do livro: " + novoEstoque);
            this.vetor[retorno].setEstoque(novoEstoque);
            System.out.println("O estoque foi atualizado com sucesso!");
        }
    }

    public void removerLivro(String isbn) {
        int retorno = this.buscar(isbn);
        int i;
        if (retorno == -1) {
            System.out.println("Livro não cadastrado.");
        } else {
            for (i = retorno; i < this.cont - 1; i++) {
                this.vetor[i] = this.vetor[i + 1];
            }
            this.vetor[i] = null;
            this.cont--;
            System.out.println("O livro foi removido com sucesso!");
        }
    }
}
