package poo;

public class Livro implements Comparable<Livro> {

    private String ISBN;
    private String titulo;
    private double preco;
    private int qtdEstoque;


    public int compareTo(Livro outro) {
        int compara;
        compara = this.ISBN.compareToIgnoreCase(outro.ISBN);
        return compara;
    }

    public String toString() {
        String dadosLivro;
        dadosLivro = "ISBN: " + this.ISBN;
        dadosLivro = dadosLivro + " Título: " + this.titulo;
        dadosLivro = dadosLivro + " Preço: " + this.preco;
        dadosLivro = dadosLivro + " Quantidade em estoque: " + this.qtdEstoque;
        return dadosLivro;
    }

    public Livro(String i) {
        this.ISBN = i;
    }

    public Livro(String i, String t, double p, int e) {
        this.ISBN = i;
        this.titulo = t;
        this.preco = p;
        this.qtdEstoque = e;
    }

    public void setPreco(double novoPreco) {
        this.preco = novoPreco;
    }

    public double getPreco() {
        return this.preco;
    }

    public void setEstoque(int novoEstoque) {
        this.qtdEstoque = novoEstoque;
    }

    public int getEstoque() {
        return this.qtdEstoque;
    }
}
